@amazonLogin
Feature: Verifying Amazon Cancel Booking Page

  Scenario Outline: Cancel the order in add cart
    Given User is on the Amazon Page
    Then User should verify the after launch "Hello"
    When User search the product "<search>"
    Then User should verify after search success message "iphone 14"
    When User select the radio button to sort by high to low
    Then User should verify all product arranged in descending order
    When User select the first product and save product name and price
    Then User should verify after select the product "iPhone 14 Pro max"
    When User add the product to add cart
    Then User should verify after produt adding to cart "Shopping Cart"
    When User is sign in page enter the "<loginSheet>",<RowNumber> , <CellNumber> and <CellNumber2>
    Then User should verify after adding address "Checkout"
    Examples: 
      | search    | loginSheet | RowNumber | CellNumber | CellNumber2 |
      | iphone 14 | loginSheet |         1 |          1 |           2 |
      | iphone 14 | loginSheet |         2 |          1 |           2 |
      | iphone 14 | loginSheet |         3 |          1 |           2 |
      | iphone 14 | loginSheet |         4 |          1 |           2 |
      | iphone 14 | loginSheet |         5 |          1 |           2 |
     
