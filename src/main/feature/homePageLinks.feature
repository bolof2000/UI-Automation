Feature: To Validate the links on Homepage

Scenario Outline: Home Page Links
  Given That i navigate to the given valid URL
  When I click on '<link>'
  Then I validate that the page navigates to '<url>' and the title contains '<title>'
  Examples:
  |link|url|title|
  |A/B Testing|https://the-internet.herokuapp.com/abtest|A/B Test Control|
  |Add/Remove Elements|https://the-internet.herokuapp.com/add_remove_elements/|Add/Remove Elements|
  |Form Authentication|https://the-internet.herokuapp.com/login|Login Page|