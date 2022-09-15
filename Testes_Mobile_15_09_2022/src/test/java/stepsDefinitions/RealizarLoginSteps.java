package stepsDefinitions;

import static utils.Utils.driver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pageObjects.RealizarLoginPage;

public class RealizarLoginSteps {
	
	RealizarLoginPage login = new RealizarLoginPage(driver);
	
	
	@Dado("que o usuario realize o login com os dados corretos")
	public void queOUsuarioRealizeOLoginComOsDadosCorretos() throws InterruptedException {
		login.acessarContinuarFechar.click();
		login.acessarBtnEntrar.click();
		login.inserirEmail.sendKeys("admin@gmail.com");
		login.inserirSenha.sendKeys("admin");
		login.btnFazerLogin.click();
		//Thread.sleep(2000);
	}

	@Entao("apresentar o endereco do usuario na tela principal")
	public void apresentarOEnderecoDoUsuarioNaTelaPrincipal() {
	   login.validarAutenticacao.isEnabled();
	}

	@Dado("que o usuario realize o login com os dados incorretos")
	public void queOUsuarioRealizeOLoginComOsDadosIncorretos() {
		login.acessarContinuarFechar.click();
		login.acessarBtnEntrar.click();
		login.inserirEmail.sendKeys("admin@gmail.com");
		login.inserirSenha.sendKeys("adminErro");
		login.btnFazerLogin.click();
	}

	@Entao("apresentar a mensagem: e-mail ou senha incorretos")
	public void apresentarAMensagemEMailOuSenhaIncorretos() {
		login.mensagemEmailSenhaIncorretos.isEnabled();
	}

	@Dado("que o usuario realize o login sem preencher o e-mail")
	public void queOUsuarioRealizeOLoginSemPreencherOEMail() {
		login.acessarContinuarFechar.click();
		login.acessarBtnEntrar.click();
		login.inserirEmail.sendKeys("");
		login.inserirSenha.sendKeys("rhayk5432100");
		login.btnFazerLogin.click();
	}

	@Entao("apresentar a mensagem: informe o seu usuario e senha")
	public void apresentarAMensagemInformeOSeuUsuarioESenha() {
		login.mensagemInformeUsuarioSenha.isEnabled();
	}

	@Dado("que o usuario realize o login sem preencher a senha")
	public void queOUsuarioRealizeOLoginSemPreencherASenha() {
		login.acessarContinuarFechar.click();
		login.acessarBtnEntrar.click();
		login.inserirEmail.sendKeys("admin@gmail.com");
		login.inserirSenha.sendKeys("");
		login.btnFazerLogin.click();
		login.mensagemInformeUsuarioSenha.isEnabled();
	}

}
