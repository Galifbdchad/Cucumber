
Feature: contact to agiletrailblazers

 Keywords Summary : This test will verify contact related scenario to agiletrailblazers.com
 
 
  Scenario: contact with valid credintials
  
    Given user navigated to agiletrailblazers.com
    When user enter Name as "USERNAME"
    And enter Email as "Email@email.com"
    And enter Phone number as "000000"
    And enter Office number as "1111111"
    And select from the dropdown menu as "Agile"
    And write message in message box as "Please contact with me" 
    And click on submit button
    Then submit should be successful 

