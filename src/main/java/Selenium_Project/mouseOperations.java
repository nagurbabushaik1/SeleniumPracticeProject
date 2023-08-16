package Selenium_Project;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class mouseOperations {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		Actions actions = new Actions(driver);
		
		driver.get("https://qatechhub.com/mouse-hover-actions-selenium-webdriver/");
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@name='password']']")).sendKeys("admin123");
//		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
		//driver.findElement(By.xpath("//a[text()='Tutorials']"))
		
		
		actions
		.moveToElement(driver.findElement(By.xpath("//a[text()='Tutorials']")))
		.moveToElement(driver.findElement(By.xpath("//a[text()='Learn Selenium']")))
		.moveToElement(driver.findElement(By.xpath("//a[text()='Free Selenium Videos']")))
		.click()
		.perform();
		
		
		
		
		
		
	}

	

}
