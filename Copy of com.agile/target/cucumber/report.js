$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features.feature");
formatter.feature({
  "line": 2,
  "name": "contact to agiletrailblazers",
  "description": "\r\nKeywords Summary : This test will verify contact related scenario to agiletrailblazers.com",
  "id": "contact-to-agiletrailblazers",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "contact with valid credintials",
  "description": "",
  "id": "contact-to-agiletrailblazers;contact-with-valid-credintials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "user navigated to agiletrailblazers.com",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "user enter Name as \"USERNAME\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "enter Email as \"Email@email.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "enter Phone number as \"000000\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "enter Office number as \"1111111\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "select from the dropdown menu as \"Agile\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "write message in message box as \"Please contact with me\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "click on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "submit should be successful",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef1.user_navigated_to_agiletrailblazers_com()"
});
formatter.result({
  "duration": 5633843761,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "USERNAME",
      "offset": 20
    }
  ],
  "location": "StepDef1.user_enter_Name_as(String)"
});
formatter.result({
  "duration": 244381304,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Email@email.com",
      "offset": 16
    }
  ],
  "location": "StepDef1.enter_Email_as(String)"
});
formatter.result({
  "duration": 148670819,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "000000",
      "offset": 23
    }
  ],
  "location": "StepDef1.enter_Phone_number_as(String)"
});
formatter.result({
  "duration": 80098247,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1111111",
      "offset": 24
    }
  ],
  "location": "StepDef1.enter_Office_number_as(String)"
});
formatter.result({
  "duration": 71469000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Agile",
      "offset": 34
    }
  ],
  "location": "StepDef1.select_from_the_dropdown_menu_as(String)"
});
formatter.result({
  "duration": 81122625,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Please contact with me",
      "offset": 33
    }
  ],
  "location": "StepDef1.write_message_in_message_box_as(String)"
});
formatter.result({
  "duration": 107581270,
  "status": "passed"
});
formatter.match({
  "location": "StepDef1.click_on_submit_button()"
});
formatter.result({
  "duration": 65462434,
  "status": "passed"
});
formatter.match({
  "location": "StepDef1.submit_should_be_successful()"
});
formatter.result({
  "duration": 381029174,
  "status": "passed"
});
});