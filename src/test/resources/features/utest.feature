#autor: lgomezm@choucairtesting.com
  @registeredUtest
  Feature: Registre the page Utest
    As a user, I wants registre the page utest

    @Scenario1:
  Scenario: Create user page utest
    Given than Leidy wants registre page utest
    When she fillout information of the form
    |strFirstname|strLastname|strEmail      |strMonth|strDay|strYear|strCity|strCodePostal|strCountry|strSystemOperatingComputer|strVersionSystemOperatingComputer|strLanguageSystemOperatingComputer|strBrandPhone|strModelPhone|strSystemOperatingPhone|strPassword |strConfirmPassword|
    |  Leidy     | Gomez     |ls8gs@gmail.com|January |2     |2000   |Manizales|123          |Colombia  |Linux                    | Ubuntu                  |English                           |Apple        |iPhone 4         |iOS 11.0.3         |2JlUloRyWvl5|2JlUloRyWvl5      |
      Then she receives message the welcome page utest