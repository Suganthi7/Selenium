package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question9 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumNew\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions a=new Actions(driver);
		Robot r=new Robot();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		Thread.sleep(3000);
		WebElement txtUser = driver.findElement(By.xpath("//input[@id='ap_email']"));
		txtUser.sendKeys("green");
		a.doubleClick(txtUser).perform();
		a.contextClick(txtUser).perform();
		r.keyPress(KeyEvent.VK_DOWN);
	     r.keyRelease(KeyEvent.VK_DOWN);
	     r.keyPress(KeyEvent.VK_ENTER);
	     r.keyRelease(KeyEvent.VK_ENTER);
	     
	   }
	}


