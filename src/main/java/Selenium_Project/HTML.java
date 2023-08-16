package Selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HTML {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("Start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://github.com/session");

		String Currenturl =driver.getCurrentUrl();	
		System.out.println(Currenturl);

		System.out.println(driver.getTitle());

		System.out.println(driver.getPageSource());


		System.out.println(driver.findElement(By.name("commit")).getTagName());

		System.out.println(driver.findElement(By.name("commit")).getAttribute("type"));

		WebElement username = driver.findElement(By.id("login_field"));
		username.sendKeys("test@gmail.com");
		System.out.println(username.getAttribute("value"));	


		System.out.println(driver.findElement(By.name("commit")).getCssValue("background-color"));



		driver.quit();



	}

}
