#https://docs.streamlit.io/library/api-reference/charts
import plotly.express as px
import streamlit as st
import matplotlib.pyplot as plt
import graphviz
import streamlit_mermaid as stmd

class Visualisation():
    def __init__(self, aird_reader, trades_reader):
        self.aird = aird_reader
        self.trades = trades_reader

    def draw_risk_matrix_table(self):
        risk_dictionary = self.trades.get_risk_dictionary()
        colours = self.aird.get_cell_colours()
        impacts = ['Low', 'Medium', 'High']
        difficulties = ['Low', 'Medium', 'High']

        fig, axes = plt.subplots(nrows=len(impacts), ncols=len(difficulties))
        plt.subplots_adjust(wspace=0, hspace=0)
        fig.supxlabel('Difficulty')
        fig.supylabel('Impact')
        fig.suptitle('Risk Matrix')

        for i in range(len(impacts)):
            for j in range(len(difficulties)):
                impact = impacts[2-i]
                difficulty = difficulties[j]
                key = (impact, difficulty)
                colour = colours[key]
                axes[i, j].set_facecolor(colour)
                number_of_threats = 0
                if key in risk_dictionary.keys():
                    number_of_threats = len(risk_dictionary[key])
                axes[i, j].text(1.5, 1.4, str(number_of_threats))
                if i == 2:
                    axes[i, j].set_xlabel(difficulty)
                if j == 0:
                    axes[i, j].set_ylabel(impact)
                axes[i, j].set_xticks([])
                axes[i, j].set_yticks([])
                axes[i, j].set_xlim(0,3)
                axes[i, j].set_ylim(0,3)

        return fig

    def draw_risk_matrix(self, color_continuous_scale):
        df = self.trades.get_threat_allocation_df()
        return px.density_heatmap(data_frame=df, y="Impact", x="Difficulty", text_auto=True, color_continuous_scale=color_continuous_scale)

    def list_threat_allocations(self):
        impact_difficulty_df = self.trades.get_threat_allocation_df()
        st.dataframe(impact_difficulty_df)

    def list_tree(self):
        tree_df = self.trades.get_tree_df()
        st.dataframe(tree_df)

    def network_tree(self):
        graph = graphviz.Digraph()
        graph.attr(size='30,30')
        for row in self.trades.get_tree_array():
            child_name = row[0]
            child_type = row[1]
            relationship_type = row[2]
            parent_name = row[3]
            parent_type = row[4]
            if child_name == None:
                child_name = ''
            if child_type == None:
                child_type = ''
            else:
                child_type = child_type + ': '
            if relationship_type == None:
                relationship_type = ''
            if parent_name == None:
                parent_name = ''
            if parent_type == None:
                parent_type = ''
            else:
                parent_type = parent_type + ': '
            graph.edge(parent_name, child_name, label=relationship_type)
        st.graphviz_chart(graph)

    def mermaid_network(self):
        mermaid_string = 'graph TD'
        for row in self.trades.get_mermaid_array():
            child_type = row[0]
            child_id = row[1]
            child_name = row[2]
            if child_type == 'impact':
                mermaid_string = mermaid_string + '\n\t' + child_id + '[' + child_name + '-' + child_type + ':' + row[3] + ']'
            elif child_type == 'difficulty':
                mermaid_string = mermaid_string + '\n\t' + child_id + '[' + child_name + '-' + child_type + ':' + row[3] + ']'
            elif child_type == 'component type':
                mermaid_string = mermaid_string + '\n\t' + child_id + '(' + child_name + ')'
            elif child_type == 'vulnerability':
                mermaid_string = mermaid_string + '\n\t' + child_id + '{' + child_name + '}'
            elif child_type == 'affects':
                mermaid_string = mermaid_string + '\n\t' + child_id + ' -->|' + child_name + '| ' + row[3]
            elif child_type == 'threat':
                mermaid_string = mermaid_string + '\n\t' + child_id + '((' + child_name + '))'
            elif child_type == 'threatAllocation':
                mermaid_string = mermaid_string + '\n\t' + child_id + ' -->|' + child_name + '| ' + row[3]
            elif child_type == 'exploits':
                mermaid_string = mermaid_string + '\n\t' + child_id + ' -->|' + child_name + '| ' + row[3]
            elif child_type == 'control':
                mermaid_string = mermaid_string + '\n\t' + child_id + '[(' + child_name + ')]'
            elif child_type == 'mitigates':
                mermaid_string = mermaid_string + '\n\t' + child_id + ' -->|' + child_name + '| ' + row[3]
            elif child_type == 'rule':
                mermaid_string = mermaid_string + '\n\t' + child_id + '[/' + child_name + '/]'
            elif child_type == 'rule_part':
                mermaid_string = mermaid_string + '\n\t' + child_id + ' -->|' + child_name + '| ' + row[3]
            elif child_type == 'component':
                mermaid_string = mermaid_string + '\n\t' + child_id + '{{' + child_name + '}}'
            elif child_type == 'type of component':
                mermaid_string = mermaid_string + '\n\t' + child_id + ' -->|' + child_name + '| ' + row[3]

        mermaid = stmd.st_mermaid(mermaid_string)
        st.write(mermaid)
    
    def render(self):
        placeholder = st.empty()

        with placeholder.container():
            fig_col1, fig_col2 = st.columns(2)
            with fig_col1:
                st.markdown("### First Chart")
                try:
                    fig = self.draw_risk_matrix_table()
                    st.write(fig)
                except:
                    print('No impacts or difficulties found.')

            with fig_col2:
                st.markdown("### Second Chart")
                #https://plotly.com/python/builtin-colorscales/
                try:
                    fig = self.draw_risk_matrix('Emrld')
                    st.write(fig)
                except:
                    print('No impacts or difficulties found.')

            st.markdown("## Detailed Data View")
            impact_difficulty_col, tree_col = st.columns(2)
            with impact_difficulty_col:
                try:
                    self.list_threat_allocations()
                except:
                    print('No impacts or difficulties found.')                

            with tree_col:
                self.list_tree()

            self.network_tree()

            self.mermaid_network()