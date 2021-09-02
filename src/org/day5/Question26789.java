package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Question26789 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Question2
		
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		Actions a= new  Actions(driver);
		WebElement primeLink = driver.findElement(By.xpath("//a[@id='nav-link-prime']"));
		a.moveToElement(primeLink).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@id='multiasins-img-link']")).click();
		
		
		
		//Question6
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement courseLink = driver.findElement(By.xpath("//div[text()='Courses ']"));
		a.moveToElement(courseLink).perform();
		WebElement sotwareTesting = driver.findElement(By.xpath("//span[text()='Software Testing (12)']"));
		a.moveToElement(sotwareTesting).perform();
		WebElement selenium = driver.findElement(By.xpath("//span[text()='Selenium Certification Training']"));
	    selenium.click();
	    Thread.sleep(2000);
	    
	    //Question7
	    driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement courseLink1 = driver.findElement(By.xpath("//div[text()='Courses ']"));
		a.moveToElement(courseLink1).perform();
	    WebElement oracle = driver.findElement(By.xpath("//span[text()='Oracle (48)']"));
	    a.moveToElement(oracle).perform(); 
	    WebElement sql = driver.findElement(By.xpath("//span[text()='SQL Certification Training']"));
	    sql.click();
	    Thread.sleep(2000);
	    
	    //Question8
	    driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement courseLink2 = driver.findElement(By.xpath("//div[text()='Courses ']"));
		a.moveToElement(courseLink2).perform();
	    WebElement dataWarehouse = driver.findElement(By.xpath("//span[text()='Data Warehousing (5)']"));
	    a.moveToElement(dataWarehouse).perform();
	    WebElement informarica = driver.findElement(By.xpath("//span[text()='Informatica Certification Training']"));
	    informarica.click();
	    Thread.sleep(2000);
	    //Question9
	    driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement courseLink3 = driver.findElement(By.xpath("//div[text()='Courses ']"));
		a.moveToElement(courseLink3).perform();
		WebElement rpa = driver.findElement(By.xpath("//span[text()='RPA (6)']"));
		a.moveToElement(rpa).perform();
		WebElement bluePrism = driver.findElement(By.xpath("//span[text()='Blue Prism Certification Training']"));
		bluePrism.click();
		
	    
	    
		
	}
	

}
