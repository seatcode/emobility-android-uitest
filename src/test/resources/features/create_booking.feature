Feature: User create a booking

  As a user I want to be able to create booking

  @ignore
  Scenario: A non authenticated user can create a booking

    As a registered user that wants to book a car and hasn't
    login I want the login window to appear
    before book a car so I can use my account to create a booking

    Given Alfredo has location enabled
    And he is authenticated
    When he books a car
    Then a booking should be created

  Scenario: An authenticated user can create a booking

    As a registered user that wants to book a car and is
    registered I want to create a booking

    Given Julia has location enabled
    When she books a car named "Seat Leon"
    And she login with valid credentials
    Then a booking should be created


  @ignore
  Scenario: A non existing user wants to create a booking

    As a non registered user I want to choose a car and book it.
    Before the booking is created I want the register process to popup.

    Given Julian is not registerd and has location enabled
    When he books a car
    And he completes the register process
    Then a booking should be created