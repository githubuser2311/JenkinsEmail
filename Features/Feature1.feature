#Author: sridevibalaji7@gmail.com


Feature: Login Feature

Background: Launching the application before each testcase
Given User launch the application
  Scenario: Login application with valid username and password
  Given User is on "LoginPage"
    Then User verify the title "Login | Salesforce"
    Then User enter into the textbox "username" "sridevi@dayalan.com"
    Then User enter into the textbox "password" "Giveme5$"
        Then User click on the button "loginButton"

  
    

