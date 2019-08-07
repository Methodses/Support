@fullrun
Feature: Contact Us Page
  As a user,
  I want to contact support via web forms
  So I can submit the support ticket

    @contact-positive
    Scenario Outline: Verify the Contact Us Page and enter the random detaisl
      Given I am in search engine
      When the user searches for the <keyword>
      And the user clicks on search link <link1>
      Then the <targetpage1> should be displayed
      When the user clicks on Contact Us link in the home page
      Then the <targetpage2> should be displayed
      When the user enters contact details
      Then the entered values should be available in the form

      Examples:
      | link1                         | link2     | targetpage1                                                      | targetpage2                                         | keyword   |
      | https://www.securepay.com.au/ | securepay | SecurePay online payment and eCommerce solutions for businesses  | Contact Us – SecurePay – Sales – Support – Accounts | securepay |
