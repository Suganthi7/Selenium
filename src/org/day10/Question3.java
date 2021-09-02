package org.day10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumNew\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.homedepot.com");
		driver.findElement(By.xpath("//input[@id='headerSearch']")).sendKeys("celling fan ");
		driver.findElement(By.xpath("//button[@title='Submit Search']")).click();
		driver.findElement(By.xpath("(//span[@class='product-pod__title__product'])[1]")).click();
		Thread.sleep(5000);
		
		
		
		String parId = driver.getWindowHandle();
		Set<String> allWinId = driver.getWindowHandles();
		for (String eachId : allWinId) {
			driver.switchTo().window(eachId);
			
		}
		Thread.sleep(5000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(10000);
		//WebElement  dimension = driver.findElement(By.xpath("//h4[text()='Dimensions']"));
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView(true)", dimension);
		
	
		
		}
	

	

}
