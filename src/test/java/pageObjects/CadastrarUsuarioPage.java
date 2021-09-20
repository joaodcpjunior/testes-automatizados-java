package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastrarUsuarioPage {

	@FindBy(name = "systemUser[employeeName][empName]")
	private WebElement campoEmployeeName;
	
	@FindBy(name = "systemUser[userName]")
	private WebElement campoUsername;
	
	@FindBy(name = "systemUser[password]")
	private WebElement campoPassword;
	
	@FindBy(name = "systemUser[confirmPassword]")
	private WebElement campoConfirmPassword;
	
	@FindBy(name = "btnSave")
	private WebElement botaoSave;
	
	public void informarCampoEmployeeName(String employeeName) {
		campoEmployeeName.sendKeys(employeeName);
	}
	
	public void informarCampoUsername(String username) {
		campoUsername.sendKeys(username);
	}
	
	public void informarCampoPassword(String password) {
		campoPassword.sendKeys(password);
	}
	
	public void informarCampoConfirmarPassword(String confirmarPassword) {
		campoConfirmPassword.sendKeys(confirmarPassword);
	}
	
	public void acionarBotaoSalvar() throws InterruptedException {
		Thread.sleep(2000);
		botaoSave.click();
	}
	
}
