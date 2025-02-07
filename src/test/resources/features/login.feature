@login
Feature: Login Sauce Demo

  @login_success
  Scenario Outline: Login con credenciales validas

    Given estoy en la aplicacion Swag Labs
    When ingreso mis credenciales como usuario "<username>" y clave "<password>"
    Then ingreso a la app

    Examples:
    | username      | password     |
    | standard_user | secret_sauce |