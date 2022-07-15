package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDay8Task1Greenscart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\XpathInSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenscart.in/");
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		
		Thread.sleep(3000);
				
		WebElement txtEmail = driver.findElement(By.id("loginEmailId"));
		txtEmail.click();
		
		actions.sendKeys("Suthakarjs85@gmail.com").perform();
		
		WebElement txtPassword = driver.findElement(By.id("loginPassword"));
		txtPassword.click();
		
		actions.sendKeys("8597@Suthakar_js").perform();
		
		WebElement btnLogin = driver.findElement(By.xpath("//input[@class='btnRegister form-control']"));
		btnLogin.click();
		
		Thread.sleep(3000);
		
		WebElement txtProduct = driver.findElement(By.xpath("//input[@id='typeahead-basic']"));
		txtProduct.click();
		actions.sendKeys("iPhone 12").perform();
		
		WebElement btnSearch = driver.findElement(By.xpath("//button[@class='btn btn-outline-secondary']"));		
		btnSearch.click();
		
		Thread.sleep(500);
		WebElement imgIphone = driver.findElement(By.xpath("(//img[@class='card-img-top'])[2]"));
		imgIphone.click();
		
		WebElement btnBuynow = driver.findElement(By.xpath("//button[text()='Buy Now']"));
		btnBuynow.click();
		
		WebElement btnGiftcode = driver.findElement(By.xpath("//button[text()='ADD GIFT CODE']"));
		btnGiftcode.click();
		
		WebElement btnGift = driver.findElement(By.xpath("//span[text()='GRN10']"));
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(false)", btnGift);
		Thread.sleep(500);
		actions.doubleClick(btnGift).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
