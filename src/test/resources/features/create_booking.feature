Feature: User create a booking

  As a user I want to be able to create booking


  Scenario: A non authenticated user can create a booking

    As a registered user that wants to book a car and hasn't
    login I want the login window to appear
    before book a car so I can use my account to create a booking

    Given Alfredo has location enabled
    When he books a car named "SEAT eMii"
    Then Login To Continue Screen appears
    When he login with valid credentials
    Then a booking should be created
    When he goes to the car
    And the car has no damages
    And he can finish the trip