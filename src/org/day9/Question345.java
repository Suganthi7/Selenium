package org.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question345 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumNew\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(5000);
		WebElement yearDrop = driver.findElement(By.xpath("//select[@id='year']"));
		System.out.println("Year list :\n");
		Select s=new Select(yearDrop);
		List<WebElement> yearList = s.getOptions();
		for (WebElement eachYearList: yearList) {
			System.out.println(eachYearList.getAttribute("value"));
			
		}
		Thread.sleep(5000);
		System.out.println("\nMonth list :\n");
		
		WebElement monthDropDown = driver.findElement(By.xpath("//select[@id='month']"));
		Select s1=new Select(monthDropDown);
		List<WebElement> monthList = s1.getOptions();
		for (WebElement eachMonth : monthList) {
			
			System.out.println(eachMonth.getText());
			}
		System.out.println("\n Even Dates\n");
		WebElement evenDates = driver.findElement(By.xpath("//select[@id='day']"));
		Select s2=new Select(evenDates);
		List<WebElement>  evenList = s2.getOptions();
		for (int i = 0; i <evenList.size() ; i=i+2) {
			if(i%2==0) {
				
			System.out.println(evenList.get(i).getText());
			}
			
		}
		
		
	}

}
