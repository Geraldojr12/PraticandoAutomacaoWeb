$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/LoginCadastro.feature");
formatter.feature({
  "name": "Fazer Cadastro",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@CadastrarNoSistema"
    }
  ]
});
formatter.scenario({
  "name": "informar dados para cadastro",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@CadastrarNoSistema"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu estou acessando o sistema",
  "keyword": "Dado "
});
formatter.match({
  "location": "LoginCadastroSteps.acessandoSistema()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "aciono o botao entrar",
  "keyword": "E "
});
formatter.match({
  "location": "LoginCadastroSteps.acionoOBotaoEntrar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo no campo email \"emailthebest07@dominio.com\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginCadastroSteps.informoNoCampoEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no botao registrar",
  "keyword": "E "
});
formatter.match({
  "location": "LoginCadastroSteps.clicoNoBotaoRegistrar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sistema exibe pagina para cadastrar dados do cliente",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginCadastroSteps.sistemaExibePaginaParaCadastrarDadosDoCliente()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo no campo First name \"Geraldo\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginCadastroSteps.informoFirstName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo no campo Last name \"Junior\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginCadastroSteps.informoLastName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo no campo Password \"gj123456\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginCadastroSteps.informoPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo no campo Adress \"Builden 7-9 SUBURBY\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginCadastroSteps.informoAdress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo no campo City \"New York\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginCadastroSteps.informoCity(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo no campo State \"ALASKA\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginCadastroSteps.informoState(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo no campo Zip/Postal Code\t\"44500\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginCadastroSteps.informoZipPostalCode(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo no campo Country \"Estados Unidos\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginCadastroSteps.informoCountry(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo no campo Mobile phone \"9999999\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginCadastroSteps.informoMobilePhone(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "aciono botao Registry",
  "keyword": "E "
});
formatter.match({
  "location": "LoginCadastroSteps.acionoBotaoRegistry()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sistema apresenta cliente cadastrado",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginCadastroSteps.sistemaApresentaClienteCadastrado()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/LoginCompra.feature");
formatter.feature({
  "name": "Acessa ao Sistema e realizar Compra",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@acessoECompra"
    }
  ]
});
formatter.scenario({
  "name": "Acessar Site e Fazer Compra de um produto",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@acessoECompra"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu estou acessando o sistema",
  "keyword": "Dado "
});
formatter.match({
  "location": "LoginCadastroSteps.acessandoSistema()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "aciono o botao entrar",
  "keyword": "E "
});
formatter.match({
  "location": "LoginCadastroSteps.acionoOBotaoEntrar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo meu email \"emailthebest07@dominio.com\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginCompraSteps.informoMeuEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo minha senha \"gj123456\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginCompraSteps.informoMinhaSenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "aciono botao entrar",
  "keyword": "E "
});
formatter.match({
  "location": "LoginCompraSteps.acionoBotaoEntrar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "aciono o botao home",
  "keyword": "E "
});
formatter.match({
  "location": "LoginCompraSteps.acionoOBotaoHome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "mover o mouse para produto blouse",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginCompraSteps.moverOMouseParaProdutoBlouse()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acionar o botao adicionar produto ao carrinho de compras",
  "keyword": "E "
});
formatter.match({
  "location": "LoginCompraSteps.acionarOBotaoAdicionarProduto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acionar botao fazer checkout",
  "keyword": "E "
});
formatter.match({
  "location": "LoginCompraSteps.acionoBotaoCheckout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acionar botao fazer chekout no submenu summary",
  "keyword": "E "
});
formatter.match({
  "location": "LoginCompraSteps.novamenteAcionoBotaoChekout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acionar botao fazer checkout no submenu address",
  "keyword": "E "
});
formatter.match({
  "location": "LoginCompraSteps.novamenteAcionoBotaoProceedCheckoutNoSubmenuAdress()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "aciono a caixa de confirmacao de termos de servico",
  "keyword": "E "
});
formatter.match({
  "location": "LoginCompraSteps.acionoACaixaDeConfirmacaoDeTermosDeServico()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acionar botao fazer checkout no submenu shipping",
  "keyword": "E "
});
formatter.match({
  "location": "LoginCompraSteps.acionoOBotaoProceedCheckoutNoSubmenuShipping()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acionar a opcao pay bay bank wire",
  "keyword": "E "
});
formatter.match({
  "location": "LoginCompraSteps.acionoOSubMenuPayBayBankWire()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acionar botao confirmar pedido",
  "keyword": "E "
});
formatter.match({
  "location": "LoginCompraSteps.acionoOBotaoConfirmarPedido()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sistema apresenta tela de confirmacao de pedido",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginCompraSteps.sistemaApresentaTelaDeConfirmaçãoDePedido()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
});