Feature: To test end to end functionality of banking application

  @login
  Scenario: Test Login function of a Banking application
    Given Login url of the application
    When User enters username as "user_name"
    And User enters password as "manager_password"
    Then User should be logged in successfully

  @new_customer
  Scenario: Creation of new customer record
    Given Manager is logged in
    When Manager clicks New Customer link
    And Manager enters values in the given fields
    And User clicks the submit button
    Then New customer record should be created successfully