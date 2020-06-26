#language: pt

@cadastro
Funcionalidade: Prencher Formulário
Eu como usuário, gostaria de acessar o sistema e efetuar o preenchimento do formulário de cadastro.


  
  Cenario: Acessar menu forms
    Dado que estou na tela inicial do sistema
    Quando clico no menu Forms
    Então tela de Forms é exibida

 
  Esquema do Cenário: Preencher formulário de cadastro
    Dado que estou na tela de formulário 
    Quando preencho com minhas informações "<nome>","<sobrenome>","<email>","<sexo>","<celular>","<data_nasc>","<subject>","<hobbie>","<endereco>","<estado>","<cidade>"
    E clico no botão submit
    Então mensagem de confirmação de envio é exibida
