package com.xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTask13Myntra {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\XpathInSelenium\\driver\\chromedriver.exe");
		WebDriver myntra = new ChromeDriver();
		
		myntra.get("https://www.myntra.com/register?referer=https://www.myntra.com");
		myntra.manage().window().maximize();
		
		WebElement txtNumber = myntra.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
		txtNumber.sendKeys("9597963822");
		WebElement btnContinue = myntra.findElement(By.xpath("//div[@class='submitBottomOption']"));
		btnContinue.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
