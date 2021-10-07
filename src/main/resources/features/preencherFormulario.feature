# language: pt
@teste @formulario
Funcionalidade: Preencher formulario de endereco sem autorizacao MFA
  Eu como usuario quero preencher o formulario de encereco sem ter autorizacao MFA
  para que eu possa validar a mensagem de erro


  Cenario: Preencher formulario endereco sem autorizacao MFA
    Dado que acesse o app diretamente sem efetuar a autenticacao MFA
    E acesso o menu User Account
    Quando preencher e salvar o formulario
    Entao e apresentado a mensagem "Error! Your data has not been saved."
