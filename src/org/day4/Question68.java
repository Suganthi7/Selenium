package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question68 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//Question6
		driver.get("https://www.facebook.com/");
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("Greens");
		String s1=txtEmail.getAttribute("value");
		System.out.println(s1);
		
		//Question8 
		
		driver.get("http://adactinhotelapp.com/");
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("chennai");
		String s2 = txtUserName.getAttribute("value");
		System.out.println("\n User Name: "+s2);
		WebElement txtPwd = driver.findElement(By.id("password"));
		txtPwd.sendKeys("123456");
		String s3 = txtPwd.getAttribute("value");
		System.out.println("\n Password : "+s3);
		
		
		
		
		
	}

}
