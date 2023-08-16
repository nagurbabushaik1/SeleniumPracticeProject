package Selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class jsexector_Practice {

	public static void main(String[] args) throws Exception {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		//		WebElement element = (WebElement)jsExecutor.executeScript(" return document.querySelector('#email');");
		//		element.sendKeys("Id");

		//jsExecutor.executeScript("document.getElementById('email').value='HYR';");
		//jsExecutor.executeScript("document.getElementsByName('login')[0].click();");

		//	jsExecutor.executeScript("document.getElementById('email').setAttribute('style','border:5px red solid;background:yellow');");

//		jsExecutor.executeScript("window.scrollTo(0,500);");
//		jsExecutor.executeScript("window.scrollBy()0,500");
	//	jsExecutor.executeScript("document.evaluate(\"//a[.='Yada Giri Reddy ']\",document,null,XPathResult.ANY_UNORDERED_NODE_TYPE,null).singleNodeValue.scrollIntoView();");
		
	WebElement username =driver.findElement(By.id("email"));
	jsExecutor.executeScript("arguments[0].setAttribute('style','border:5px red solid;background:yellow');", username);
		
		Thread.sleep(3000);
		driver.quit();
	}

}
