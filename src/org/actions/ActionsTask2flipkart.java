package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.DisplayAction;

public class ActionsTask2flipkart {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\XpathInSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement btnExit = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnExit.click();
			
		
		WebElement lnkElectronics = driver.findElement(By.xpath("//div[text()='Electronics']"));
		
//		WebElement lnkLaptops = driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(lnkElectronics).perform();
//		actions.moveToElement(lnkLaptops).perform();
		
		
		WebElement lnkFlipkart = driver.findElement(By.xpath("//span[@class='z3ht-w']"));
		String text = lnkFlipkart.getText();
		System.out.println(text);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
