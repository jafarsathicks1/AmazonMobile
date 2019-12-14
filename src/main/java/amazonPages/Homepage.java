package amazonPages;

import org.openqa.selenium.Keys;

import testng.api.base.ProjectSpecificMethods;

public class Homepage extends ProjectSpecificMethods {
	
	public ResultPage searchMobile() {
		driver.findElementById("twotabsearchtextbox").sendKeys("samsung galaxy m30",Keys.ENTER);
		return new ResultPage();
	}

}
