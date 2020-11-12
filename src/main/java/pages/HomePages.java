package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import config.PageBase;
import utils.Utils;

public class HomePages extends PageBase{

	Utils utils = new Utils();
	
	WebElement accounts = driver.findElement(By.xpath("//a[contains(text(),'Accounts')]"));
	WebElement suppliers = driver.findElement(By.xpath("//ul[@id = 'ACCOUNTS']/li/a[contains(text(),'Supp')]"));
	
	public void accountClick() {
		utils.click(accounts, 10);
	}
	
	public void suppliersClick() {
		utils.click(suppliers, 10);
	}
}
