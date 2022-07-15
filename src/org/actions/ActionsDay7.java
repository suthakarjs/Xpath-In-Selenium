package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDay7 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\XpathInSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement bankSourc = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement bankDest = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		WebElement sourc5000 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement dest5000 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		WebElement salesSourc = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement salesDest = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		
		WebElement sou5000 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement des5000 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		
		Actions actions = new Actions(driver);
		
		actions.dragAndDrop(bankSourc, bankDest).perform();
		actions.dragAndDrop(sourc5000, dest5000).perform();
		actions.dragAndDrop(salesSourc, salesDest).perform();
		actions.dragAndDrop(sou5000, des5000).perform();
		
		WebElement btnPerfect = driver.findElement(By.xpath("//a[text()='Perfect!']"));
		String text = btnPerfect.getText();
		System.out.println(text);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
