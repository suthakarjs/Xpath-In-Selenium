package com.xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTask1Amazon {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\XpathInSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement txtSearchBox = driver.findElement(By.xpath("//input[@name='field-keywords']"));
		txtSearchBox.sendKeys("iPhone 13");
		WebElement btnSearch = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		btnSearch.click();
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		System.out.println(title);
		System.out.println(url);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
