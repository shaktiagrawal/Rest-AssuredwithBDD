$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/feature/tests.feature");
formatter.feature({
  "name": "Testing a dummy API",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Get all employees data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the baseURI is \"baseURI\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the endpoint is \"endPoint\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user sends a get request on \"\u003cpath\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the response code should be \u003cstatus\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "show the response data",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "path",
        "status"
      ]
    },
    {
      "cells": [
        "employees",
        "200"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Get all employees data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the baseURI is \"baseURI\"",
  "keyword": "Given "
});
formatter.match({
  "location": "functions.stepDef.the_baseURI_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the endpoint is \"endPoint\"",
  "keyword": "When "
});
formatter.match({
  "location": "functions.stepDef.the_endpoint_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user sends a get request on \"employees\"",
  "keyword": "And "
});
formatter.match({
  "location": "functions.stepDef.the_user_sends_a_get_request_on(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the response code should be 200",
  "keyword": "Then "
});
formatter.match({
  "location": "functions.stepDef.the_response_code_should_be(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "show the response data",
  "keyword": "And "
});
formatter.match({
  "location": "functions.stepDef.show_the_response_data()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Create new record in database",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the baseURI is \"baseURI\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the endpoint is \"endPoint\"",
  "keyword": "When "
});
formatter.step({
  "name": "the following data:",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "name",
        "Shakti"
      ]
    },
    {
      "cells": [
        "salary",
        "15000"
      ]
    },
    {
      "cells": [
        "age",
        "24"
      ]
    }
  ]
});
formatter.step({
  "name": "the user sends a post request on \"\u003cpath\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the response code should be \u003cstatus\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "path",
        "status"
      ]
    },
    {
      "cells": [
        "create",
        "200"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create new record in database",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the baseURI is \"baseURI\"",
  "keyword": "Given "
});
formatter.match({
  "location": "functions.stepDef.the_baseURI_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the endpoint is \"endPoint\"",
  "keyword": "When "
});
formatter.match({
  "location": "functions.stepDef.the_endpoint_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the following data:",
  "rows": [
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "functions.stepDef.the_following_data(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user sends a post request on \"create\"",
  "keyword": "And "
});
formatter.match({
  "location": "functions.stepDef.the_user_sends_a_post_request_on(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the response code should be 200",
  "keyword": "Then "
});
formatter.match({
  "location": "functions.stepDef.the_response_code_should_be(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
});