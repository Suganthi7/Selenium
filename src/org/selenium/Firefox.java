package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox{
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\eclipse-workspace\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.greenstechnologys.com/");
		String title = driver.getTitle();
		System.out.println("Title :"+title);
		String url = driver.getCurrentUrl();
		System.out.println("URL :"+url);
		driver.quit();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		driver1.get("https://www.facebook.com/");
		String title1=driver1.getTitle();
		System.out.println("Title :"+title1);
		String url1=driver1.getCurrentUrl();
		System.out.println("URL :"+url1);
		driver1.quit();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver2=new FirefoxDriver();
		driver2.get(" https://www.amazon.in");
		String title2=driver2.getTitle();
		System.out.println("Title :"+title2);
		String url2=driver2.getCurrentUrl();
		System.out.println("URL :"+url2);
		driver2.quit();
		WebDriver driver3=new FirefoxDriver();
		driver3.get("http://greenstech.in/selenium-course-content.html");
		String title3=driver3.getTitle();
		System.out.println("Title :"+title3);
		String url3=driver3.getCurrentUrl();
		System.out.println("URL :"+url3);
		driver3.quit();
		
		}	
	}


