package stepsDefinitions;

import static utils.Utils.*;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.LoginPage;

public class Hooks {

	@Before
	public void setUp() {
		acessarSistema();
		na(LoginPage.class).realizarLogin("Admin", "admin123");
	}
	
	@Before(value = "@login")
	public void login() {
		acessarSistema();
	}
	
	@After
	public void tearDown() {
		//driver.quit();
	}

}