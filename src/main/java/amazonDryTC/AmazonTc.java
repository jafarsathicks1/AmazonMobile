package amazonDryTC;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("twotabsearchtextbox").sendKeys("samsung galaxy m30",Keys.ENTER);
		String price = driver.findElementByXPath("(//span[@class='a-price-whole'])[1]").getText();
		System.out.println(price);
		driver.findElementByXPath("(//span[contains(@class,'a-size-medium a-color-base')])[1]").click();
		Set<String> window1 = driver.getWindowHandles();
		List<String> window2 = new ArrayList<String>(window1);
		driver.switchTo().window(window2.get(1));
		String date = driver.findElementById("ddmDeliveryMessage").getText();
		System.out.println(date);
		driver.findElementById("add-to-cart-button").click();
		String iadded = driver.findElementByXPath("//h1[@class='a-size-medium a-text-bold']").getText();
		System.out.println(iadded);
		driver.findElementById("hlb-ptc-btn-native").click();
		driver.findElementByXPath("(//input[@id='continue'])[1]").click();
		String error = driver.findElement(By.xpath("(//div[@class='a-alert-content'])[2]")).getText();
		System.out.println(error);

	}

}
