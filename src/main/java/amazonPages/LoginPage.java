package amazonPages;

import org.openqa.selenium.By;

import testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	public void checkErrorMessage() {
		driver.findElementByXPath("(//input[@id='continue'])[1]").click();
		String error = driver.findElement(By.xpath("(//div[@class='a-alert-content'])[2]")).getText();
		System.out.println(error);
		
	}

}
