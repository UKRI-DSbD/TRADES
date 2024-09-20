from bs4 import BeautifulSoup

def get_node_from_string(node_type, node_id, filepath):
    with open(filepath, 'r') as trades_file:
        data = trades_file.read()
        xml = BeautifulSoup(data, "xml")
        trades = xml.find('TRADES:Analysis')
        node = trades
        output = node.find_all(node_type, recursive=True)
        for node in output:
            if node_id == node.get('xmi:id'):
                return node

def get_impact_name_from_configuration_id(configuration_id, filepath):
    with open(filepath, 'r') as trades_file:
        data = trades_file.read()
        xml = BeautifulSoup(data, "xml")
        trades = xml.find('TRADES:Analysis')
        impact_nodes = trades.find_all("impactScores", recursive=True)
        for impact_node in impact_nodes:
            configurations = impact_node.find_all("configurations", recursive=False)
            for configuration_node in configurations:
                if configuration_node.get("xmi:id") == configuration_id:
                    return impact_node.get("name")

def get_node_by_id_tag_owner(owner_tag, node_tag, id, filepath):
    with open(filepath, 'r') as trades_file:
        data = trades_file.read()
        xml = BeautifulSoup(data, "xml")
        trades = xml.find('TRADES:Analysis')
        owner = trades.find(owner_tag, recursive=False)
        for node in owner.find_all(node_tag, recursive=False):
            if node.get('xmi:id') == id:
                return node

def get_threat_by_id(filepath, threat_id):
    with open(filepath, 'r') as trades_file:
        data = trades_file.read()
        xml = BeautifulSoup(data, "xml")
        trades = xml.find('TRADES:Analysis')
        threat_owner = trades.find('threatOwner', recursive=False)
        for internal_threat in threat_owner.find_all('internals', recursive=False):
            if internal_threat.get('xmi:id') == threat_id:
                return internal_threat
        for external_threat in threat_owner.find_all('externals', recursive=False):
            if external_threat.get('xmi:id') == threat_id:
                return external_threat
            
def get_controls(node):
    output = []
    for control_owner in node.find_all('controlOwner', recursive=False):
        for internal in control_owner.find_all('internals', recursive=False):
            id = internal.get('xmi:id')
            output.append(('control', id, internal.get('name')))
            for relation in internal.find_all('mitigationRelations', recursive=False):
                if relation.get('threat') != None:
                    output.append(('mitigates', id, 'mitigates', relation.get('threat')))
                if relation.get('mitigatedAllocation') != None:
                    output.append(('mitigates', id, 'mitigates', relation.get('mitigatedAllocation')))
                    
    return output