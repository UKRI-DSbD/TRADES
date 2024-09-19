from trades_reader import TradesReader
from aird_reader import AirdReader
from bs4 import BeautifulSoup
from io import StringIO

def save_uploaded_files(uploaded_aird_file, uploaded_trades_file):
    if uploaded_aird_file is not None and uploaded_trades_file is not None:
        save_uploaded_file(uploaded_aird_file.name, uploaded_aird_file)
        save_uploaded_file(uploaded_trades_file.name, uploaded_trades_file)
        return (AirdReader(uploaded_aird_file.name, uploaded_trades_file.name), TradesReader(uploaded_trades_file.name))
    return (AirdReader('uploaded.aird', 'uploaded.trades'), TradesReader('uploaded.trades'))
    
def save_uploaded_file(file_name, uploaded_file):
    if uploaded_file is not None:
        stringio = StringIO(uploaded_file.getvalue().decode("utf-8"))
        string_data = stringio.read()
        with open(file_name, 'w') as new_file:
            soup = BeautifulSoup(string_data, "xml")
            new_file.write(soup.prettify())
