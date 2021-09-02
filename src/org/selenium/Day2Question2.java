package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Question2 {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.redbus.in/ ");
	WebElement txtFrom = driver.findElement(By.id("src"));
	txtFrom.sendKeys("Chennai");
	WebElement txtTo = driver.findElement(By.id("dest"));
	txtTo.sendKeys("Madurai");
	WebElement date = driver.findElement(By.id("onward_cal"));
	date.sendKeys("02-jun-2021");
	WebElement searchBtn = driver.findElement(By.id("search_btn"));
	searchBtn.click();
	
	}
}
