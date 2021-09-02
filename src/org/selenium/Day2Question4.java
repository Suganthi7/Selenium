package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Question4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://infinity.icicibank.com/corp/Login.jsp");
		WebElement txtMobile = driver. findElement(By.xpath("(//label[@for=' '])[3]"));
		txtMobile.sendKeys("456789342");
		
		WebElement mobileNo = driver.findElement(By.xpath("//input[@title='Registered Mobile Number']"));
		mobileNo.sendKeys("34556789298");
		
		
		
		WebElement btnLogin = driver.findElement(By.xpath("//input[@value='Authenticate']1"));
		btnLogin.click();
	}

}
