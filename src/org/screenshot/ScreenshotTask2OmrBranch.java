package org.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotTask2OmrBranch {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\XpathInSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		
		WebElement lnkSignup = driver.findElement(By.xpath("//a[text()='Sign up']"));
		lnkSignup.click();
		
		WebElement signupDetails = driver.findElement(By.xpath("//form[@id='signup']"));
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		
		File source = signupDetails.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Screenshots ~ eclipse\\omrbranch_signup_details.png");
		
		FileUtils.copyFile(source, destination);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
