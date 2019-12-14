package testcase;

import org.testng.annotations.Test;

import amazonPages.Homepage;
import testng.api.base.ProjectSpecificMethods;

public class TC001Amazon extends ProjectSpecificMethods {
	@Test
	public void runTCamazon() {
		new Homepage()
		.searchMobile()
		.ClickfirstMob()
		.addToCart()
		.proceedToBuy()
		.checkErrorMessage();
		
	}

}
