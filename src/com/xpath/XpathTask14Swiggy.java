package com.xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTask14Swiggy {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\XpathInSelenium\\driver\\chromedriver.exe");
		WebDriver swiggy = new ChromeDriver();
		
		swiggy.manage().window().maximize();
		swiggy.get("https://www.swiggy.com/");
		
		WebElement btnSignup = swiggy.findElement(By.xpath("//a[@class='r2iyh']"));
		btnSignup.click();
		
		WebElement txtPhone = swiggy.findElement(By.xpath("//input[@id='mobile']"));
		txtPhone.sendKeys("9597963822");
		
		WebElement txtName = swiggy.findElement(By.xpath("//input[@id='name']"));
		txtName.sendKeys("Suthakar");
		
		WebElement txtEmail = swiggy.findElement(By.xpath("//input[@id='email']"));
		txtEmail.sendKeys("suthakarjs85@gmail.com");
		
		WebElement txtPasswd = swiggy.findElement(By.xpath("//input[@id='password']"));
		txtPasswd.sendKeys("abc12345");
		
		WebElement btnContinue = swiggy.findElement(By.xpath("//a[@class='a-ayg']"));
		btnContinue.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
