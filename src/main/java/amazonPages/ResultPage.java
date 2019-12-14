package amazonPages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import testng.api.base.ProjectSpecificMethods;

public class ResultPage extends ProjectSpecificMethods {
	
	public MobileSpecPage ClickfirstMob() {
		String price = driver.findElementByXPath("(//span[@class='a-price-whole'])[1]").getText();
		System.out.println("mobile price"+price);
		driver.findElementByXPath("(//span[contains(@class,'a-size-medium a-color-base')])[1]").click();
		Set<String> window1 = driver.getWindowHandles();
		List<String> window2 = new ArrayList<String>(window1);
		driver.switchTo().window(window2.get(1));
		return new MobileSpecPage();
	}
}
