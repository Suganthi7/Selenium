package org.day10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question14 {
	
		public static void main(String[] args) throws InterruptedException, AWTException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumNew\\Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://greenstech.in/selenium-course-content.html");
			WebElement scanner = driver.findElement(By.xpath("//h3[@id='heading882']"));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)",scanner );
			Thread.sleep(10000);
			
			driver.findElement(By.xpath("(//h2[@class='mb-0'])[6]")).click();
			Robot r=new Robot();
			for (int i = 0; i < 4; i++) {
				r.keyPress(KeyEvent.VK_TAB);
				r.keyRelease(KeyEvent.VK_TAB);
				
			}
			
	        r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			
			String parId = driver.getWindowHandle();
			Set<String> allWindId = driver.getWindowHandles();
			for (String eachId : allWindId) {
				driver.switchTo().window(eachId);
				
			}
			
			String question = driver.findElement(By.xpath("//pre[@style='word-wrap: break-word; white-space: pre-wrap;']")).getText();
			System.out.println(question);
			
		}

	}



