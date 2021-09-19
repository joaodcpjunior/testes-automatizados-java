package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	//também é possivel mapear elementos com xpath: https://www.w3schools.com/xml/xpath_intro.asp, cssSelector e id

	@FindBy(name = "txtUsername")
	private WebElement campoUsuario;

	//@FindBy(xpath = "//div[@id='divPassword']/input[@name='txtPassword']")
	@FindBy(name = "txtPassword")
	private WebElement campoSenha;

	@FindBy(name = "Submit")
	private WebElement botaoLogin;

	public void informarCampoUsuario(String usuario) {
		campoUsuario.sendKeys(usuario);
	}

	public void informarCampoSenha(String senha) {
		campoSenha.sendKeys(senha);
	}

	public void acionarBotaoLogin() {
		botaoLogin.click();
	}
	
	public void realizarLogin(String usuario, String senha) {
		informarCampoUsuario(usuario);
		informarCampoSenha(senha);
		acionarBotaoLogin();
	}

}
