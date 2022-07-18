Feature: Schedule a project presentation

  Scenario Outline: Schedule a project presentation
    Given user accesses the website Million And Up
    When he schedule a project
      | <dayNumber> | <email> | <name> | <phone> |<message>|
    Then he should see a summary of the schedule of the presentation
    Examples:
      | dayNumber    | email             | name  | phone     |message|
      | 1 de octubre | kagualim@weel.com | Karen | 3211234567 |Su presentación del proyecto se programó con éxito. Uno de nuestros agentes se contactará en breve para brindarle detalles.|


