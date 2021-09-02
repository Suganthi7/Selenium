package org.day10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question1 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumNew\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.amazon.com");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphones X");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		WebElement iPhone = driver.findElement(By.xpath("(//span[@class ='a-size-medium a-color-base a-text-normal'])[2]"));
		Actions a=new Actions(driver);
		a.contextClick(iPhone).perform();
		Robot r=new Robot();
		for (int i = 0; i < 2; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		String parId = driver.getWindowHandle();
		System.out.println("Parent Id :"+parId);
		Set<String> allWinId = driver.getWindowHandles();
		System.out.println("all Windows Id :"+allWinId);
		for (String eachId : allWinId) {
			driver.switchTo().window(eachId);
			
		}
		Thread.sleep(5000);
		String priceIphone = driver.findElement(By.xpath("//span[@id='priceblock_saleprice']")).getText();
		System.out.println("IPhone price :"+priceIphone);
}

}
