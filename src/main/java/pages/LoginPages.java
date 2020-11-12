package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import config.PageBase;

public class LoginPages extends PageBase {
	
	public WebElement inputEmail = driver.findElement(By.xpath("/html/body/div[1]/form[1]/div[1]/label[1]/input"));
	public WebElement buttonSubmit = driver.findElement(By.xpath("//span[contains(text(),'Login')]/.."));
	public WebElement inputpassword = driver.findElement(By.name("password"));
	
	public void login() {
		
		inputEmail.sendKeys("admin@phptravels.com");
		inputpassword.sendKeys("demoadmin");
		buttonSubmit.click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
