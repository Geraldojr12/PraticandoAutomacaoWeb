package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(name = "email")
	private WebElement campoEmail;
	
	@FindBy(name = "passwd")
	private WebElement campoSenha;
	
	@FindBy(name = "SubmitLogin")
	private WebElement botaoLogin;
	
	public void informarCampoEmail(String email) {
		campoEmail.sendKeys(email);
	}
	
	public void informarCampoSenha(String senha) {
		campoSenha.sendKeys(senha);
	}
	
	public void acionarBotaoLogin() {
		botaoLogin.click();
	}
	
	public void realizarLogin(String email, String senha) {
		informarCampoEmail(email);
		informarCampoSenha(senha);
		acionarBotaoLogin();
	}
	
}
