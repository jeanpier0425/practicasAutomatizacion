Feature: Register a user
  I as user
  I want to register me

  Scenario Outline: Register in the page
    Given The user opens the page
    When  The user tries of register with the email <email>
    Then The user should see that success register

    Examples:
      | email                  |
      | leider2021@yopmail.com |
