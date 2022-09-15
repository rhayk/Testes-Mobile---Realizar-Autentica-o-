#language: pt
#encoding: UTF-8

@AcessoLoginAmericanas
Funcionalidade: Realizar login Americanas

@AutenticacaoCorreto
Cenario: Realizar Login correto
Dado que o usuario realize o login com os dados corretos
Entao apresentar o endereco do usuario na tela principal

@AutenticacaoIncorreta
Cenario: Realizar Login com dados incorretos
Dado que o usuario realize o login com os dados incorretos
Entao apresentar a mensagem: e-mail ou senha incorretos

@AutenticacaoSemEmail
Cenario: Realizar Login sem preencher o e-mail
Dado que o usuario realize o login sem preencher o e-mail
Entao apresentar a mensagem: informe o seu usuario e senha

@AutenticacaoSemSenha
Cenario: Realizar Login sem preencher a senha
Dado que o usuario realize o login sem preencher a senha
Entao apresentar a mensagem: informe o seu usuario e senha