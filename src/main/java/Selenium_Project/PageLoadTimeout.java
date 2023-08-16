package Selenium_Project;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeout {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Instant StartTime = Instant.now();
		System.out.println(StartTime);
		driver.get("https://www.hyrtutorials.com/");
		Instant EndTime = Instant.now();
		System.out.println(EndTime);

		Duration PageloadTime = Duration.between(StartTime, EndTime);
		System.out.println("PageLoadTime: "+PageloadTime.toMillis()+" Milli Seconds");

		System.out.println(driver.getTitle());

		driver.quit();

	}

}
