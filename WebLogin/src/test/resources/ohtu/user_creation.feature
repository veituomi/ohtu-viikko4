Feature: A new user account can be created if a proper unused username and password are given

    Scenario: creation successful with correct username and password
        Given new user is selected
        When username "akkuj", password "jukka123" and password confirmation "jukka123" are given
        Then user has been registered

    Scenario: creation fails with too short username and valid passord
        Given new user is selected
        When username "a", password "jukka123" and password confirmation "jukka123" are given
        Then user is not created and error "username should have at least 3 characters" is reported   

    Scenario: creation fails with correct username and too short password
        Given new user is selected
        When username "akkuja", password "a1" and password confirmation "a1" are given
        Then user is not created and error "password should have at least 8 characters" is reported   

    Scenario: creation fails with correct username and password consisting of letters
        Given new user is selected
        When username "jakku", password "akkujaaaaa" and password confirmation "akkujaaaaa" are given
        Then user is not created and error "password can not contain only letters" is reported 

    Scenario: creation fails with already taken username and valid pasword
        Given new user is selected
        When username "jukka", password "jukka123" and password confirmation "jukka123" are given
        Then user is not created and error "username is already taken" is reported 

    Scenario: creation fails when password and password confirmation do not match
        Given new user is selected
        When username "jukka2", password "jukka123" and password confirmation "jukka323" are given
        Then user is not created and error "password and password confirmation do not match" is reported 