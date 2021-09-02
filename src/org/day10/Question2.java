package org.day10;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumNew\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.findElement(By.xpath("(//input[@name='keyword'])[1]")).sendKeys("iphones 7 ");
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//p[@class='product-title'])[1]")).click();
		String parId = driver.getWindowHandle();
		Set<String> allWinId = driver.getWindowHandles();
		for (String eachId : allWinId) {
			driver.switchTo().window(eachId);
			
		}
		
		driver.findElement(By.xpath("//span[text()='add to cart']")).click();
		driver.findElement(By.xpath("//div[text()='View Cart']")).click();
		TakesScreenshot tks=(TakesScreenshot)driver;
		File  src= tks.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\admin\\eclipse-workspace\\SeleniumNew\\ScreenshotDay10\\bill.png");
		FileUtils.copyFile(src, des);
		
		
	}

}
