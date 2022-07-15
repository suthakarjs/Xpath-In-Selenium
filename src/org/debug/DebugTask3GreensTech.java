package org.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DebugTask3GreensTech {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\TextContainsDay4\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		WebElement txtOverview = driver.findElement(By.xpath("//span[text()='Overview']"));
		txtOverview.click();
		
		Thread.sleep(1000);

		WebElement parah = driver.findElement(By.xpath("//p[contains(text(),'expert in')]"));
		String text = parah.getText();
		System.out.println(text);
	}
	
	
	
	
	
	
	
	
	
	
}
