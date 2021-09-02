package org.day10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumNew\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.snapdeal.com/ ");
		driver.findElement(By.xpath("//input[@placeholder='Search products & brands']")).sendKeys("  hand sanitizer");
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		driver.findElement(By.xpath("(//img[@title='Sterlomax 80% Ethanol Based Sanitizers 2000 mL Pack of 4'])[2]")).click();
		Thread.sleep(5000);
		String parId = driver.getWindowHandle();
		Set<String> allWinId = driver.getWindowHandles();
		for (String eachId: allWinId) {
			driver.switchTo().window(eachId);
			
			
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='add to cart']")).click();

	}

}
