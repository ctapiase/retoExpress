Feature: Registro de personal
  Yo como usuario
  Quiero registrar un usuario
  Para verificar que el estado final sea Hired

  Scenario: registro de usuario
    Given El usuario inicia sesion en la pagina opensource
      | user  | pass     |
      | Admin | admin123 |
    When El usuario ingresa a la funcionalidad Recruitmen
    And Diligencia el formulario al deplegar el boton Add
      | name   | lastName | email             |
      | Chucho | JEsus  | JEsus@Chacho.com |
    Then Se debe visualizar el estado Hired al finalizar el registro
      | estado     | name   | lastName | email             |record|
      |  | Chacho | chachon  | Chacho@Chacho.com |Found|