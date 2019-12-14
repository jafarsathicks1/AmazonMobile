package amazonPages;

import testng.api.base.ProjectSpecificMethods;

public class CartCnfirmtionPage extends ProjectSpecificMethods {
	public LoginPage proceedToBuy() {
		String iadded = driver.findElementByXPath("//h1[@class='a-size-medium a-text-bold']").getText();
		System.out.println(iadded);
		driver.findElementById("hlb-ptc-btn-native").click();
		return new LoginPage();
	}

}
