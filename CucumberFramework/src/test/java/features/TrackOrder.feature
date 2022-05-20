Feature: Urban Ladders WebSite AutoMate

  Scenario: Urban Ladders Track Order Validation
    Given User  in  Home Page
    When click on track order icon
    And enter order number
    When Enter moblie number
    Then click on submit and passing Warning message
