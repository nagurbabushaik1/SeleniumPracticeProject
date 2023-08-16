package Selenium_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectionDropDown {

	public static void main(String[] args) throws Exception {

		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");

		WebElement CourseDropDown = driver.findElement(By.id("course"));
		
		Select DropDownOptions = new Select(CourseDropDown);
		
		List<WebElement> courseNameDropDown  = DropDownOptions.getOptions();
		for (WebElement options : courseNameDropDown) {
			System.out.println(options.getText());
		}
		
		DropDownOptions.selectByIndex(2);
		Thread.sleep(3000);
		DropDownOptions.selectByValue("java");
		Thread.sleep(3000);
		DropDownOptions.selectByVisibleText("Javascript");
		Thread.sleep(3000);
		
		String selectedOption = DropDownOptions.getFirstSelectedOption().getText();
		
		System.out.println("Selected options: "+selectedOption);
    
		driver.quit()
;}

}
