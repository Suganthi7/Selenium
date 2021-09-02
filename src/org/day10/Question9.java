package org.day10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question9 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumNew\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.flipkart.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("  redmi phone");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='REDMI 9i (Midnight Black, 64 GB)']")).click();
		String parId = driver.getWindowHandle();
		Set<String> allWinId = driver.getWindowHandles();
		for (String eachId : allWinId) {
			driver.switchTo().window(eachId);
			
		}
		Thread.sleep(5000);
		String  redmiPrice = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']")).getText();
		System.out.println("Laptop price:\n"+redmiPrice);

}}
