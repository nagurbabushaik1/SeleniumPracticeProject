package Selenium_Project;

import java.io.File;
import java.io.FileOutputStream;
//import java.io.IOException;
import java.util.Base64;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots {


	public static void main(String[] args) throws Exception 	{

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
	byte[] byteArr = driver.getScreenshotAs(OutputType.BYTES);
//		
		File destFile = new File("./ScreenShots/img1.jpg");
//		
	FileOutputStream fos = new FileOutputStream(destFile);
//		
	fos.write(byteArr);
//		
		fos.close();
	
	System.out.println("Screen Shot Saved Successfully");
		
		
	//	FileUtils.copyFile(SrcFile, destFile);
		
		
//	 String Base64Code =  driver.getScreenshotAs(OutputType.BASE64);
//	 
//	 byte[] byteArr = Base64.getDecoder().decode(Base64Code);
//	 
//	 File destFile = new File("./Screenshots/img2.jpg");
//	 
//	 FileOutputStream fos = new FileOutputStream(destFile);
//	 
//	 fos.write(byteArr);
//	 
//	 fos.close();
//	 
//	 System.out.println("ScreenShot saved Successfully");
	 
	 
		
		
		
		
	}	

}
