package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium\\Drivers\\IEDriverServer.exe");
		WebDriver driver1=new InternetExplorerDriver();
		driver1.get(" http://www.greenstechnologys.com/");
	    String title1=driver1.getTitle();
	    System.out.println("Title "+title1);
	    String url1=driver1.getCurrentUrl();
	    System.out.println("URL :"+url1);
	    driver1.quit();
	    WebDriver driver2=new InternetExplorerDriver();
	    driver2.get("http://demo.automationtesting.in/Register.html");
	    String title2=driver2.getTitle();
	    System.out.println("Title :"+title2);
	    String url2=driver2.getCurrentUrl();
	    System.out.println("URL :"+url2);
	    driver2.quit();
	    WebDriver driver3=new InternetExplorerDriver();
	    driver3.get("http://www.greenstechnologys.com/");
	    String title3=driver3.getTitle();
	    System.out.println("Title :"+title3);
	    String url3=driver3.getCurrentUrl();
	    System.out.println("URL :"+url3);
	    driver3.quit();
	    WebDriver driver4=new InternetExplorerDriver();
	    driver4.get("http://greenstech.in/selenium-course-content.html");
	    String title4=driver4.getTitle();
	    System.out.println("Title :"+title4);
	    String url4=driver4.getCurrentUrl();
	    System.out.println("URL :"+url4);
	    driver4.quit();
	    
	    
	}

}
