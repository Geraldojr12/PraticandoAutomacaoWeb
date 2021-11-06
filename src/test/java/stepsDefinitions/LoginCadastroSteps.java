package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import pageObjects.LoginCadastroPage;
import pageObjects.LoginPage;
import pageObjects.TelaFormularioPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class LoginCadastroSteps {
	
	@Dado("que eu estou acessando o sistema")
	public void acessandoSistema() {
	    acessarSistema();
	}
	
	@E("^aciono o botao entrar$")
	public void acionoOBotaoEntrar() throws Throwable {
		Na(LoginCadastroPage.class).acionarBotaoEntrar();
	}
	
	@Dado("informo no campo email {string}")
	public void informoNoCampoEmail(String email) {
	    Na(LoginCadastroPage.class).informarCampoEmail(email);;
	}

	@Dado("clico no botao registrar")
	public void clicoNoBotaoRegistrar() {
	    Na(LoginCadastroPage.class).acionarBotaoRegistrar();
	}

	@Entao("^sistema exibe pagina para cadastrar dados do cliente$")
	public void sistemaExibePaginaParaCadastrarDadosDoCliente() throws Throwable {
		assertEquals("YOUR PERSONAL INFORMATION", driver.findElement(By.xpath("//h3[text()='Your personal information']")).getText());
	}

	@Dado("informo no campo First name {string}")
	public void informoFirstName(String nome) {
		Na(TelaFormularioPage.class).informarCampoNome(nome);
	}

	@Dado("informo no campo Last name {string}")
	public void informoLastName(String sobrenome) {
		Na(TelaFormularioPage.class).informarCampoSobrenome(sobrenome);
	}

	@Dado("informo no campo Password {string}")
	public void informoPassword(String senha) {
		Na(TelaFormularioPage.class).informarCampoSenha(senha);
	}

	@Dado("informo no campo Adress {string}")
	public void informoAdress(String endereco) {
		Na(TelaFormularioPage.class).informarCampoEndereco(endereco);
	}

	@Dado("informo no campo City {string}")
	public void informoCity(String cidade) {
		Na(TelaFormularioPage.class).informarCampoCidade(cidade);
	}

	@Dado("informo no campo State {string}")
	public void informoState(String estado) {
		Na(TelaFormularioPage.class).informarCampoEstado(estado);
	}

	@E("^informo no campo Zip/Postal Code	\"([^\"]*)\"$")
	public void informoZipPostalCode(String code) {
		Na(TelaFormularioPage.class).informarCampoCodigoPostal(code);
	}

	@Dado("informo no campo Country {string}")
	public void informoCountry(String pais) {
		Na(TelaFormularioPage.class).informarCampoEstado(pais);
	}

	@Dado("informo no campo Mobile phone {string}")
	public void informoMobilePhone(String fone) {
		Na(TelaFormularioPage.class).informarCampoTelefone(fone);
	}

	@Dado("aciono botao Registry")
	public void acionoBotaoRegistry() {
		Na(TelaFormularioPage.class).acionarBotaoRegistrar();
	}

	@Entao("^sistema apresenta cliente cadastrado$")
	public void sistemaApresentaClienteCadastrado() throws Throwable {
		assertEquals("Geraldo Junior", driver.findElement(By.xpath("//*[@class='account']")).getText());
	}

	@Dado("no campo email adress informo meu email {string}")
	public void noCampoEmailAdressInformoMeuEmail(String email) {
	    Na(LoginPage.class).informarCampoEmail(email);
	}

	@Dado("no campo password informo minha senha {string}")
	public void noCampoPasswordInformoMinhaSenha(String senha) {
	    Na(LoginPage.class).informarCampoSenha(senha);
	}
	
	
	@E("^aciono botao login$")
	public void acionoBotaoLogin() throws Throwable {
		Na(LoginPage.class).acionarBotaoLogin();
	}
	


	
}
