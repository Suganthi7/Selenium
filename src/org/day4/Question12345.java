package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Question12345 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Question1
		driver.get("http://www.greenstechnologys.com/");
	    String t = driver.findElement(By.xpath("//u[contains(text(),'Centers ')]")).getText();
		System.out.println(t);
		
		//Question5
		String t5 = driver.findElement(By.xpath("//div[@id='content-wrapper']")).getText();
		System.out.println(t5);
		
		
		
        //Question 2 & 3 and 4
		driver.get("http://greenstech.in/selenium-course-content.html");
       
		String t3 = driver.findElement(By.xpath("(//div[@class='col-md-3 short-desc-with-logo widget widget_text'])[1]")).getText();
		String t4 = driver.findElement(By.xpath("(//div[@class='col-md-3 short-desc-with-logo widget widget_text'])[2]")).getText();
		System.out.println(" \n\n"+t3);
		System.out.println("\n\n"+t4);
		String t1 = driver.findElement(By.xpath("//div[@class='col-lg-7']")).getText();
	    System.out.println(t1);
		
		
		
		
		
		
	}

}
