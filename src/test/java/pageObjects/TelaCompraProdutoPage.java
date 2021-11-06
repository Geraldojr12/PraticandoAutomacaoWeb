package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static utils.Utils.*;

public class TelaCompraProdutoPage extends LoginPage{
	
	@FindBy(css = "body.my-account.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 ul.footer_links.clearfix li:nth-child(1) a.btn.btn-default.button.button-small > span:nth-child(1)")
	private WebElement botaoHome;
	
	@FindBy(css = "body.index.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(2) div.center_column.col-xs-12.col-sm-12 div.tab-content ul.product_list.grid.row.homefeatured.tab-pane.active:nth-child(1) li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.last-item-of-mobile-line:nth-child(2) div.product-container div.left-block div.product-image-container a.product_img_link > img.replace-2x.img-responsive")
	private WebElement campoProduto;
	
	@FindBy(linkText = "Add to cart")
	private WebElement botaoAdicionarCompra;
	
	@FindBy(linkText = "Proceed to checkout")
	private WebElement botaoCheckout;
	
	@FindBy(linkText = "Proceed to checkout")
	private WebElement botaoCheckoutseguinte;
	
	@FindBy(name = "processAddress")
	private WebElement botaoProcessAddress;
	
	@FindBy(name = "cgv")
	private WebElement caixaTermosServico;
	
	@FindBy(name = "processCarrier")
	private WebElement botaoProcessCheckout;
	
	@FindBy(className = "bankwire")
	private WebElement subMenuPagamento;
	
	@FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")
	private WebElement botaoConfirmarPedido;
	
	public void acionarBotaoHome() {
		botaoHome.click();
	}
	
	public void acionarBotaoCompra() {
		botaoAdicionarCompra.click();
	}
	
	public void acionarBotaoCheckout() {
		botaoCheckout.click();
	}
	
	public void acionarBotaoProceedCheckout() {
		botaoCheckoutseguinte.click();
	}
	public void acionarBotaoProcessAddress() {
		botaoProcessAddress.click();
	}
	
	public void acionaCaixaTermosServico() {
		caixaTermosServico.click();
	
	}
	
	public void acionarBotaoProcessCheckoutSubMenuShipping() {
		botaoProcessCheckout.click();
	
	}
	
	public void acionarSubMenuPagamento() {
		subMenuPagamento.click();
	}
	
	public void acionarBotaoConfirmarPedido() {
		botaoConfirmarPedido.click();
	}
	
	public void moverMouseParaAbaBlouse() {
		Actions acao = new Actions(driver);
		acao.moveToElement(campoProduto).build().perform();
	}
	
	
	
	
	
	
	
	
	
	
	
}
