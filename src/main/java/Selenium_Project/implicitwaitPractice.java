package Selenium_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitwaitPractice {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");

		driver.findElement(By.id("btn1")).click();
		driver.findElement(By.id("btn2")).click();
		driver.findElement(By.id("txt1")).sendKeys("Nagur");
		driver.findElement(By.id("txt2")).sendKeys("Nagur2");
		driver.quit();


	}

}
