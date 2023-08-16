package Selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocaters {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://github.com/login?return_to=https%3A%2F%2Fgithub.com%2Ftopics%2Flogin");

		Thread.sleep(2000);
		highlight(driver,driver.findElement(By.id("login_field")));
		Thread.sleep(2000);
		highlight(driver,driver.findElement(By.id("password")));
		Thread.sleep(2000);
		highlight(driver,driver.findElement(By.name("commit")));
		Thread.sleep(2000);
		highlight(driver,driver.findElement(By.tagName("h1")));
		Thread.sleep(2000);
		highlight(driver,driver.findElement(By.linkText("Forgot password?")));
		Thread.sleep(2000);
		highlight(driver,driver.findElement(By.partialLinkText("Create an ")));
		Thread.sleep(2000);
		highlight(driver,driver.findElement(By.className("header-logo")));
		Thread.sleep(3000);
		driver.close();


	}
	public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
	}

}
