package org.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DebugTask2Instagram {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\SelExcercise2Day\\driver\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		Thread.sleep(1000);
		
		WebElement tctUserName = driver.findElement(By.name("username"));
		tctUserName.sendKeys("Suthakar JS");
		
		WebElement tctPassword = driver.findElement(By.name("password"));
		tctPassword.sendKeys("abc54321");
		
		WebElement btnLogin = driver.findElement(By.xpath("//div[text()='Log In']"));
		btnLogin.click();
		
		String name = tctUserName.getAttribute("value");
		System.out.println(name);
		
		String password = tctPassword.getAttribute("value");
		System.out.println(password);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
