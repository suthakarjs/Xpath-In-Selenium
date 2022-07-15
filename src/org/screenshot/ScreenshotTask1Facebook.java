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
import org.openqa.selenium.grid.jmx.ManagedAttribute;

public class ScreenshotTask1Facebook {

	public static void main(String[] args) throws IOException {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\XpathInSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement loginDetails = driver.findElement(By.xpath("//div[@class='_8iep _8icy _9ahz _9ah-']"));
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		
		File source = loginDetails.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Screenshots ~ eclipse\\facebook_login_details.png");
		
		FileUtils.copyFile(source, destination);
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
