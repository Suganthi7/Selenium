package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question57 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement interviewQSearch = driver.findElement(By.xpath("//div[@id='heading20']"));
		interviewQSearch.click();
		WebElement ctsQsearch = driver.findElement(By.xpath("(//a[@title='Interview Questions'])[6]"));
		ctsQsearch.click();
		
		
		driver.get(" https://www.cleartrip.com/trains");
		WebElement fromStation = driver.findElement(By.xpath("//input[@id='from_station']"));
		fromStation.sendKeys("Chennai");
		WebElement toStation = driver.findElement(By.xpath("//input[@id='to_station']"));
		toStation.sendKeys("Madurai");
		WebElement btnSerach = driver.findElement(By.xpath("//button[@id='trainFormButton']"));
		btnSerach.click();
		
		
	}

}
