package org.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DebugTask4HdfcBank {
	
	public static void main(String[] args)  {
		

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\SelExcercise2Day\\driver\\ChromeDriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	driver.manage().window().maximize();	
	
	WebElement txtCustomerId = driver.findElement(By.xpath("(//div[contains(@class,'inputfield')])[1]"));
	txtCustomerId.sendKeys("abc859724301");
	
}
	
	
}
