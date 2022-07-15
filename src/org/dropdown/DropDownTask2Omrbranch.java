package org.dropdown;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.antlr.v4.runtime.misc.Array2DHashSet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTask2Omrbranch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\XpathInSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();
		
		WebElement btnSignUp = driver.findElement(By.xpath("//a[text()='Sign up']"));
		btnSignUp.click();
		
		WebElement dDnDay = driver.findElement(By.xpath("//select[@name='day']"));
		Select select = new Select(dDnDay);
		List<WebElement> dayOptions = select.getOptions();
		
		List dayList = new ArrayList<>();
		
		for (int i = 0; i < dayOptions.size(); i++) {
			
			WebElement day = dayOptions.get(i);
			String text = day.getText();
			dayList.add(text);		
		}
		
		System.out.println("List of Days --> "+dayList);
		
		Set daySet = new LinkedHashSet<>();		
		
		boolean addAllDays = daySet.addAll(dayList);
		System.out.println("Is List of day Copied to Set ? -->"+addAllDays);
		System.out.println("Set of Days --> "+daySet);
		
		if(dayList.size() == daySet.size()) {
			System.out.println("There is NO Duplicates in a DropDown of a Day menu\n");
		}
		
		else {
			System.out.println("YES There is a Dupicate in a DropDown of a Day menu\n");
		}
		
		List monthList = new ArrayList<>();
		
		WebElement dDnMonth = driver.findElement(By.xpath("//select[@name='month']"));
		Select select2 = new Select(dDnMonth);
		List<WebElement> month = select2.getOptions();
		
		for (WebElement i : month) {
			
			String text = i.getText();
			monthList.add(text);	
		}
		System.out.println("List of Months --> "+monthList);
		
		Set monthSet = new LinkedHashSet<>();
		
		boolean addAllMonth = monthSet.addAll(monthList);
		System.out.println("Is List of month copied to Set ? :"+addAllMonth);
		System.out.println("Set of Months --> "+monthSet);
		
		if(monthList.size() == monthSet.size()) {
			System.out.println("There is NO Duplicates in a DropDown of a Month menu\n");
		}
		else {
			System.out.println("YES There is a Dupicate in a DropDown of a Month menu\n");
		}
			
		WebElement dDnYear = driver.findElement(By.xpath("//select[@name='year']"));
		Select select3 = new Select(dDnYear);
		List<WebElement> year = select3.getOptions();
		
		List yearList = new ArrayList<>();
	
		
		for (WebElement i : year) {
		
			String text = i.getText();
			yearList.add(text);
		}
		
		System.out.println("List of Year --> : "+yearList);
		
		Set yearSet = new LinkedHashSet<>();
		boolean addAllYear = yearSet.addAll(yearList);
		System.out.println("Is List of year copied to Set ? :"+addAllYear);
		System.out.println("Set of Year --> : "+yearSet);
		
		if(yearList.size() == yearSet.size()) {
			System.out.println("There is NO Duplicates in a DropDown of a Year menu\n");
		}
		else {
			System.out.println("YES There is a Dupicate in a DropDown of a Year menu\n");
		}	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
