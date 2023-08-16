package Selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath_Practice {

	public static void main(String[] args) throws Exception {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("Start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.w3schools.com/");
		
		// X path ia called as XMl path Language used to find the Elements in HTml Document
		// Absolute Xpath Example
//		By services_btn = By.xpath("/html/body/div[1]/a[4]");
//		Thread.sleep(3000);
//		highlight(driver, driver.findElement(services_btn));
	
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.xpath("//a[@id='w3loginbtn']")));
		Thread.sleep(3000);
		driver.quit();
	}
	
	public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
	}

}
