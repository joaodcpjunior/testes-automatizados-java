package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;
import static utils.Utils.na;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;

public class LoginSteps {
		
	@Quando("eu informar o usuario {string}")
	public void euInformarOUsuario(String usuario) {
		na(LoginPage.class).informarCampoUsuario(usuario);
	}

	@Quando("informar a senha {string}")
	public void informarASenha(String senha) {
		na(LoginPage.class).informarCampoSenha(senha);
	}

	@Quando("clicar no botao login")
	public void clicarNoBotaoLogin() {
		na(LoginPage.class).acionarBotaoLogin();
	}

	@Entao("o sistema exibe a mensagem de usuario invalido")
	public void oSistemaExibeAMensagemDeUsuarioInvalido() {
		assertEquals("Invalid credentials", driver.findElement(By.id("spanMessage")).getText());
	}

	@Entao("o sistema exibe o usuario logado")
	public void oSistemaExibeOUsuarioLogado() {
	    assertEquals("Welcome Vishwajeet", driver.findElement(By.id("welcome")).getText());
	}

}
