@wip
Feature:Buying shoes for men
  Scenario:Buying shoes from Asos.com
    Given the user is on the Asos page
    When the user searches for "Zapatos Oxford de vestir "
    And the user selects first shoe appearing
    And the user adds the shoe to the Cart with quantity "1"
    And the user opens the cart
