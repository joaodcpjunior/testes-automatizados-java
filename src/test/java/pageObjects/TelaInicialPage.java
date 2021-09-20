package pageObjects;

import static utils.Utils.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class TelaInicialPage extends BasePage{
	
	
	public void acionarAbaAdmin() {
		abaAdmin.click();
	}
	
	@FindBy(name = "btnAdd")
	private WebElement botaoAdd;
	
	public void acionarBotaoAdd() {
		botaoAdd.click();
	}
	
	public void acessarMenuCustomFiedl() {
		Actions action = new Actions(driver);
		action.moveToElement(abaPIM).build().perform();
		action.moveToElement(menuConfiguration).build().perform();
		action.moveToElement(menuField).click().build().perform();
	}

}
