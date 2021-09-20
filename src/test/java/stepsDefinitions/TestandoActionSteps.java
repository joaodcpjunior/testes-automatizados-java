package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

public class TestandoActionSteps {

	@Quando("eu acionar o submenu Custom Field")
	public void euAcionarOSubmenuCustomField() {
	    na(TelaInicialPage.class).acessarMenuCustomFiedl();
	}

	@Entao("o sistema apresenta a tela Custom Field")
	public void oSistemaApresentaATelaCustomField() {
	    assertEquals("Defined Custom Fields", driver.findElement(By.xpath("//div/h1[text()='Defined Custom Fields']")).getText());	    
	}
}
