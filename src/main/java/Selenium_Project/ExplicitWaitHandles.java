package Selenium_Project;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ExplicitWaitHandles {


	//@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		
		FluentWait <WebDriver>  wait= new FluentWait <WebDriver> (driver);
		wait.withTimeout(Duration.ofMillis(5000));
		
	//	driver.manage().timeouts() .implicitlyWait(10,TimeUnit.SECONDS);		
	//	WebDriverWait wait = new WebDriverWait(driver ,10);
		driver.get("https://testproject.io/");

		String ParentHandle = driver.getWindowHandle();
		System.out.println("Parent Window Handle: "+ParentHandle);
		driver.findElement(By.linkText("Login")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {

			System.out.println(windowHandle);
			if (!windowHandle.equals(ParentHandle)) {
			driver.switchTo().window(windowHandle);
			
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("username")));
			
			driver.findElement(By.id("username")).sendKeys("Nagur Babu");

		}
		}

		driver.quit();		
	}



}
