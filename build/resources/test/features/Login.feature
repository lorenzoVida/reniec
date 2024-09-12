Feature: Login Orange

  @successful
  Scenario: Login exitoso en orange
    Given usuario "admin" ingresar a la web principal
    When ingresa sus credenciales de admin
    Then me muestra el "Dasboard principal" de la aplicacion