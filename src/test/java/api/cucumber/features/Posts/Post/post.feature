Feature: Carry out Sales
  This will carry out sales functionality in the Website

  Scenario: Carry out a for sale search
    Given Carry out for sale search
    When Select filters in drop down
    And Find properties
    And Change the sort order on the search results to newest listed
    Then Choose the first non-featured property in the list