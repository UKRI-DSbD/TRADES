%%% GENERAL %%%

% CVULNS: Collect all vulnerabilities that apply to a component based on its types
cvulns(Component, Vulnerabilities) :-
    component_type(Component, Types),
    findall(Vuln, (member(Type, Types), vulns(Type, Vulns), member(Vuln, Vulns)), VulnerabilityList),
    list_to_set(VulnerabilityList, Vulnerabilities).

% MitigatedV: Check if a vulnerability is mitigated by the controls of a component
mitigated_v(Vulnerability, Component) :-
    rule(_, Vulnerabilities, Types, Controls),
    member(Vulnerability, Vulnerabilities),
    component_type(Component, ComponentTypes),
    intersection(ComponentTypes, Types, CommonTypes),
    CommonTypes \= [],
    controls(Component, ComponentControls),
    forall(member(Control, Controls), member(Control, ComponentControls)).

% Mitigated: Check if a vulnerability is mitigated directly or indirectly
mitigated(Vulnerability, Component) :-
    mitigated_v(Vulnerability, Component).
mitigated(Vulnerability, Component) :-
    avulns(Vulnerability, HigherVulns),
    HigherVulns \= [],
    forall(member(HigherVuln, HigherVulns), mitigated(HigherVuln, Component)).

% Vulnerable: Check if a component has any unmitigated vulnerabilities
vulnerable(Component) :-
    cvulns(Component, Vulnerabilities),
    member(Vulnerability, Vulnerabilities),
    \+ mitigated(Vulnerability, Component).

% Property 1: Check if all components are not vulnerable
all_components_secure :-
    forall(component(Component), \+ vulnerable(Component)).
    