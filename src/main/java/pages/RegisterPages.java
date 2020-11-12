package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import config.PageBase;
import utils.Utils;


/**
 * 
 * @author Master
 *  Essa classe preenche o formulário
 */
public class RegisterPages extends PageBase{
	
	Utils utils = new Utils();
	
	public WebElement firstName 	= driver.findElement(By.xpath("//input[@name='fname']"));
	public WebElement lastName 		= driver.findElement(By.xpath("//input[@name='lname']"));
	public WebElement email 		= driver.findElement(By.xpath("//input[@name='email']"));
	public WebElement password 	= driver.findElement(By.xpath("//input[@name='password']"));
	public WebElement mobileNumber 		= driver.findElement(By.xpath("//input[@name='mobile']"));
	public WebElement country 		= driver.findElement(By.xpath("//span[@class='select2-chosen']"));
	public WebElement inputCountry;
	public WebElement selectCountry;
	public WebElement address1 		= driver.findElement(By.xpath("//input[@name='address1']"));
	public WebElement address2 		= driver.findElement(By.xpath("//input[@name='address2']"));
	public WebElement supplierFor   = driver.findElement(By.xpath("//option[@value='Hotels']"));
	public WebElement bottonSubmit 	= driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block btn-lg']"));
	
	public void newRegister() {
		firstName.sendKeys("Williamis");
		lastName.sendKeys("Francisco");
		email.sendKeys("testemailweb@gmail.com");
		password.sendKeys("123will");
		mobileNumber.sendKeys("11 98067 7031");
		utils.click(country, 10);
		String countryName = "Brazil";
		inputCountry 	= driver.findElement(By.xpath("//div[@id='select2-drop']//input"));
		inputCountry.sendKeys(countryName);
		selectCountry = driver.findElement(By.xpath("//div[@class='select2-result-label']/span[text()='"+countryName+"']"));
		utils.click(selectCountry, 10);
		address1.sendKeys("Av. Carlos Oberhuber, 520");
		address2.sendKeys("casa 03");
		bottonSubmit.click();	
	}
}
