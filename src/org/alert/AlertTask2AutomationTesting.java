package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTask2AutomationTesting {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\XpathInSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement lnkAlertsWithOk = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		lnkAlertsWithOk.click();
	
		WebElement btnClick = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		btnClick.click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(1000);
		alert.sendKeys("Suthakar JS");
		alert.accept();
		
		WebElement lnktext = driver.findElement(By.xpath("//p[contains(text(),'Hello')]"));
		String text = lnktext.getText();
		System.out.println(text);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}