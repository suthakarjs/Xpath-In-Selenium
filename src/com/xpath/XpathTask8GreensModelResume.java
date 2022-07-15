package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTask8GreensModelResume {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\XpathInSelenium\\driver\\chromedriver.exe");
		WebDriver resume = new ChromeDriver();
		
		resume.manage().window().maximize();
		resume.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement btnResumes = resume.findElement(By.xpath("//div[@id='heading201']"));
		btnResumes.click();
		
		WebElement btnModel1 = resume.findElement(By.xpath("//*[@id=\"collapse201\"]/div/div/ul/li[1]/a"));
		btnModel1.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
