#language:pt
Funcionalidade: Comprar
  Eu como usuario
  Quero acessar a pagina Automation Practice
  Para comprar um vestido e gerar boleto

  Contexto: Fazer uma compra
    Dado Que eu acesse o site Automation Practice

  Esquema do Cenario: Comprar um vestido e gerar boleto
    Quando Clicar em DRESSES
    E Clicar na opção - Summer Dresses opção Printed Summer Dress
    E Clicar em Printed Summer Dress
    E Clicar no campo Quantity
    E Clicar em size e selecionar a opção S
    E Clicar em cima do Yellow
    E Clicar em cima da opção Add cart
    E Clicar em cima de Proceed to Chekout
    E Clicar em cima de Proceed to chekout outra vez 
    E Visualizar a pagina de sign in
    E Preencher os campos email e password "<emailadress>" e "<password>"
    E Clicar no botão de sing in
    E Clicar em proceed to chechout
    E Clicar em Terms
    E Clicar em proceed ckeckout novamente
    E Clicar em Pay by back wire
    E Clicar em I confirm my order
    Entao o boleto sera gerado

    Exemplos: 
      | emailaddress                  | password |
      | dossantos@leonardopereira.com | teste    |
