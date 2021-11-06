package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TelaFormularioPage {
	
	@FindBy(name = "customer_firstname")
	private WebElement campoNome;
	
	@FindBy(name = "customer_lastname")
	private WebElement campoSobreNome;
	
	@FindBy(name = "passwd")
	private WebElement campoPassword;
	
	@FindBy(name = "address1")
	private WebElement campoEndereco;
	
	@FindBy(name = "city")
	private WebElement campoCidade;
	
	@FindBy(name = "id_state")
	private WebElement campoEstado;
	
	@FindBy(name = "postcode")
	private WebElement campocodigoPostal;
	
	@FindBy(name = "id_country")
	private WebElement campoPais;
	
	@FindBy(name = "phone_mobile")
	private WebElement campoTelefone;
	
	@FindBy(name = "submitAccount")
	private WebElement botaoCriarConta;
	
	

	public void informarCampoNome(String nome) {
		campoNome.sendKeys(nome);
	}

	public void informarCampoSobrenome(String sobrenome) {
		campoSobreNome.sendKeys(sobrenome);
	}

	public void informarCampoSenha(String senha) {
		campoPassword.sendKeys(senha);
	}
	
	public void informarCampoEndereco(String endereco) {
		campoEndereco.sendKeys(endereco);
	}

	public void informarCampoCidade(String cidade) {
		campoCidade.sendKeys(cidade);
	}

	public void informarCampoEstado(String estado) {
		campoEstado.sendKeys(estado);
	}

	public void informarCampoCodigoPostal(String codigo) {
		campocodigoPostal.sendKeys(codigo);

	}

	public void informarCampoPais(String pais) {
		campoPais.sendKeys(pais);
	}

	public void informarCampoTelefone(String telefone) {
		campoTelefone.sendKeys(telefone);
	}

	public void acionarBotaoRegistrar() {
		botaoCriarConta.click();
	}

}
