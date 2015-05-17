$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("REST_Services.feature");
formatter.feature({
  "id": "soa-test",
  "description": "In order to test rest services\r\nAs a Registered user\r\nI want to specify the rest services test conditions",
  "name": "SOA Test",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "soa-test;get-request---git-hub-user-details",
  "description": "",
  "name": "GET Request - GIT Hub User details",
  "keyword": "Scenario",
  "line": 6,
  "type": "scenario"
});
formatter.step({
  "name": "user sends a GET request with \"https://api.github.com/users/ShankarGarg\"",
  "keyword": "When ",
  "line": 7
});
formatter.step({
  "name": "status code should be 200",
  "keyword": "Then ",
  "line": 8
});
formatter.step({
  "name": "response type should be \"json\"",
  "keyword": "And ",
  "line": 9
});
formatter.step({
  "name": "response contains user name \"Shankar Garg\"",
  "keyword": "And ",
  "line": 10
});
formatter.match({
  "arguments": [
    {
      "val": "https://api.github.com/users/ShankarGarg",
      "offset": 31
    }
  ],
  "location": "RestServicesSD.user_sends_a_GET_request_with(String)"
});
formatter.result({
  "duration": 2296465795,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 22
    }
  ],
  "location": "RestServicesSD.status_code_should_be(int)"
});
formatter.result({
  "duration": 2032072,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "json",
      "offset": 25
    }
  ],
  "location": "RestServicesSD.response_type_should_be(String)"
});
formatter.result({
  "duration": 1165465,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shankar Garg",
      "offset": 29
    }
  ],
  "location": "RestServicesSD.response_contains_user_name(String)"
});
formatter.result({
  "duration": 1753329,
  "status": "passed"
});
formatter.scenario({
  "id": "soa-test;post-request---register-a-user",
  "description": "",
  "name": "POST Request - Register a user",
  "keyword": "Scenario",
  "line": 12,
  "type": "scenario"
});
formatter.step({
  "name": "user sends a POST request to \"https://selfsolve.apple.com/wcResults.do\" with follwoing details",
  "keyword": "When ",
  "line": 13,
  "rows": [
    {
      "cells": [
        "key",
        "value"
      ],
      "line": 14
    },
    {
      "cells": [
        "sn",
        "C2WGC14ADRJ7"
      ],
      "line": 15
    },
    {
      "cells": [
        "cn",
        ""
      ],
      "line": 16
    },
    {
      "cells": [
        "locale",
        ""
      ],
      "line": 17
    },
    {
      "cells": [
        "caller",
        ""
      ],
      "line": 18
    },
    {
      "cells": [
        "num",
        "12345"
      ],
      "line": 19
    }
  ]
});
formatter.step({
  "name": "status code should be 200",
  "keyword": "Then ",
  "line": 20
});
formatter.step({
  "name": "response type should be \"html\"",
  "keyword": "And ",
  "line": 21
});
formatter.step({
  "name": "response contains user name \"C2WGC14ADRJ7\"",
  "keyword": "And ",
  "line": 22
});
formatter.match({
  "arguments": [
    {
      "val": "https://selfsolve.apple.com/wcResults.do",
      "offset": 30
    }
  ],
  "location": "RestServicesSD.user_sends_a_POST_request_to_with_follwoing_details(String,DataTable)"
});
formatter.result({
  "duration": 1673617995,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 22
    }
  ],
  "location": "RestServicesSD.status_code_should_be(int)"
});
formatter.result({
  "duration": 137113,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "html",
      "offset": 25
    }
  ],
  "location": "RestServicesSD.response_type_should_be(String)"
});
formatter.result({
  "duration": 122745,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "C2WGC14ADRJ7",
      "offset": 29
    }
  ],
  "location": "RestServicesSD.response_contains_user_name(String)"
});
formatter.result({
  "duration": 745093,
  "status": "passed"
});
});