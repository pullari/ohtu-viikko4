Feature: A new user account can be created if a proper unused username and password are given

Scenario: creation successful with correct username and password
Given new user is selected
When  valid username "samuli" and password "samuli123" are given
Then  user is created and logged in to the app

Scenario: creation fails with too short username and valid passord
Given new user is selected
When  invalid username "s" and valid password "samuli123" are given
Then user is not created and error "username should have at least 3 characters" is reported

Scenario: creation fails with correct username and too short password
Given new user is selected
When  valid username "samuli" and invalid password "sam" are given
Then user is not created and error "password should have at least 8 characters" is reported

Scenario: creation fails with correct username and password consisting of letters
Given new user is selected
When  valid username "samuli" and invalid password "samulisar" are given
Then user is not created and error "password can not contain only letters" is reported

Scenario: creation fails with already taken username and valid pasword
Given new user is selected
When  valid but taken username "jukka" and valid password "samuli123" are given
Then user is not created and error "username is already taken" is reported

Scenario: creation fails when password and password confirmation do not match
Given new user is selected
When  valid username "samuli" and valid password "samuli123" are given but confirmation "samuli122" is different
Then user is not created and error "password and password confirmation do not match" is reported

Scenario: user can login with successfully generated account
Given user with username "liisa" with password "salainen1" is successfully created
And   login is selected
When  correct username "liisa" and password "salainen1" are given
Then  user is logged in

Scenario: user can not login with account that is not successfully created
Given user with username "aa" and password "bad" is unsuccessfully created
And   login is selected
When  nonexistent username "aa" and nonexistent password "bad" are given
Then  nonexistent user is not logged in and error message is given