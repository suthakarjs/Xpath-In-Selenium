package org.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DebugTask5Redbus {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\XpathInSelenium\\driver\\chromedriver.exe");
		WebDriver redbus = new ChromeDriver();
		
		redbus.get("https://www.redbus.in/");
		redbus.manage().window().maximize();
		WebElement btnDownArrow = redbus.findElement(By.xpath("//div[@id='sign-in-icon-down']"));
		btnDownArrow.click();
		WebElement btnSignIn = redbus.findElement(By.xpath("//*[@id=\"signInLink\"]"));
		btnSignIn.click();
		
	//	Thread.sleep(3000);
		
		WebElement txtNumberBox = redbus.findElement(By.id("//input[@id='mobileNoInp']"));
		txtNumberBox.sendKeys("9597963822");
		String number = txtNumberBox.getAttribute("value");
		System.out.println(number);
	
}
	
	
	
	
	
	
	
	
	
}
