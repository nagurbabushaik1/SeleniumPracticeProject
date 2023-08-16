package Selenium_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselctionDropdown {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		WebElement Ideelement =driver.findElement(By.id("ide"));
		Select IdeDropdown = new Select(Ideelement);
		
		List<WebElement> IdedropdownOptions =IdeDropdown.getOptions();	
		
		for (WebElement options : IdedropdownOptions ) {
			
			System.out.println(options.getText());
			
		}
		IdeDropdown.selectByIndex(1);
		Thread.sleep(3000);
		IdeDropdown.selectByValue("vs");
		Thread.sleep(2000);
		IdeDropdown.selectByVisibleText("NetBeans");
		Thread.sleep(2000);
		IdeDropdown.deselectByVisibleText("NetBeans");
		Thread.sleep(2000);
		
		List<WebElement> SelectedOptions = IdeDropdown.getAllSelectedOptions();
		
		for (WebElement option : SelectedOptions) {
			
			System.out.println("Selected Option: "+option.getText());
		}
		driver.quit();
	}

}
