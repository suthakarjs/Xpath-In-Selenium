package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTask7ClearTrip {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\XpathInSelenium\\driver\\chromedriver.exe");
		WebDriver trip = new ChromeDriver();
		
		trip.manage().window().maximize();
		trip.get("https://www.cleartrip.com/trains");
		
		WebElement txtFrom = trip.findElement(By.xpath("//input[@id='from_station']"));
		txtFrom.sendKeys("Bangalore Cant (BNC)");
		
		WebElement txtTo = trip.findElement(By.xpath("//input[@id='to_station']"));
		txtTo.sendKeys("Chennai Beach (MSB)");
		
		WebElement btnClass = trip.findElement(By.xpath("//select[@id='trainClass']"));
		btnClass.click();
		
		WebElement btnClassChoice = trip.findElement(By.xpath("//option[@value='1A']"));
		btnClassChoice.click();
		
		WebElement btnDeptDate = trip.findElement(By.xpath("//input[@id='dpt_date']"));
		btnDeptDate.click();
		
		WebElement btnDate = trip.findElement(By.xpath("(//td[@class='weekend'])[9]"));
		btnDate.click();
		
		WebElement btnSearch = trip.findElement(By.xpath("//button[@id='trainFormButton']"));
		btnSearch.click();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
