@fullrun
Feature: Contact Us Page
  As a user,
  I want to contact support via web forms
  So I can submit the support ticket

    @contact-positive
    Scenario Outline: Verify the Contact Us Page and enter the random detaisl
      Given I am in search engine
      When I search for the <keyword>
      And I click on search link <link1>
      Then the <targetpage1> should be displayed
      When I click on Contact Us link in the home page
      Then the <targetpage2> should be displayed
      When I enter contact details for the <enquiryReason>

      Examples:
      | link1                         |  targetpage1                                                    | targetpage2                                         | keyword   | enquiryReason |
      | https://www.securepay.com.au/ | SecurePay online payment and eCommerce solutions for businesses | Contact Us – SecurePay – Sales – Support – Accounts | securepay | Support       |
