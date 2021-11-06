package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;
import pageObjects.TelaCompraProdutoPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class LoginCompraSteps {

	@E("^informo meu email \"([^\"]*)\"$")
	public void informoMeuEmail(String email) throws Throwable {
		Na(LoginPage.class).informarCampoEmail(email);
	}

	@E("^informo minha senha \"([^\"]*)\"$")
	public void informoMinhaSenha(String senha) throws Throwable {
		Na(LoginPage.class).informarCampoSenha(senha);
	}

	@Dado("aciono botao entrar")
	public void acionoBotaoEntrar() {
	    Na(LoginPage.class).acionarBotaoLogin();
	}

	@E("^aciono o botao home$")
	public void acionoOBotaoHome() throws Throwable {
		Na(TelaCompraProdutoPage.class).acionarBotaoHome();
	}

	@Quando("^mover o mouse para produto blouse$")
	public void moverOMouseParaProdutoBlouse() throws Throwable {
		Na(TelaCompraProdutoPage.class).moverMouseParaAbaBlouse();
	}

	@E("^acionar o botao adicionar produto ao carrinho de compras$")
	public void acionarOBotaoAdicionarProduto() throws Throwable {
		Na(TelaCompraProdutoPage.class).acionarBotaoCompra();
	}

	@E("^acionar botao fazer checkout$")
	public void acionoBotaoCheckout() throws Throwable {
		Na(TelaCompraProdutoPage.class).acionarBotaoCheckout();
	}

	@E("^acionar botao fazer chekout no submenu summary$")
	public void novamenteAcionoBotaoChekout() throws Throwable {
		Na(TelaCompraProdutoPage.class).acionarBotaoProceedCheckout();
	}

	@E("^acionar botao fazer checkout no submenu address$")
	public void novamenteAcionoBotaoProceedCheckoutNoSubmenuAdress() throws Throwable {
		Na(TelaCompraProdutoPage.class).acionarBotaoProcessAddress();
	}

	@E("^aciono a caixa de confirmacao de termos de servico$")
	public void acionoACaixaDeConfirmacaoDeTermosDeServico() throws Throwable {
		Na(TelaCompraProdutoPage.class).acionaCaixaTermosServico();
	}

	@E("^acionar botao fazer checkout no submenu shipping$")
	public void acionoOBotaoProceedCheckoutNoSubmenuShipping() throws Throwable {
		Na(TelaCompraProdutoPage.class).acionarBotaoProcessCheckoutSubMenuShipping();
	}

	@E("^acionar a opcao pay bay bank wire$")
	public void acionoOSubMenuPayBayBankWire() throws Throwable {
		Na(TelaCompraProdutoPage.class).acionarSubMenuPagamento();
	}

	@E("^acionar botao confirmar pedido$")
	public void acionoOBotaoConfirmarPedido() throws Throwable {
		Na(TelaCompraProdutoPage.class).acionarBotaoConfirmarPedido();
	}

	@Entao("^sistema apresenta tela de confirmacao de pedido$")
	public void sistemaApresentaTelaDeConfirmaçãoDePedido() throws Throwable {
		assertEquals("ORDER CONFIRMATION", driver.findElement(By.xpath("//h1[text()='Order confirmation']")).getText());
	}

}
