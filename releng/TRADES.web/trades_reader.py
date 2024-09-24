import numpy as np
import pandas as pd
from bs4 import BeautifulSoup
from xml_utils import get_node_by_id_tag_owner, get_threat_by_id, get_controls

class TradesReader:
    def __init__(self, filepath = "opendef.trades"):
        self.filepath = filepath

    def get_threat_allocation_table(self):
        with open(self.filepath, 'r') as trades_file:
            data = trades_file.read()
            xml = BeautifulSoup(data, "xml")
            trades = xml.find('TRADES:Analysis')
            output = []
            for component in trades.find_all('components'):
                for threat_allocation in component.find_all('threatAllocations', recursive=False):
                    threat_id = threat_allocation.get('threat')
                    threat_node = get_threat_by_id(self.filepath, threat_id)
                    component_type_ids = component.get('componentTypes')
                    if component_type_ids != None:
                        for component_type_id in component_type_ids.split(' '):
                            component_node = get_node_by_id_tag_owner('componentTypeOwner', 'componentTypes', component_type_id, self.filepath)
                            impact_score_id = threat_allocation.get('impactScore')
                            difficulty_score_id = threat_allocation.get('difficultyScore')
                            if (impact_score_id != None) and (difficulty_score_id != None):
                                impact_node = get_node_by_id_tag_owner('scoreSystem', 'impactScores', impact_score_id, self.filepath)
                                difficulty_node = get_node_by_id_tag_owner('scoreSystem', 'difficultyScores', difficulty_score_id, self.filepath)
                                output.append([component_node.get('name'), component.get('name'), threat_node.get('name'), impact_node.get('name'), difficulty_node.get('name')])
                            else:
                                output.append([component_node.get('name'), component.get('name'), threat_node.get('name'), '', ''])
            return output

    def get_risk_dictionary(self):
        with open(self.filepath, 'r') as trades_file:
            data = trades_file.read()
            xml = BeautifulSoup(data, "xml")
            trades = xml.find('TRADES:Analysis')
            output = {}
            for threat_allocation in trades.find_all('threatAllocations'):
                threat_id = threat_allocation.get('threat')
                threat_node = get_threat_by_id(self.filepath, threat_id)
                impact_score_id = threat_allocation.get('impactScore')
                difficulty_score_id = threat_allocation.get('difficultyScore')
                if (impact_score_id != None) and (difficulty_score_id != None):
                    impact_node = get_node_by_id_tag_owner('scoreSystem', 'impactScores', impact_score_id, self.filepath)
                    difficulty_node = get_node_by_id_tag_owner('scoreSystem', 'difficultyScores', difficulty_score_id, self.filepath)
                    if (impact_node.get('name'), difficulty_node.get('name')) in output.keys():
                        output[impact_node.get('name'), difficulty_node.get('name')].append(threat_node.get('name'))
                    else:
                        output[impact_node.get('name'), difficulty_node.get('name')] = [threat_node.get('name')]
            return output

    def get_threat_allocation_df(self):
        impact_difficulty_table = self.get_threat_allocation_table()
        if len(impact_difficulty_table) > 0:
            df = pd.DataFrame(data=np.array(impact_difficulty_table), columns=['Component Type', 'Component', 'Threat', 'Impact', 'Difficulty'])
            return df
        raise ValueError('No impacts or difficulties.')
    
    def get_tree_df(self):
        with open(self.filepath, 'r') as trades_file:
            data = trades_file.read()
            xml = BeautifulSoup(data, "xml")
            trades = xml.find('TRADES:Analysis')
            output = []
            for tuple in self.get_component_children(trades, self.filepath):
                output.append(tuple)

            return pd.DataFrame(data=output, columns=['Child Name', 'Child Type', 'Relationship Type', 'Parent Name', 'Parent Type'])
        
    def get_tree_array(self):
        with open(self.filepath, 'r') as trades_file:
            data = trades_file.read()
            xml = BeautifulSoup(data, "xml")
            trades = xml.find('TRADES:Analysis')
            output = []
            for tuple in self.get_component_children(trades, self.filepath):
                output.append(tuple)

            return output

    def get_component_children(self, node, filepath):
        output = []
        parent_name = node.get('name')
        #Component
        for component in node.find_all('components', recursive=False):
            output.append((component.get('name'), 'Component', 'contains', parent_name, 'Component'))
            nested_component = self.get_component_children(component, filepath)
            if nested_component != None:
                for tuple in nested_component:
                    output.append(tuple)
            #ThreatAllocationRelation
            for allocation in component.find_all('threatAllocations', recursive=False):
                threat = get_threat_by_id(self.filepath, allocation.get('threat'))
                if threat != None:
                    output.append((threat.get('name'), 'Threat Allocation Relation', 'vulnerable to', component.get('name'), 'Component'))
        #Control
        for control_owner in node.find_all('controlOwner', recursive=False):
            #(Internal) Controls
            for internal in control_owner.find_all('internals', recursive=False):
                output.append((internal.get('name'), 'Control', 'implements', parent_name, 'Component'))
                #ThreatMitigationRelation
                for mitigation in internal.find_all('mitigationRelations', recursive=False):
                    threat = get_threat_by_id(self.filepath, mitigation.get('threat'))
                    if threat != None:
                        output.append((threat.get('name'), 'Threat Mitigation Relation', 'mitigates', internal.get('name'), 'Control'))
            #(External) Control
            for external in control_owner.find_all('externals', recursive=False):
                output.append((external.get('name'), 'Control', 'implements', parent_name, 'Component'))
        return output
        
    def get_mermaid_array(self):
        with open(self.filepath, 'r') as trades_file:
            data = trades_file.read()
            xml = BeautifulSoup(data, "xml")
            trades = xml.find('TRADES:Analysis')
            output = []
            for tuple in self.get_mermaid_children(trades):
                output.append(tuple)

            return output

    def get_mermaid_children(self, node):
        output = []
        #Score System
        for score in node.find_all('scoreSystem', recursive=False):
            #Impact
            for impact in score.find_all('impactScores', recursive=False):
                id = impact.get('xmi:id')
                output.append(('impact', id, impact.get('name'), impact.get('impact')))
            #Difficulty
            for difficulty in score.find_all('difficultyScores', recursive=False):
                id = difficulty.get('xmi:id')
                output.append(('difficulty', id, difficulty.get('name'), difficulty.get('difficulty')))
        #Component Types
        for component_type_owner in node.find_all('componentTypeOwner', recursive=False):
            for componentType in component_type_owner.find_all('componentTypes', recursive=False):
                id = componentType.get('xmi:id')
                output.append(('component type', id, componentType.get('name')))
        #Vulnerabilities
        for vulnerability_owner in node.find_all('vulnerabilityOwner', recursive=False):
            for vulnerability in vulnerability_owner.find_all('vulnerabilities', recursive=False):
                id = vulnerability.get('xmi:id')
                output.append(('vulnerability', id, vulnerability.get('name')))
                output.append(('affects', id, 'affects', vulnerability.get('affects')))
        #Threats
        for threat_owner in node.find_all('threatOwner', recursive=False):
            for internal in threat_owner.find_all('internals', recursive=False):
                id = internal.get('xmi:id')
                output.append(('threat', id, internal.get('name')))
                if internal.get('exploitsVulnerability') != None:
                    for vulnerability_id in internal.get('exploitsVulnerability').split(' '):
                        output.append(('exploits', id, 'exploits', vulnerability_id))
            for external in threat_owner.find_all('externals', recursive=False):
                id = external.get('xmi:id')
                output.append(('threat', id, external.get('name')))
                for vulnerability_id in external.get('exploitsVulnerability').split(' '):
                    output.append(('exploits', id, 'exploits', vulnerability_id))
        #Controls
        for control_tuple in get_controls(node):
            output.append(control_tuple)
        #Rules
        for rule_owner in node.find_all('ruleOwner', recursive=False):
            for rule in rule_owner.find_all('rules'):
                id = rule.get('xmi:id')
                output.append(('rule', id, 'Rule'))
                if rule.get('vulnerabilities') != None:
                    output.append(('rule_part', id, 'related to', rule.get('vulnerabilities')))
                if rule.get('componentTypesAffected') != None:
                    output.append(('rule_part', id, 'affects', rule.get('componentTypesAffected')))
                if rule.get('controls') != None:
                    output.append(('rule_part', id, 'uses', rule.get('controls')))
        #Component
        for component in node.find_all('components', recursive=True):
            id = component.get('xmi:id')
            output.append(('component', id, component.get('name')))
            if component.get('componentTypes') != None:
                for type in component.get('componentTypes').split(' '):
                    output.append(('type of component', id, 'has type', type))
            #Controls
            for control_tuple in get_controls(component):
                output.append(control_tuple)
            #Threat Allocation
            for allocation in component.find_all('threatAllocations', recursive=False):
                output.append(('threatAllocation', allocation.get('threat'), 'allocated to', id))
        
        return output
