Feature: Validating Search Functionality of Amazon

  Scenario: Open Amazon home page
    Given Open Browser and Maximize it
    When navigate to URL "https://www.amazon.in/"
    Then Home Page should display with title "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"
    And close the browser


#  Scenario: Search for a Product
#    Given Open browser and navigate to url "https://www.amazon.in/"
#    When Search for product "iphone"
#    Then Product page should be displayed with title "Amazon.in : iphone"
#    And close the browser


  Scenario Outline: Check login functionality
    Given User is on the landing page with URL "https://www.amazon.in/"
    When send the username with "<Username>" and password with "<password>"
    Then  user is not able to login-incorrect username and password

    Examples:
    |Username      | password |
    |abc@gmail.com | 1234     |
    |xyz@gmail.com |5678      |