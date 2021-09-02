package org.day10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumNew\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/python-training.html");
		WebElement pgDown = driver.findElement(By.xpath("(//h3[@class='panel-title'])[1]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", pgDown);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h3[text()='Selenium Test Papers']")).click();
		Thread.sleep(5000);
		WebElement  pgDown1 = driver.findElement(By.xpath("//h3[text()='Selenium Day 6 Task']"));
		js.executeScript("arguments[0].scrollIntoView(true)", pgDown1);
		driver.findElement(By.xpath("//h3[text()='Selenium Day 10 Task']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Windows Handling']")).click();
		Thread.sleep(5000);
		String parId = driver.getWindowHandle();
		Set<String> allWinId = driver.getWindowHandles();
		for (String eachId : allWinId) {
			if (!parId.equals(allWinId)) {
				
			
			driver.switchTo().window(eachId);
			}
		}
		String qns = driver.findElement(By.xpath("//pre[@style='word-wrap: break-word; white-space: pre-wrap;']")).getText();
		System.out.println(qns.subSequence(0, 150));
		
		
		
	}

}
