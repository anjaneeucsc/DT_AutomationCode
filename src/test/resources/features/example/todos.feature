Feature: Todos operation

  Scenario: Add multiple items to todo list
    Given User is on the todos page
    When input items to todo list
      | cook |
      | wash car |
      | buy foods |
    Then check items in todo list
      | cook |
      | wash car |
      | buy foods |
    And check item count is 3
    When navigates to Active todo list section
    And check item count is 3

  Scenario: Delete todo items before complete it
    Given User is on the todos page
    When input items to todo list
      | go to the bank |
      | call plumber |
      | make the bed |
    And check item count is 3
    When remove item "call plumber"
    And check item count is 2

  Scenario: Complete todo items
    Given User is on the todos page
    When input items to todo list
      | go to the bank |
      | call plumber |
      | make the bed |
    And check item count is 3
    When complete item "go to the bank"
    And check item count is 2
    When navigates to Completed todo list section
    Then check item "go to the bank" exists

  Scenario: Clear completed todo items
    Given User is on the todos page
    When input items to todo list
      | go to the bank |
      | call plumber |
      | make the bed |
    And check item count is 3
    When complete item "go to the bank"
    And check item count is 2
    And click Clear Completed button
    When navigates to Completed todo list section
    Then check item "go to the bank" does not exists

  Scenario: Enter lengthily text as a todo item with multiple character combinations including special characters
    Given User is on the todos page
    When input items to todo list
    | car @$&*@ (!*&(%( ^)(^__^ ))(*^******* 12313 564 87~!@#$%^&*()_+=` ZXCVBNM,ASDFGHJKL;QWERT oiuhgf |
    Then check item count is 1

  Scenario: Edit todo item
    Given User is on the todos page
    When input items to todo list
      | go to the bank |
    And check item count is 1
    And edit "go to the bank" to "go to the market"
    Then check item "go to the market" exists
    And check item "go to the bank" does not exists