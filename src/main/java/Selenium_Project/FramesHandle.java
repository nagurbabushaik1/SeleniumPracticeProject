package Selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FramesHandle {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.id("name")).sendKeys("text1");
		
		driver.switchTo().frame("frm1");
		Thread.sleep(3000);
		Select courseName = new Select(driver.findElement(By.id("course")));
		courseName.selectByVisibleText("Java");
		
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frm2");
		Thread.sleep(3000);

		driver.findElement(By.id("firstName")).sendKeys("Nagur Babu");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frm1");
		Thread.sleep(3000);

		courseName.selectByVisibleText("Dot Net");
		Thread.sleep(3000);

     	driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("text2");
		
		driver.quit();
		}

}
