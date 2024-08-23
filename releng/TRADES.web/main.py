#https://blog.streamlit.io/how-to-build-a-real-time-live-dashboard-with-streamlit/
#to run this file, [streamlit run main.py] on the command line.

import streamlit as st
from visualisations import Visualisation
from upload_utils import save_uploaded_files

st.set_page_config(
    page_title="Real-Time Data Science Dashboard",
    page_icon="✅",
    layout="wide",
)

st.title("Real-Time / Live Data Science Dashboard")

placeholder = st.empty()

uploaded_trades_file = st.file_uploader("Choose a *.trades file")
uploaded_aird_file = st.file_uploader("Choose a *.aird file")
(aird_file, trades_file) = save_uploaded_files(uploaded_aird_file, uploaded_trades_file)

visualisation = Visualisation(aird_file, trades_file)

st.button(label='Generate', on_click=visualisation.render)


