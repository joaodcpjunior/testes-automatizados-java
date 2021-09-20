package stepsDefinitions;

import static org.junit.Assert.assertTrue;
import static utils.Utils.driver;
import static utils.Utils.na;

import org.openqa.selenium.By;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastrarUsuarioPage;
import pageObjects.TelaInicialPage;

public class CadastrarUsuarioSteps {

	@Quando("eu acionar a aba admin")
	public void euAcionarAAbaAdmin() {
		na(TelaInicialPage.class).acionarAbaAdmin();
	}

	@Quando("eu acionar o botao add")
	public void euAcionarOBotaoAdd() {
		na(TelaInicialPage.class).acionarBotaoAdd();
	}

	@Quando("informar no campo employee name {string}")
	public void informarNoCampoEmployeeName(String employeeName) {
		na(CadastrarUsuarioPage.class).informarCampoEmployeeName(employeeName);
	}

	@Quando("informar no campo username {string}")
	public void informarNoCampoUsername(String username) {
		na(CadastrarUsuarioPage.class).informarCampoUsername(username);
	}

	@Quando("informar no campo password {string}")
	public void informarNoCampoPassword(String password) {
		na(CadastrarUsuarioPage.class).informarCampoPassword(password);
	}

	@E("informar no campo confirmar password {string}")
	public void informarNoCampoConfirmarPassword(String confirmPassword) {
		na(CadastrarUsuarioPage.class).informarCampoConfirmarPassword(confirmPassword);
	}

	@Quando("acionar o botao salvar")
	public void acionarOBotaoSalvar() throws InterruptedException {
		na(CadastrarUsuarioPage.class).acionarBotaoSalvar();
	}

	@Entao("o sistema cadastra o usuario {string}")
	public void oSistemaCadastraOUsuario(String username) {
		assertTrue(driver.findElement(By.xpath("//a[text()='" + username + "']")).isDisplayed());
	}

}
