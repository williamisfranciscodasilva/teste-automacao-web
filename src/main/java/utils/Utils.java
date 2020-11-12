package utils;

import org.openqa.selenium.WebElement;

public class Utils {
	
	public void click(WebElement element, int timeout) {
		
		int count = 0;
		while(count < timeout) {
			
			if(element.isDisplayed()) {
				element.click();
				break;
			}
			else {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
				count++;
		}
	}
}
