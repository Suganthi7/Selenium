package org.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question67 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumNew\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		WebElement countryDrop = driver.findElement(By.xpath("//select[@name='country']"));
		Select s=new Select(countryDrop);
		System.out.println("CountryList using Get text: \n");
		List<WebElement> countryList = s.getOptions();
		for (WebElement eachCountry : countryList) {
			System.out.println(eachCountry.getText());
			
		}
		System.out.println("\n\nCountry List Using Get Attribute :\n");
		for (WebElement eachcounty : countryList) {
			System.out.println(eachcounty.getAttribute("value"));
			
		}
	}

}
