$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("sample.feature");
formatter.feature({
  "id": "home-page",
  "tags": [
    {
      "name": "@important",
      "line": 1
    }
  ],
  "description": "",
  "name": "Home Page",
  "keyword": "Feature",
  "line": 2
});
formatter.scenario({
  "id": "home-page;home-page-default-content",
  "tags": [
    {
      "name": "@sanity",
      "line": 4
    }
  ],
  "description": "",
  "name": "Home Page Default content",
  "keyword": "Scenario",
  "line": 5,
  "type": "scenario"
});
formatter.step({
  "name": "user is on Application home page",
  "keyword": "Given ",
  "line": 6
});
formatter.step({
  "name": "user gets a github bootcamp section",
  "keyword": "Then ",
  "line": 7
});
formatter.match({
  "location": "LoginSteps.user_is_on_Application_home_page()"
});
formatter.result({
  "duration": 322563125,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_gets_a_github_bootcamp_section()"
});
formatter.result({
  "duration": 2146215,
  "status": "failed",
  "error_message": "junit.framework.AssertionFailedError\r\n\tat junit.framework.Assert.fail(Assert.java:55)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:22)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:31)\r\n\tat com.StepDefinitions.LoginSteps.user_gets_a_github_bootcamp_section(LoginSteps.java:158)\r\n\tat ✽.Then user gets a github bootcamp section(sample.feature:7)\r\n"
});
formatter.scenario({
  "id": "home-page;top-banner-content",
  "tags": [
    {
      "name": "@sanity",
      "line": 15
    },
    {
      "name": "@regression",
      "line": 15
    }
  ],
  "description": "",
  "name": "Top Banner content",
  "keyword": "Scenario",
  "line": 16,
  "type": "scenario"
});
formatter.step({
  "name": "user is on Application home page",
  "keyword": "Given ",
  "line": 17
});
formatter.step({
  "name": "user focuses on Top Banner",
  "keyword": "When ",
  "line": 18
});
formatter.step({
  "name": "user gets an option of home page",
  "keyword": "Then ",
  "line": 19
});
formatter.match({
  "location": "LoginSteps.user_is_on_Application_home_page()"
});
formatter.result({
  "duration": 67325,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_focuses_on_Top_Banner()"
});
formatter.result({
  "duration": 37769,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_gets_an_option_of_home_page()"
});
formatter.result({
  "duration": 17652,
  "status": "passed"
});
});