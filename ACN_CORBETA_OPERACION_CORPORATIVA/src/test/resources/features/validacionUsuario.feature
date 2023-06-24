Feature: Sign Up in CMR Alkomprar page

  Scenario: Signup in CRM Alkomprar page successful
    Given that try open CMR Alkomprar page
    When try signup in the page
      | username     | password |
      | adminpqr3 | 123  |
    Then should see that success created user