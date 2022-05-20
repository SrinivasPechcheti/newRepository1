Feature: Urban Ladders WebSite AutoMate

  Scenario: Urban Ladders Help page Validation
    Given User  in the Home Page
    When click Help tab in Header
    Then Validating "'Help Center'"  text is displayed or not
