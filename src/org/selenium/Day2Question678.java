package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Question678 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//Question6
		
		driver.get("https://www.swiggy.com/");
		WebElement location = driver.findElement(By.id("location"));
		location.sendKeys("Sangeetha");
		WebElement btnFind = driver.findElement(By.className("sZsUd"));
		btnFind.click();
		
		//Question7
		
		driver.get("https://www.snapdeal.com/login");
		WebElement signUp = driver.findElement(By.id("userName"));
		signUp.sendKeys("greenTechnology@gmail.com");
		WebElement btn = driver.findElement(By.id("checkUser"));
		btn.click();
		
		//Question8 Instagram
		
        
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page ");
		WebElement txtMobileNo = driver.findElement(By.xpath("//input[@name='username']"));
		txtMobileNo.sendKeys("98765439");
		WebElement txtPwd = driver.findElement(By.xpath("//input[@name='password']"));
		txtPwd.sendKeys("122345");
		WebElement login = driver.findElement(By.xpath("//div[@class='                     Igw0E     IwRSH      eGOV_         _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB                                                    ']"));
		login.click();
		
		
	}

}
