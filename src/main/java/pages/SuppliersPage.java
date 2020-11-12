package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import config.PageBase;
import utils.Utils;

public class SuppliersPage extends PageBase{
	
	Utils utils = new Utils();
	
	public WebElement buttonAdd = driver.findElement(By.xpath("//button[contains(text(),'Add')]"));
	
	public void clickButtonAdd() {
		utils.click(buttonAdd, 10);
	}
	
	public void validateEmail() {
		Assert.assertTrue("validacao do email cadastrado", driver.getPageSource().contains("testemailweb@gmail.com"));
	}
}
