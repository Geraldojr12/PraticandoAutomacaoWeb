#language: pt
#enconding: UTF-8

@CadastrarNoSistema
Funcionalidade: Fazer Cadastro

Cenario: informar dados para cadastro

Dado que eu estou acessando o sistema
E aciono o botao entrar
E informo no campo email "emailthebest07@dominio.com"
E clico no botao registrar
Entao sistema exibe pagina para cadastrar dados do cliente
E informo no campo First name "Geraldo"
E informo no campo Last name "Junior"
E informo no campo Password "gj123456"
E informo no campo Adress "Builden 7-9 SUBURBY"
E informo no campo City "New York"
E informo no campo State "ALASKA"
E informo no campo Zip/Postal Code	"44500"
E informo no campo Country "Estados Unidos"
E informo no campo Mobile phone "9999999"
E aciono botao Registry
Entao sistema apresenta cliente cadastrado


