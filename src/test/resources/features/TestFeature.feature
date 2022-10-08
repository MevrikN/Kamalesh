Feature: Visit a page and click on a link

@test
  Scenario: Visit a page and check the page title
    Given I go to url https://www.bbc.co.uk/
  When I click on sign in tab
  Then I should be navigated to sig in page

