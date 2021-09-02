package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question4 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement frameWk = driver.findElement(By.xpath("//div[@id='heading304']"));
	    a.contextClick(frameWk).perform();
	    Robot r=new Robot();
	        r.keyPress(KeyEvent.VK_DOWN);
	    	r.keyRelease(KeyEvent.VK_DOWN);
	    	r.keyPress(KeyEvent.VK_DOWN);
	    	r.keyRelease(KeyEvent.VK_DOWN);
	    	r.keyPress(KeyEvent.VK_DOWN);
	    	r.keyRelease(KeyEvent.VK_DOWN);
	    	r.keyPress(KeyEvent.VK_DOWN);
	    	r.keyRelease(KeyEvent.VK_DOWN);
	    	r.keyPress(KeyEvent.VK_DOWN);
	    	r.keyRelease(KeyEvent.VK_DOWN);
	    	r.keyPress(KeyEvent.VK_DOWN);
	    	r.keyRelease(KeyEvent.VK_DOWN);
	    	r.keyPress(KeyEvent.VK_DOWN);
	    	r.keyRelease(KeyEvent.VK_DOWN);
	    	r.keyPress(KeyEvent.VK_DOWN);
	    	r.keyRelease(KeyEvent.VK_DOWN);
	    	r.keyPress(KeyEvent.VK_DOWN);
	    	r.keyRelease(KeyEvent.VK_DOWN);
	    	r.keyPress(KeyEvent.VK_ENTER);
	    	r.keyRelease(KeyEvent.VK_ENTER);
	    
	    	
	    	
	    }
	

	
}
