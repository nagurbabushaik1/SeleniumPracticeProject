package Selenium_Project;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String ParentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent Window Handle "+ ParentWindowHandle);
		WebElement newWindow = driver.findElement(By.id("newWindowBtn"));
		newWindow.click();

		
		Set<String> WindowHandles = driver.getWindowHandles();
		
		for (String WindowHandle : WindowHandles) {
			
			System.out.println(WindowHandle);
			
		}
		
		
		
		
		
		
		
		
		//driver.quit();		
	}

}
