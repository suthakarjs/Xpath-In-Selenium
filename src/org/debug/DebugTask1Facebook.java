package org.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DebugTask1Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\XpathInSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement btnCreateNewAccount = driver.findElement(By.xpath("(//a[contains(@role,'button')])[2]"));
		btnCreateNewAccount.click();
		
		Thread.sleep(1500);
		
		WebElement txtFirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		txtFirstName.sendKeys("Vijay");
		String firstname = txtFirstName.getAttribute("value");
		System.out.println(firstname);
		
		WebElement txtSurName = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]"));
		txtSurName.sendKeys("JS");
		String surname = txtSurName.getAttribute("value");
		System.out.println(surname);
		
		WebElement txtEmail = driver.findElement(By.xpath("(//input[contains(@type,'text')])[4]"));
		txtEmail.sendKeys("vijayjs85@gmail.com");
		String email = txtEmail.getAttribute("value");
		System.out.println(email);
		
		
		WebElement txtReenterEmail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		txtReenterEmail.sendKeys("vijayjs85@gmail.com");
		String Reenteredmail = txtReenterEmail.getAttribute("value");
		System.out.println(Reenteredmail);
		
		WebElement txtPassword = driver.findElement(By.xpath("(//input[contains(@type,'password')])[2]"));
		txtPassword.sendKeys("123rty789");
		String password = txtPassword.getAttribute("value");
		System.out.println(password);
		
		
		WebElement radioMale = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
		radioMale.click();
		String gender = radioMale.getAttribute("value");
		System.out.println(gender);
		
		WebElement btnSignup = driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])[1]"));
		btnSignup.click();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
