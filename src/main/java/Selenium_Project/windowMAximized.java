package Selenium_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class windowMAximized {

	public static void main(String[] args) throws Exception {

//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.youtube.com/watch?v=h1Mj-V_onP8&t=101s");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("Start-maximized");
		Thread.sleep(3000);
		WebDriver driver = new ChromeDriver(options);
		Thread.sleep(3000);
		driver.get("https://www.youtube.com/watch?v=h1Mj-V_onP8&t=101s");
		
		
		
		
		
	}

}
