package org.dropdown;

import java.security.cert.PKIXRevocationChecker.Option;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v100.page.Page.GetAppIdResponse;
import org.openqa.selenium.support.ui.Select;

public class DropDownTask1Adactinapp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\XpathInSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement txtUsername = driver.findElement(By.xpath("//input[@id='username']"));
		txtUsername.sendKeys("suthakar");
		
		WebElement txtPassword = driver.findElement(By.xpath("//input[@id='password']"));
		txtPassword.sendKeys("85~Suthakarjs");
		
		WebElement btnLogin = driver.findElement(By.xpath("//input[@id='login']"));
		btnLogin.click();
		
		WebElement dDnLocation = driver.findElement(By.xpath("//select[@id='location']"));
		
		Select select = new Select(dDnLocation);
		List<WebElement> locOptions = select.getOptions();
		select.selectByIndex(5);
//		int locSize = locOptions.size();
//		System.out.println(locSize);
		
//		for (int i = 0; i < locSize; i++) {
//			
//			WebElement loc = locOptions.get(i);
//			String locationNames = loc.getText();
//			System.out.println(locationNames);
//			
//		}
		
		WebElement dDnHotels = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select select1 = new Select(dDnHotels);
		List<WebElement> hotelOptions = select1.getOptions();
		select1.selectByIndex(3);
		
//		for (int i = 0; i < hotelOptions.size(); i++) {
//			
//			WebElement element = hotelOptions.get(i);
//			String hotelNames = element.getText();
//			System.out.println(hotelNames);
//			
//		}
		
		
		WebElement dDnRoomType = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select select2 = new Select(dDnRoomType);
		List<WebElement> roomTypeoptions = select2.getOptions();
		select2.selectByIndex(2);
		
		WebElement dDnNoOfRoom = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select select3 = new Select(dDnNoOfRoom);
		List<WebElement> noOfRoomsOptions = select3.getOptions();
		select3.selectByValue("3");
		
//		WebElement checkInDate = driver.findElement(By.xpath("//input[@id='datepick_in']"));
//		checkInDate.sendKeys("10/06/2022");
//		
//		WebElement checkOutDate = driver.findElement(By.xpath("//input[@id='datepick_out']"));
//		checkOutDate.sendKeys("15/06/2022");
		
		WebElement dDnNoOfAdults = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select select4 = new Select(dDnNoOfAdults);
		List<WebElement> adultsOptions = select4.getOptions();
		select4.selectByVisibleText("2 - Two");
		
		WebElement dDnNoOfChilds = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select select5 = new Select(dDnNoOfChilds);
		List<WebElement> childOptions = select5.getOptions();
		select5.selectByVisibleText("2 - Two");		
		
		WebElement btnSearch = driver.findElement(By.xpath("//input[@id='Submit']"));
		btnSearch.click();
		
		WebElement btnRadio = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		btnRadio.click();
		
		WebElement btnContinue = driver.findElement(By.xpath("//input[@id='continue']"));
		btnContinue.click();
		
		WebElement txtFirstName = driver.findElement(By.xpath("//input[@id='first_name']"));
		txtFirstName.sendKeys("shyeirofj");
		
		WebElement txtLastName = driver.findElement(By.xpath("//input[@id='last_name']"));
		txtLastName.sendKeys("yhkj");
		
		WebElement txtAddress = driver.findElement(By.xpath("//textarea[@id='address']"));
		txtAddress.sendKeys("111,asdfghjk jkilou");
		
		WebElement txtCardNo = driver.findElement(By.xpath("//input[@id='cc_num']"));
		txtCardNo.sendKeys("1223456765438976");
		
		WebElement dDnCardType = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select select6 = new Select(dDnCardType);
		List<WebElement> cardTypeOptions = select6.getOptions();
		select6.selectByIndex(1);
		
		WebElement dDnExpMonth = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select select7 = new Select(dDnExpMonth);
		List<WebElement> expMonthOptions = select7.getOptions();
		select7.selectByIndex(5);
		
		WebElement dDnExpYear = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select select8 = new Select(dDnExpYear);
		List<WebElement> expYearOptions = select8.getOptions();
		select8.selectByIndex(6);
			
		WebElement txtCvvNo = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		txtCvvNo.sendKeys("123");		
		
		WebElement btnBooknow = driver.findElement(By.xpath("//input[@id='book_now']"));
		btnBooknow.click();
		
		Thread.sleep(5000);
		
		WebElement txtOrderNo = driver.findElement(By.xpath("//input[@name='order_no']"));
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		
		Object orderNo = executor.executeScript("return arguments[0].getAttribute('value')", txtOrderNo);
		System.out.println(orderNo);
		
//		String orderNum = txtOrderNo.getAttribute("value");
//		System.out.println(orderNum);
		

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static void select(WebElement dDnHotels) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
