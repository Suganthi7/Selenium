package org.day9;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question12and13 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumNew\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" http://output.jsbin.com/osebed/2");
		WebElement dropFruits = driver.findElement(By.id("fruits"));
		Select s=new Select(dropFruits);
		if (s.isMultiple()) {
			System.out.println("More than one option can selected");
			
		} else {
System.out.println("only one option can selectedt");

		}
		//Select value 
		
		s.selectByIndex(2);
		s.selectByValue("grape");
		s.selectByVisibleText("Banana");
		
		//First Select
		
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println("\n\nFirst Selection Text and Value Attrivute Value");
		System.out.println(firstSelectedOption.getText());
		System.out.println("\t\t"+firstSelectedOption.getAttribute("value"));
		
		//AllOption fetch
		
		List<WebElement> allOptions = s.getOptions();
	   System.out.println("\n\nAll option Text and  Value Attribute value");
		for (WebElement  eachoption : allOptions) {
			System.out.print( eachoption.getText());
			System.out.println("\t\t"+eachoption.getAttribute("value"));
			
		}
		//All  selected option to get
		 System.out.println("\n\nAll selected option Text and  Value Attribute value");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement eachSelected : allSelectedOptions) {
			System.out.print(eachSelected.getText());
			System.out.println("\t\t"+eachSelected.getAttribute("Value"));
			
		}
		
		//Even  fruits
		 
		 System.out.println("\n\nEven fruits");
		 for (int j = 0; j < allOptions.size(); j=j+2) {
			 WebElement  even = allOptions.get(j);
			 System.out.println(even.getText());
			
			
		}
		 System.out.println("\n\nAll Non selected option Text and  Value Attribute value");
		for (int i = 0; i < allOptions.size(); i++) {
			 {
				 if (allOptions.removeAll(allSelectedOptions)==true) {
					
					System.out.println("size: "+allOptions.size()); 
					System.out.println(allOptions.get(i).getText());
					System.out.println(allOptions.get(i).getAttribute("value"));
					
				}
				}
			
			 s.deselectAll();
			 
	
	}			 
			 
}
	
}
