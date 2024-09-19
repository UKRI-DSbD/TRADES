from bs4 import BeautifulSoup
from xml_utils import get_node_from_string, get_impact_name_from_configuration_id

class AirdReader:
    def __init__(self, representations_filepath = "uploaded.aird", trades_filepath = "uploaded.trades"):
        self.trades_filepath = trades_filepath
        self.representations_filepath = representations_filepath

    def get_cell_colours(self):
        output = {}
        with open(self.representations_filepath, 'r') as trades_file:
            data = trades_file.read()
            xml = BeautifulSoup(data, "xml")
            cells = xml.find_all('cells', recursive=True)
            for cell in cells:
                target_node = cell.find('target', recursive=False)
                configuration_id = target_node.get('href').replace(self.trades_filepath + "#", "")
                configuration_node = get_node_from_string('configurations', configuration_id, self.trades_filepath)
                difficulty_id = configuration_node.get('difficulty')
                difficulty_node = get_node_from_string('difficultyScores', difficulty_id, self.trades_filepath)
                difficulty_name = difficulty_node.get('name')
                current_style = cell.find('currentStyle', recursive=False)
                colour = self.normalise_colour(current_style.get('backgroundColor'))
                impact_name = get_impact_name_from_configuration_id(configuration_node.get("xmi:id"), self.trades_filepath)
                output[impact_name, difficulty_name] = colour
        return output

    def normalise_colour(self, colour):
        if colour == None:
            return (1.0, 1.0, 1.0, 1.0)
        current_word = ''
        red = float(-1.0)
        blue = float(-1.0)
        green = float(-1.0)
        alpha = float(1.0)
        for char in colour + ',': #comma allows green to be populated in the loop
            if char == ',':
                decimal = round(int(current_word) / 255, 1)
                if red == float(-1.0):
                    red = float(decimal)
                elif blue == float(-1.0):
                    blue = float(decimal)
                else:
                    green = float(decimal)
                current_word = ''
            else:
                current_word = current_word + char
        if green != float(-1.0):
            return (red, blue, green, alpha)
        else:
            return (1.0, 1.0, 1.0, 1.0)
