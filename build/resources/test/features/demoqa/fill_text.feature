Feature: Fill text information the Tool QA

  Scenario Outline: Fill out the student registration form
    Given user accesses the website
    When he enters all information
      | <firstaName> | <lastName> | <email> | <gender> | <mobile> | <subject> | <hobbie> | <month> | <year> | <day> | <address> | <state> | <city> |<path>|
    Then he should see a submiting message
    Examples:
      | firstaName | lastName   | email             | gender | mobile     | subject | hobbie | month    | year | day | address        | state         | city    |path|
      | Karen      | Agualimpia | kagualim@weel.com | Female | 3211234567 | Maths   | Sports | February | 1995 | 08  | calle 3 casa 4 | Uttar Pradesh | Lucknow |MillionAndUp.png|
