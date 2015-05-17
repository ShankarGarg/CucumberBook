$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AgileNCR.feature");
formatter.feature({
  "id": "agile-ncr-app",
  "description": "In order to look at Agile NCR Conference\r\nAs a Registered user\r\nI want to specify the flow to Agenda and Speakers",
  "name": "Agile NCR App",
  "keyword": "Feature",
  "line": 1
});
formatter.before({
  "duration": 43328247406,
  "status": "passed"
});
formatter.scenario({
  "id": "agile-ncr-app;agenda",
  "description": "",
  "name": "Agenda",
  "keyword": "Scenario",
  "line": 6,
  "type": "scenario"
});
formatter.step({
  "name": "user is on AgileNCR Home Page",
  "keyword": "Given ",
  "line": 7
});
formatter.step({
  "name": "user gets an option Agenda",
  "keyword": "Then ",
  "line": 8
});
formatter.step({
  "name": "user selects Agenda",
  "keyword": "When ",
  "line": 9
});
formatter.step({
  "name": "user is on Agenda Screen",
  "keyword": "Then ",
  "line": 10
});
formatter.step({
  "name": "user chooses to go back",
  "keyword": "When ",
  "line": 11
});
formatter.step({
  "name": "user is on AgileNCR Home Page",
  "keyword": "Then ",
  "line": 12
});
formatter.match({
  "location": "AgileNCRSD.user_is_on_AgileNCR_Home_Page()"
});
formatter.result({
  "duration": 14137685005,
  "status": "passed"
});
formatter.match({
  "location": "AgileNCRSD.user_gets_an_option_Agenda()"
});
formatter.result({
  "duration": 2188296742,
  "status": "passed"
});
formatter.match({
  "location": "AgileNCRSD.user_selects_Agenda()"
});
formatter.result({
  "duration": 3729862061,
  "status": "passed"
});
formatter.match({
  "location": "AgileNCRSD.user_is_on_Agenda_Screen()"
});
formatter.result({
  "duration": 16386371240,
  "status": "passed"
});
formatter.match({
  "location": "AgileNCRSD.user_chooses_to_go_back()"
});
formatter.result({
  "duration": 4755665684,
  "status": "passed"
});
formatter.match({
  "location": "AgileNCRSD.user_is_on_AgileNCR_Home_Page()"
});
formatter.result({
  "duration": 3923702050,
  "status": "passed"
});
formatter.after({
  "duration": 7715084585,
  "status": "passed"
});
});