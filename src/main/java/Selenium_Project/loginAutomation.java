package Selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginAutomation {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login?return_to=https%3A%2F%2Fgithub.com%2Ftopics%2Flogin");
		Thread.sleep(2000);
		
		driver.findElement(By.id("login_field")).sendKeys("nagurbabushaik");
		
		Thread.sleep(2000);

		driver.findElement(By.id("password")).sendKeys("786jamalsa");
		Thread.sleep(2000);

		driver.findElement(By.name("commit")).click();
		
		Thread.sleep(2000);

	}

}
