package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question345 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		Actions a=new Actions(driver);
		
		driver.manage().window().maximize();
		
		
       //Question5
	
		WebElement sports = driver.findElement(By.xpath("//a[text()='Sports & More']"));
		a.moveToElement(sports).perform();
		WebElement wgtGainer = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		wgtGainer.click();
		

		Thread.sleep(2000);
		//Question4
		
		driver.get("https://www.shopclues.com/wholesale.html");
		WebElement mobileMore = driver.findElement(By.xpath("//a[text()='Mobiles & More']"));
		a.moveToElement(mobileMore).perform();
	    WebElement samSung = driver.findElement(By.xpath("//a[text()='Samsung']"));
		samSung.click();
		
		//Question3
		
		driver.get(" http://www.flipkart.com");
		WebElement home = driver.findElement(By.xpath("//div[text()='Home']"));
		a.moveToElement(home).perform();
		

	}}				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
				
				
			
				

