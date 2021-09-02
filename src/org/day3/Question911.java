package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question911 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Question 9
		
		driver.get(" https://www.flipkart.com/");
	    WebElement enterEmail = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		enterEmail.sendKeys("greentechnology");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		//Question 11
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Green");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Technology");
		driver.findElement(By.xpath("//input[@name='Username']")).sendKeys("greentechnology@gmail.com");
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("1234567");
		driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("1234567");
		driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]")).click();
		
		
	}

}
