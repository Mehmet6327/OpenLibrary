@wip
Feature:Service covering for OpenLibrary
  Scenario:Service covering for OpenLibrary.com
    Given user goes to the OpenLibrary page
    And user sets website in English
    When user searches for "Baking with the Brass sisters "
    And user chooses book published in "2015 "
    And get author from API with Endpoint "/search.json?q=Baking+with+the+Brass+sisters"
    Then author from API matches author on book page


