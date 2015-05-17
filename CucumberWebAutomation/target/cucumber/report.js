$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("github_login.feature");
formatter.feature({
  "id": "login-page",
  "description": "In order to test login page\r\nAs a Registered user\r\nI want to specify the login conditions",
  "name": "login Page",
  "keyword": "Feature",
  "line": 1
});
formatter.before({
  "duration": 25503179513,
  "status": "passed"
});
formatter.scenario({
  "id": "login-page;login-without-username-and-password",
  "description": "",
  "name": "login without username and password",
  "keyword": "Scenario",
  "line": 6,
  "type": "scenario"
});
formatter.step({
  "name": "user is on github homepage",
  "keyword": "Given ",
  "line": 7
});
formatter.step({
  "name": "user clicks on Sign in button",
  "keyword": "When ",
  "line": 8
});
formatter.step({
  "name": "user is displayed login screen",
  "keyword": "Then ",
  "line": 9
});
formatter.step({
  "name": "user clicks Sign in button",
  "keyword": "When ",
  "line": 10
});
formatter.step({
  "name": "user gets an error message \"Incorrect username or password.\"",
  "keyword": "Then ",
  "line": 11
});
formatter.match({
  "location": "GithubLoginSD.user_is_on_github_homepage()"
});
formatter.result({
  "duration": 576519721,
  "status": "passed"
});
formatter.match({
  "location": "GithubLoginSD.user_clicks_on_Sign_in_button()"
});
formatter.result({
  "duration": 409774507,
  "status": "passed"
});
formatter.match({
  "location": "GithubLoginSD.user_is_displayed_login_screen()"
});
formatter.result({
  "duration": 2916475089,
  "status": "passed"
});
formatter.match({
  "location": "GithubLoginSD.user_clicks_Sign_in_button()"
});
formatter.result({
  "duration": 1879583712,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Incorrect username or password.",
      "offset": 28
    }
  ],
  "location": "GithubLoginSD.user_gets_an_error_message(String)"
});
formatter.result({
  "duration": 316238544,
  "status": "passed"
});
formatter.after({
  "duration": 1061962931,
  "status": "passed"
});
});