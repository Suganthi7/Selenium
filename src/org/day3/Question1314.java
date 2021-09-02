package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1314{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Question13
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("987654321");
		driver.findElement(By.xpath("//div[@class='submitBottomOption']")).click();
		//Questio14
		driver.get("https://www.swiggy.com/");
		driver.findElement(By.xpath("//a[@class='r2iyh']")).click();
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9876543321");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Green");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("greentechnology@gmial.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234567");
		driver.findElement(By.xpath("//a[@class='a-ayg']")).click();
		
	}

}
