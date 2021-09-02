package org.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question1and2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumNew\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/automation-practice-form/");
		//WebElement stateDrop = driver.findElement(By.xpath("//div[@id='state']"));
		
		
		//WebElement cityDrop = driver.findElement(By.xpath("//div[@id='city']"));
		
		//Select s=new Select(stateDrop);
		//List<WebElement> allState = s.getOptions();
		//System.out.println("States :"+allState);
	}

}
