package amazonPages;

import testng.api.base.ProjectSpecificMethods;

public class MobileSpecPage extends ProjectSpecificMethods {
	public CartCnfirmtionPage addToCart() {
		String date = driver.findElementById("ddmDeliveryMessage").getText();
		System.out.println(date);
		driver.findElementById("add-to-cart-button").click();
		return new CartCnfirmtionPage();
	}

}
