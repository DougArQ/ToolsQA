#language: pt

@cadastro
Funcionalidade: Prencher Formul�rio
Eu como usu�rio, gostaria de acessar o sistema e efetuar o preenchimento do formul�rio de cadastro.


  
  Cenario: Acessar menu forms
    Dado que estou na tela inicial do sistema
    Quando clico no menu Forms
    Ent�o tela de Forms � exibida

 
  Esquema do Cen�rio: Preencher formul�rio de cadastro
    Dado que estou na tela de formul�rio 
    Quando preencho com minhas informa��es "<nome>","<sobrenome>","<email>","<sexo>","<celular>","<data_nasc>","<subject>","<hobbie>","<endereco>","<estado>","<cidade>"
    E clico no bot�o submit
    Ent�o mensagem de confirma��o de envio � exibida
