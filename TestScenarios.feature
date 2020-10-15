Feature: https://www.6pm.com/p/timberland-brooklyn-earthkeepers-ph-fabric-ox/product/9409514

     # add product functionality

  Scenario:Verify that "product_item" added to cart successfully

    Given navigate to "6pm"url
    And   login with valid credentials
    And   select "Category_name"
    And   select "Category_item_name"
    And   select "product_name"
    And   user should navigate to "product_URL"
    And   the product page should display that user can selected desired attribute of the product e.g. size, color, etc
    And   select "product_name"
    And   user should navigate to "product_name_url"
    And   select "product_size"
    And   click "add to bag" button
    And   user should navigate to "checkout url"
    And   click on checkout
    And   the order items should be displayed correctly on the orders details screen
    And   data should be returned in the API
    And   returned data should match the database


  Scenario: verify that user can add items to the cart and continue shopping

  Scenario: Verify that error message after user enter more than 5 same products

  Scenario: Verify that error message after user enter more than 5 different products

  Scenario:  Verify that after apply coupons it should reflected on price

  Scenario:  Check behavior after don’t check out, close the site, and come back later

  Scenario:  user adds the same item to the cart while continuing to shop, the item count in the shopping cart should get incremented (issue)

  Scenario: Verify that the user can buy products added to the cart after signing in to the application

  Scenario: Verify that user add multiple items of different types


  Scenario Outline: Verify that the user is able to navigate through all the products across different categories.
    Examples:

  Scenario Outline: Verify that all the links and banners are redirecting to correct product/category pages and none of the links are broken
    Given navigate to "6pm"url
    And   I should menu items displayed on screen
    Examples:
      | category_name | category_item_name | product_name | target_url                                                                                                                                                                                                        |
      | SHOES         | Women's            | Boots        | https://www.6pm.com/women-boots/CK_XARCz1wHAAQHiAgMBAhg.zso?s=isNew%2Fdesc%2FgoLiveDate%2Fdesc%2FrecentSalesStyle%2Fdesc%2F&si=4036319%2C4675168%2C4334690%2C4817249%2C4782223%2C4756952%2C4471745%2C4863673&sy=1 |
      | SHOES         | Men's              | Sneakers     | https://www.6pm.com/men-sneakers-athletic-shoes/CK_XARC81wHAAQLiAgMBAhg.zso?s=isNew%2Fdesc%2FgoLiveDate%2Fdesc%2FrecentSalesStyle%2Fdesc%2F                                                                       |
      | CLOTHING      | Specialty shops    | Athletic     | https://www.6pm.com/clothing/CKvXAToCnw3iAgIBBw.zso?s=recentSalesStyle%2Fdesc%2F                                                                                                                                  |








      #edit product

  Scenario: Verify that the user can add to cart one or more products

  Scenario: Verify that users can add products to the wishlist

  Scenario: Verify that the user can buy products added to the cart after signing in to the application

  Scenario: Verify that the user can successfully buy more than one product that was added to his/her cart

  Scenario: Verify that the user cannot add more than the available inventory of the product


        #Delete product

  Scenario: Remove all items from the cart

  Scenario: Remove some items from the cart

  Scenario: Verify that after user cancel order , cart should be empty