Feature: Login Orange

  @successful
  Scenario: Login exitoso en orange
    Given usuario "admin" ingresar a la web principal
    When ingresa a buscar la cuenca en reniec
    Then me muestra el "Dasboard principal" de la aplicacion