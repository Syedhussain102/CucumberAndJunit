$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/sreejon/eclipse-workspace/Cucumber_Framework1/features/facebookLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Test Facebook smoke scenario",
  "description": "",
  "id": "test-facebook-smoke-scenario",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Test login with valid credentials",
  "description": "",
  "id": "test-facebook-smoke-scenario;test-login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Open Chrome and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter valid \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "valid \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should be able to login successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "test-facebook-smoke-scenario;test-login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "test-facebook-smoke-scenario;test-login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "testuser13@gmail.com",
        "abcd1234"
      ],
      "line": 12,
      "id": "test-facebook-smoke-scenario;test-login-with-valid-credentials;;2"
    },
    {
      "cells": [
        "testuser131@gmail.com",
        "abcd2345"
      ],
      "line": 13,
      "id": "test-facebook-smoke-scenario;test-login-with-valid-credentials;;3"
    },
    {
      "cells": [
        "testuser132@gmail.com",
        "abcd3456"
      ],
      "line": 14,
      "id": "test-facebook-smoke-scenario;test-login-with-valid-credentials;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Test login with valid credentials",
  "description": "",
  "id": "test-facebook-smoke-scenario;test-login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Open Chrome and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter valid \"testuser13@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "valid \"abcd1234\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should be able to login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "DataDriven.open_Chrome_and_start_application()"
});
formatter.result({
  "duration": 3501048105,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testuser13@gmail.com",
      "offset": 15
    }
  ],
  "location": "DataDriven.i_enter_valid(String)"
});
formatter.result({
  "duration": 161174153,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcd1234",
      "offset": 7
    }
  ],
  "location": "DataDriven.valid(String)"
});
formatter.result({
  "duration": 927352650,
  "status": "passed"
});
formatter.match({
  "location": "DataDriven.user_should_be_able_to_login_successfully()"
});
formatter.result({
  "duration": 87039729,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Test login with valid credentials",
  "description": "",
  "id": "test-facebook-smoke-scenario;test-login-with-valid-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Open Chrome and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter valid \"testuser131@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "valid \"abcd2345\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should be able to login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "DataDriven.open_Chrome_and_start_application()"
});
formatter.result({
  "duration": 3626414482,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testuser131@gmail.com",
      "offset": 15
    }
  ],
  "location": "DataDriven.i_enter_valid(String)"
});
formatter.result({
  "duration": 162448200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcd2345",
      "offset": 7
    }
  ],
  "location": "DataDriven.valid(String)"
});
formatter.result({
  "duration": 1014825545,
  "status": "passed"
});
formatter.match({
  "location": "DataDriven.user_should_be_able_to_login_successfully()"
});
formatter.result({
  "duration": 89698579,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Test login with valid credentials",
  "description": "",
  "id": "test-facebook-smoke-scenario;test-login-with-valid-credentials;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Open Chrome and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter valid \"testuser132@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "valid \"abcd3456\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should be able to login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "DataDriven.open_Chrome_and_start_application()"
});
formatter.result({
  "duration": 2771718528,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testuser132@gmail.com",
      "offset": 15
    }
  ],
  "location": "DataDriven.i_enter_valid(String)"
});
formatter.result({
  "duration": 155539315,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcd3456",
      "offset": 7
    }
  ],
  "location": "DataDriven.valid(String)"
});
formatter.result({
  "duration": 1250277414,
  "status": "passed"
});
formatter.match({
  "location": "DataDriven.user_should_be_able_to_login_successfully()"
});
formatter.result({
  "duration": 86777896,
  "status": "passed"
});
});