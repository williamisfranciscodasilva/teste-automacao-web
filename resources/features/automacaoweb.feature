# language:pt
# encoding:utf-8
Funcionalidade: realizar um cadastro

  Cenario: cadasctra novo fornecedor
    Dado que eu acesse o sistema
    #E fa�a login
    E clique em contas
    E clique em fornecedores
    E clique no botao Add
    E preencha o formulario
    Quando eu clicar no bot�o enviar
    Entao devo validar o email na lista de fornecedores
