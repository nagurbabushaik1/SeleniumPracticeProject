package Selenium_Project;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartLogin {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window();		
		driver.get("https://www.flipkart.com/");
		
		String ParentWindowHandle = driver.getWindowHandle();
		System.out.println(ParentWindowHandle);
		
		driver.findElement(By.linkText("Login")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for (String windowHandle : windowHandles) {
			
			System.out.println(windowHandle);
			
		if (!windowHandles.equals(ParentWindowHandle)) {
			
			driver.switchTo().window(windowHandle);
			driver.findElement(By.className("_2IX_2- VJZDxU")).sendKeys("Nagur");
			
		}
		}
	

}
}
