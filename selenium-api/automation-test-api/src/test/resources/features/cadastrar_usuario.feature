# language: pt
Funcionalidade: Cadastro de Usuario
  Como um usuario da API
  Eu quero me cadastrar no sistema
  Para poder acessar as funcionalidades restritas

  Cenário: Cadastrar usuario com sucesso
    Dado que eu tenha dados validos para um novo usuario
    Quando eu envio a requisicao de cadastro
    Então o usuario deve ser armazenado com sucesso

  Cenário: Validar erro ao cadastrar usuario sem e-mail
    Dado que eu tenha dados de um novo usuario sem o campo e-mail
    Quando eu envio a requisicao de cadastro
    Então a API deve retornar um erro de "email deve ser uma string" com status 400