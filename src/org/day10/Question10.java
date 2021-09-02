package org.day10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question10 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumNew\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.flipkart.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mask");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Nea N-95 5 Layer Reusable Anti-Pollution , Anti- Bacter...']")).click();
		String parId = driver.getWindowHandle();
		Set<String> allWinId = driver.getWindowHandles();
		for (String eachId : allWinId) {
			driver.switchTo().window(eachId);
			
		}
		
		  driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("600100");
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//span[text()='Check']")).click();
		
		
	}

}



