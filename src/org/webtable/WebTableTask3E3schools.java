package org.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTask3E3schools {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\XpathInSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
	
		WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
		List<WebElement> tableData = table.findElements(By.tagName("td"));
		int dataSize = tableData.size();
		
		for (int i = 0; i<dataSize; i++) {
			
			if(i%2==0) {
			WebElement rowData = tableData.get(i);
			String text = rowData.getText();
			System.out.println(text);
		}
		}
}
	
	
}
