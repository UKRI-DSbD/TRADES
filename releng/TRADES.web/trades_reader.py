import numpy as np
import pandas as pd
from bs4 import BeautifulSoup
from xml_utils import get_node_from_string, get_node_by_id_tag_owner, get_threat_by_id

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
                    component_type_id = component.get('componentTypes')
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
        df = pd.DataFrame(data=np.array(impact_difficulty_table), columns=['Component Type', 'Component', 'Threat', 'Impact', 'Difficulty'])
        return df
    
    def get_rule_table(self):
        with open(self.filepath, 'r') as trades_file:
            data = trades_file.read()
            xml = BeautifulSoup(data, "xml")
            trades = xml.find('TRADES:Analysis')
            output = []
            rule_owner = trades.find('ruleOwner', recursive=False)
            for rule in rule_owner.find_all('rule', recursive=False):
                output.append(rule.get('name'))
            return output

    def get_rule_df(self):
        rule_table = self.get_rule_table()
        df = pd.DataFrame(data=np.array(rule_table), columns=['Rule'])
        return df

    def get_component_type_table(self):
        with open(self.filepath, 'r') as trades_file:
            data = trades_file.read()
            xml = BeautifulSoup(data, "xml")
            trades = xml.find('TRADES:Analysis')
            output = []
            component_type_owner = trades.find('componentTypeOwner', recursive=False)
            for component_type in component_type_owner.find_all('componentTypes', recursive=False):
                output.append(component_type.get('name'))
            return output
    
    def get_component_type_df(self):
        component_type_table = self.get_component_type_table()
        df = pd.DataFrame(data=np.array(component_type_table), columns=['Component Type'])
        return df

    def get_threat_table(self):
        with open(self.filepath, 'r') as trades_file:
            data = trades_file.read()
            xml = BeautifulSoup(data, "xml")
            trades = xml.find('TRADES:Analysis')
            output = []
            threat_owner = trades.find('threatOwner', recursive=False)
            for internal_threat in threat_owner.find_all('internals', recursive=False):
                threat_allocation_id = internal_threat.get('threatAllocations')
                for allocation_node in get_node_from_string('threatAllocations', threat_allocation_id, self.filepath):
                    output.append(['Internal', internal_threat.get('name'), allocation_node != None, ''])
            for external_threat in threat_owner.find_all('externals', recursive=False):
                threat_allocation_id = external_threat.get('threatAllocations')
                for allocation_node in get_node_from_string('threatAllocations', threat_allocation_id, self.filepath):
                    output.append(['External', external_threat.get('name'), allocation_node != None, external_threat.get('id')])
            return output
    
    def get_threat_df(self):
        threat_table = self.get_threat_table()
        df = pd.DataFrame(data=np.array(threat_table), columns=['Threat Type', 'Threat', 'Has Threat Allocation', 'Threat ID'])
        return df

    def get_internal_control_table(self):
        with open(self.filepath, 'r') as trades_file:
            data = trades_file.read()
            xml = BeautifulSoup(data, "xml")
            trades = xml.find('TRADES:Analysis')
            output = []
            control_owner = trades.find('controlOwner', recursive=True)
            for internal_control in control_owner.find_all('internals', recursive=False):
                mitigation_relation_node = internal_control.find('mitigationRelations', recursive=False)
                if mitigation_relation_node != None:
                    mitigated_allocation_id = mitigation_relation_node.get('mitigatedAllocation')
                    threat_id = mitigation_relation_node.get('threat')
                    threat_string = ''
                    if threat_id != None:
                        threat_node = get_threat_by_id(self.filepath, threat_id)
                        threat_string = threat_node.get('name')
                    output.append([internal_control.get('name'), mitigated_allocation_id != None, threat_string])
                else:
                    output.append([internal_control.get('name'), False, ''])
            return output
    
    def get_internal_control_df(self):
        control_table = self.get_internal_control_table()
        if control_table == []:
            return pd.DataFrame()
        else:
            df = pd.DataFrame(data=np.array(control_table), columns=['Internal Control', 'Has Mitigated Allocation', 'Threat'])
            return df

    def get_external_control_table(self):
        with open(self.filepath, 'r') as trades_file:
            data = trades_file.read()
            xml = BeautifulSoup(data, "xml")
            trades = xml.find('TRADES:Analysis')
            output = []
            control_owner = trades.find('controlOwner', recursive=False)
            for external_control in control_owner.find_all('externals', recursive=False):
                mitigation_relation_node = external_control.find('mitigationRelations', recursive=False)
                if mitigation_relation_node != None:
                    threat_id = mitigation_relation_node.get('threat')
                    for threat_node in get_node_from_string('threat', threat_id, self.filepath):
                        output.append([external_control.get('name'), threat_node.get('name')])
                else:
                    output.append([external_control.get('name'), ''])
            return output
    
    def get_external_control_df(self):
        control_table = self.get_external_control_table()
        if control_table == []:
            return pd.DataFrame()
        else:
            df = pd.DataFrame(data=np.array(control_table), columns=['External Control', 'Threat'])
            return df
    
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