package com.xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTask5GreensTech {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\XpathInSelenium\\driver\\chromedriver.exe");
		WebDriver greens = new ChromeDriver();
		
		greens.manage().window().maximize();
		greens.get("http://greenstech.in/selenium-course-content.html");
		WebElement btnInterviewQues = greens.findElement(By.xpath("//div[@id='heading20']"));
		btnInterviewQues.click();
		WebElement btnCtsQues = greens.findElement(By.xpath("//*[@id=\"collapse20\"]/div/div/ul/li[6]"));
		btnCtsQues.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
