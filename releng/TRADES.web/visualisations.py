#https://docs.streamlit.io/library/api-reference/charts
import plotly.express as px
import streamlit as st
import matplotlib.pyplot as plt
import graphviz

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

    def list_rules(self):
        rule_df = self.trades.get_rule_df()
        st.dataframe(rule_df)

    def list_component_types(self):
        component_type_df = self.trades.get_component_type_df()
        st.dataframe(component_type_df)

    def list_threats(self):
        threat_df = self.trades.get_threat_df()
        st.dataframe(threat_df)

    def list_internal_controls(self):
        internal_control_df = self.trades.get_internal_control_df()
        st.dataframe(internal_control_df)

    def list_external_controls(self):
        external_control_df = self.trades.get_external_control_df()
        st.dataframe(external_control_df)

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
    
    def render(self):
        placeholder = st.empty()

        with placeholder.container():
            fig_col1, fig_col2 = st.columns(2)
            with fig_col1:
                st.markdown("### First Chart")
                fig = self.draw_risk_matrix_table()
                st.write(fig)

            with fig_col2:
                st.markdown("### Second Chart")
                #https://plotly.com/python/builtin-colorscales/
                fig = self.draw_risk_matrix('Emrld')
                st.write(fig)

            st.markdown("## Detailed Data View")
            #impact_difficulty_col, rule_col, component_type_col = st.columns(3)
            impact_difficulty_col, tree_col = st.columns(2)
            with impact_difficulty_col:
                self.list_threat_allocations()

            #with rule_col:
            #    list_rules()

            #with component_type_col:
            #    list_component_types()

            #threats_col, internal_controls_col, external_controls_col = st.columns(3)
            #with threats_col:
            #    list_threats()

            #with internal_controls_col:
            #    list_internal_controls()

            #with external_controls_col:
            #    list_external_controls()

            with tree_col:
                self.list_tree()

            self.network_tree()