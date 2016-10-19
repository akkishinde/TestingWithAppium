Feature: Log in feature of app to test
  whether the app allows to log in or not

  Scenario: Valid Log in -1
    Given Given I am on the Go-Jek app log in page
    When User enters email "akshay.shinde@go-jek.com" and password as "leftshift@1234"
    Then Verify GoPay Amount


  Scenario: Happy path Go ride booking
    Given User is logged in
    And User taps on Go-Ride
    When User selects Source location as "Indomaret"
    And User selects Destination location as "Monumen Nasional"
    And User selects Payment Method as cash and books a Ride
    Then User sees finding driver page
