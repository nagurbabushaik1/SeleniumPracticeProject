package Selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicHTMLControls {

	public static void main(String[] args) throws InterruptedException   {


		WebDriver driver = new ChromeDriver();
		//	driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(2000);

		driver.findElement(By.id("firstName")).sendKeys("Nagur Babu");
		Thread.sleep(1000);

		driver.findElement(By.id("lastName")).sendKeys("Shaik");
		Thread.sleep(1000);


		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("malerb")).click();


		driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("hindichbx")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("email")).sendKeys("nagur@gmail.com");
		Thread.sleep(1000);

		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(1000);

		driver.findElement(By.id("clearbtn")).click();
		//		driver.findElement(By.id("aswift_4")).click();

		//		driver.findElement(By.id("aswift_3")).click();
		//		
		//		System.out.println(driver.findElement(By.id("msg")).getText());		
		//		
		//		Thread.sleep(1000);





	}

}
