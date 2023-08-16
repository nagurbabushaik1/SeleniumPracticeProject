package Selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTextBox {

	public static void main(String[] args) throws InterruptedException {

		//.setProperty("webdriver.chrome.driver","C:\\Users\s\jamal\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://github.com/login");

		Thread.sleep(3000);

		WebElement userName = driver.findElement(By.id("login_field"));

		if (userName.isDisplayed()) {


			if (userName.isEnabled()) {

				userName.sendKeys("Nagur Babu");
				Thread.sleep(3000);
				userName.sendKeys(" Shaik");
				Thread.sleep(3000);
				System.out.println(userName.getAttribute("value"));

				userName.clear();

			}
			else {

				System.out.println("UserName is not enabled");
			}
		}


		else 
			System.out.println("User Name is not Displayed");


		Thread.sleep(3000);


		driver.close();



	}

}
