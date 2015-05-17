$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("github_logn.feature");
formatter.feature({
  "id": "github-login",
  "description": "",
  "name": "github login",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "github-login;login-without-username-and-password",
  "description": "",
  "name": "login without username and password",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "user is on github homepage",
  "keyword": "Given ",
  "line": 4
});
formatter.step({
  "name": "user clicks on Sign in button",
  "keyword": "When ",
  "line": 5
});
formatter.step({
  "name": "user is displayed login screen",
  "keyword": "Then ",
  "line": 6
});
formatter.match({
  "location": "GithubLoginSD.user_is_on_github_homepage()"
});
formatter.result({
  "duration": 29367864883,
  "status": "passed"
});
formatter.match({
  "location": "GithubLoginSD.user_clicks_on_Sign_in_button()"
});
formatter.result({
  "duration": 373767359,
  "status": "passed"
});
formatter.match({
  "location": "GithubLoginSD.user_is_displayed_login_screen()"
});
formatter.result({
  "duration": 2146763840,
  "status": "passed"
});
});