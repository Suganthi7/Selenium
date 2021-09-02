package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.get(" http://www.greenstechnologys.com/");
		String title1=driver1.getTitle();
		System.out.println("Title :"+title1);
		String url1=driver1.getCurrentUrl();
		System.out.println("URL :"+url1);
		driver1.quit();
		WebDriver driver2=new ChromeDriver();
		driver2.get("http://gmail.com/");
		String title2=driver2.getTitle();
		System.out.println("Title :"+title2);
		String url2=driver2.getCurrentUrl();
		System.out.println("URL :"+url2);
		driver2.quit();
		WebDriver driver3=new ChromeDriver();
		driver3.get(" http://www.flipkart.com/");
		String title3=driver3.getTitle();
		System.out.println("Title :"+title3);
		String url3=driver3.getCurrentUrl();
		System.out.println("URl :"+url3);
        driver3.quit();
        WebDriver driver4=new ChromeDriver();
        driver4.get("http://greenstech.in/selenium-course-content.html");
        String title4=driver4.getTitle();
        System.out.println("Title :"+title4);
        String url4=driver4.getCurrentUrl();
        System.out.println("URL :"+url4);
        driver4.quit();
		
		
	}

}
