@CadastroDousuario
Feature: Cadastro do usuario

  @Visualizacion_elementos
  Scenario: visualizacion del campo Nome, E-mail , Senha y cadastrar
    Given el usuario accede a la URL "https://cadastro-de-usuarios.s3.us-east-1.amazonaws.com/index.html"
    Then el usuario visualiza el elemento Nome
    And  el usuario visualiza el elemento E-mail
    And  el usuario visualiza el elemento Senha
    And  el usuario visualiza el boton Cadastrar

  @Cadastro_Nome_Vacio
  Scenario: Cadastro com campo Nome vacio
    Given el usuario accede a la URL "https://cadastro-de-usuarios.s3.us-east-1.amazonaws.com/index.html"
    When El usuario ingresa el mail joao.silva@email.com
    When El usuario ingresa la senha 123456789
    And El usuario presiona el boton Cadastrar
    Then valida que el campo nome no debe estar vacio

  @Cadastro_Email_Vacio
  Scenario: Cadastro com campo Email vacio
    Given el usuario accede a la URL "https://cadastro-de-usuarios.s3.us-east-1.amazonaws.com/index.html"
    When El usuario ingresa el nombre  João da Silva
    When El usuario ingresa la senha 123456789
    And El usuario presiona el boton Cadastrar
    Then valida que el campo email no debe estar vacio

  @Cadastro_Senha_Vacio
  Scenario: Cadastro com campo Senha vacio
    Given el usuario accede a la URL "https://cadastro-de-usuarios.s3.us-east-1.amazonaws.com/index.html"
    When El usuario ingresa el nombre  João da Silva
    And El usuario ingresa el mail joao.silva@email.com
    And El usuario presiona el boton Cadastrar
    Then valida que el campo senha no debe estar vacio

  @Todos_Los_Campos_Vacios
  Scenario: Cadastro com campo Senha vacio
    Given el usuario accede a la URL "https://cadastro-de-usuarios.s3.us-east-1.amazonaws.com/index.html"
    When El usuario presiona el boton Cadastrar
    Then valida que todos los campos no deben estar vacio


  @Cadastro_Nome_Incompleto
  Scenario: Cadastro com campo Nome incompleto
    Given el usuario accede a la URL "https://cadastro-de-usuarios.s3.us-east-1.amazonaws.com/index.html"
    When El usuario ingresa el nombre  João
    When El usuario ingresa el mail joao.silva@email.com
    When El usuario ingresa la senha 123456789
    And El usuario presiona el boton Cadastrar
    Then valida que el campo nome no debe estar incompleto

  @Cadastro_Email_Valido
  Scenario: Cadastro com campo Nome incompleto
    Given el usuario accede a la URL "https://cadastro-de-usuarios.s3.us-east-1.amazonaws.com/index.html"
    When El usuario ingresa el nombre  João da Silva
    When El usuario ingresa el mail joao.silva
    When El usuario ingresa la senha 123456789
    And El usuario presiona el boton Cadastrar
    Then valida que el campo email es valido

  @Cadastro_Senha_Completa
  Scenario: Cadastro com campo Nome incompleto
    Given el usuario accede a la URL "https://cadastro-de-usuarios.s3.us-east-1.amazonaws.com/index.html"
    When El usuario ingresa el nombre  João da Silva
    When El usuario ingresa el mail joao.silva@mail.com
    When El usuario ingresa la senha 1234567
    And El usuario presiona el boton Cadastrar
    Then valida que la longitud de la senha es valido

  @Cadastro_Todos_Los_campos_Completos
  Scenario: Cadastro com los campos completos
    Given el usuario accede a la URL "https://cadastro-de-usuarios.s3.us-east-1.amazonaws.com/index.html"
    When El usuario ingresa el nombre  João da Silva
    When El usuario ingresa el mail joao.silva@mail.com
    When El usuario ingresa la senha 123456789
    And El usuario presiona el boton Cadastrar
    Then valida registro exitoso

  @Cadastro_Todos_Los_campos_Completos_2_Usuarios
  Scenario: Cadastro com 2 usuarios
    Given el usuario accede a la URL "https://cadastro-de-usuarios.s3.us-east-1.amazonaws.com/index.html"
    When El usuario ingresa el nombre João da Silva
    When el usuario ingresa el mail joao.silva@mail.com
    When El usuario ingresa la senha 123456789
    When El usuario presiona el boton Cadastrar
    When El usuario ingresa el nombre Nestor Cordoba
    When el usuario ingresa  el mail nestorcordoba@mail.com
    When El usuario ingresa la senha 123456787
    When El usuario presiona el boton Cadastrar
    Then valida registro exitosodos

  @Cadastro_Todos_Los_campos_Completos_Remove_Usuario_ID_2
  Scenario: Cadastro com 2 usuarios
    Given el usuario accede a la URL "https://cadastro-de-usuarios.s3.us-east-1.amazonaws.com/index.html"
    When El usuario ingresa el nombre João da Silva
    When el usuario ingresa el mail joao.silva@mail.com
    When El usuario ingresa la senha 123456789
    When El usuario presiona el boton Cadastrar
    When El usuario ingresa el nombre Nestor Cordoba
    When el usuario ingresa  el mail nestorcordoba@mail.com
    When El usuario ingresa la senha 123456787
    When El usuario presiona el boton Cadastrar
    Then valida registro exitoso
    And El usuario remueve el ultimo registro




