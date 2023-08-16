package Selenium_Project;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class calendarHandles {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		Calendar calendars = Calendar.getInstance();		
	//	int day =30;
		//		driver.findElement(By.id("first_date_picker")).click();
		//		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()="+day+"]")).click();

		//		driver.findElement(By.id("second_date_picker")).click();
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,' ui-datepicker-other-month '))]/a[text()="+day+"]")).click();
		//		Thread.sleep(3000);

		String targetDate = "28/FEB/2025";
		//		try {

		SimpleDateFormat targetDateFormat = new SimpleDateFormat("dd/MMM/yyyy");
		targetDateFormat.setLenient(false);
		Date formatedtargetDate = targetDateFormat.parse(targetDate);
		calendars.setTime(formatedtargetDate);

		int targetMonth = calendars.get(Calendar.MONTH);
		int targetYear = calendars.get(Calendar.YEAR);
		int targetDate2 = calendars.get(Calendar.DAY_OF_MONTH);
		//		}catch (Exception e) {
		//			throw new Exception ("Invalid Date is Provided");
		//		}

		//July 2023
		driver.findElement(By.id("second_date_picker")).click();
		String CurrentDate = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		SimpleDateFormat CurrentDateFormat = new SimpleDateFormat("MMM yyyy");
		Date formattedCurrentDate = CurrentDateFormat.parse(CurrentDate);
		calendars.setTime(formattedCurrentDate);


		int CurrentMonth = calendars.get(Calendar.MONTH);
		int CurrentYear =calendars.get(Calendar.YEAR);

		while (targetMonth > CurrentMonth || targetYear > CurrentYear) {
			driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
			CurrentDate = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			CurrentDateFormat = new SimpleDateFormat("MMM yyyy");
			formattedCurrentDate = CurrentDateFormat.parse(CurrentDate);
			calendars.setTime(formattedCurrentDate);

			CurrentMonth = calendars.get(Calendar.MONTH);
			CurrentYear =calendars.get(Calendar.YEAR);
		}

		while (targetMonth < CurrentMonth || targetYear < CurrentYear) {
			driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
			CurrentDate = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			CurrentDateFormat = new SimpleDateFormat("MMM yyyy");
			formattedCurrentDate = CurrentDateFormat.parse(CurrentDate);
			calendars.setTime(formattedCurrentDate);

			CurrentMonth = calendars.get(Calendar.MONTH);
			CurrentYear =calendars.get(Calendar.YEAR);
		}


		if (targetMonth == CurrentMonth && targetYear == CurrentYear) 

			driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,' ui-datepicker-other-month '))]/a[text()="+targetDate2+"]")).click(); 

		else

			System.out.println("Something Happened");

		Thread.sleep(3000);
		driver.quit();
	}

}
