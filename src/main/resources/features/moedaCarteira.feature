# language: pt
@teste @alterarMoeda
Funcionalidade: Alterar moeda da carteira sem autenticacao MFA
  
  Eu como usuario, quero alterar a moeda da minha carteira sem autenticacao MFA
  para validar que não é possivel altera-la sem a autenticacao MFA

  Esquema do Cenario: Alterar moeda da carteira para "<moeda>" sem autenticacao MFA
    Dado que acesse o app diretamente sem efetuar a autenticacao MFA
    Quando alterar a moeda da minha carteira para "<moeda>"
    Entao ao verificar a carteira o saldo deve ser apresentado em dolar com o simbolo "$"

    Exemplos: 
      | moeda |
      | BRL   |
      | BTC   |
      | EUR   |
      | USD   |
