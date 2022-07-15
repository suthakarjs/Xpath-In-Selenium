package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTask11Google {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\XpathInSelenium\\driver\\chromedriver.exe");
		WebDriver google = new ChromeDriver();
		
		google.manage().window().maximize();
		google.get("https://accounts.google.com/signup/v2/webcreateaccount? hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		WebElement txtFirstName = google.findElement(By.xpath("//input[@id='firstName']"));
		txtFirstName.sendKeys("Suthakar");
		
		WebElement txtLastName = google.findElement(By.xpath("//input[@id='lastName']"));
		txtLastName.sendKeys("JS");
		
		WebElement txtUserName = google.findElement(By.xpath("//input[@id='username']"));
		txtUserName.sendKeys("suthakarjs02");
		
		WebElement txtPasswd = google.findElement(By.xpath("//input[@name='Passwd']"));
		txtPasswd.sendKeys("85~Suthakar@js");
		
		WebElement txtConfirmPasswd = google.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		txtConfirmPasswd.sendKeys("85~Suthakar@js");
		
		WebElement btnShowPasswd = google.findElement(By.xpath("//input[@id='i2']"));
		btnShowPasswd.click();
		
//		WebElement btnNext = google.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]"));
//		btnNext.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
