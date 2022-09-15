package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RealizarLoginPage {
	public RealizarLoginPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='continuar e fechar']")
	public MobileElement acessarContinuarFechar;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='entrar ou cadastrar']")
	public MobileElement acessarBtnEntrar;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='e-mail']")
	public MobileElement inserirEmail;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='senha']")
	public MobileElement inserirSenha;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='FAZER LOGIN']")
	public MobileElement btnFazerLogin;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Setor SPO, 01, Setor Policial Sul. Brasília - DF. CEP 70610200']")
	public MobileElement validarAutenticacao;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='e-mail ou senha incorretos']")
	public MobileElement mensagemEmailSenhaIncorretos;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Informe seu usuário e senha']")
	public MobileElement mensagemInformeUsuarioSenha;

	
	
}
