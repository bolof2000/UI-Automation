Scenario: User able to login to website
Given a valid Url
When I click on the form authentication url
And I enter username and password
|username | password |
|tomsmith |SuperSecretPassword |
Then the verify successful login