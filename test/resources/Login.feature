#Author:Payal Raghatate
#Feature: Login feature of Mercury Tours Application
#Date:27/04/2019



Feature: Login feature
  User wants to login into mercury tours applicatin
  
Background: User access login page of Mercury Tours Application
           When user opens "chrome" browser
           And user enters application url "http://newtours.demoaut.com/mercurywelcome.php"
           And user waits "25" seconds to login page to be loaded
           And user maximizes chrome browser
           Then user is on login page
  @SmokeTest
  Scenario: Verify that valid user able to login into mercury tours application by using valid username and password
    Given user access login page 
    When user enters "ankita2" as username
    And user enteres "ankita2" as password
    And user clicks on Sign in button
    Then user is on Flight Finder page
    When user clicks on signoff button
    Then user is on Sign on page
     
