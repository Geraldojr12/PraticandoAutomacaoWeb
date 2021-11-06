package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginCadastroPage {

	@FindBy(css = "[class='login']")
	private WebElement botaoEntrar;

	@FindBy(xpath = "//input[@id='email_create']")
	private WebElement informarCampoEmail;

	@FindBy(name = "SubmitCreate")
	private WebElement botaoRegistrar;

	public void acionarBotaoEntrar() {

		botaoEntrar.click();
	}

	public void informarCampoEmail(String email) {

		informarCampoEmail.sendKeys(email);;
	}

	public void acionarBotaoRegistrar() {

		botaoRegistrar.click();
	}
}