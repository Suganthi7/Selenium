package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		WebElement txtFname = driver.findElement(By.xpath("//input[@id='firstName']"));
		txtFname.sendKeys("Green");
		WebElement txtLname = driver.findElement(By.xpath("//input[@id='lastName']"));
		txtLname.sendKeys("Technology");
		WebElement userEmail = driver.findElement(By.xpath("//input[@id='userEmail']"));
		userEmail.sendKeys("greetechnology@gmail.com");
		WebElement txtMobile = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']"));
		txtMobile.sendKeys("987654321");
		WebElement txtAddr = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
		txtAddr.sendKeys("Chennai");
		WebElement btnSubmit = driver.findElement(By.xpath("//button[@type='submit']"));
		btnSubmit.click();
	}

}
