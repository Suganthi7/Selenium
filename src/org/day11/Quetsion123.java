package org.day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.description.modifier.SynchronizationState;

public class Quetsion123 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumNew\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//Question1		
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		List<WebElement> allTables = driver.findElements(By.tagName("table"));
		int tablesCount = allTables.size();
		System.out.println("All table:\n");
		for (WebElement eachTable : allTables) {
			System.out.println(eachTable.getText());
	}
//Question2		
		List<WebElement> allRows = driver.findElements(By.tagName("tr"));
		WebElement firstRow = allRows.get(0);
		System.out.println("\nFirstrows");
		System.out.println(firstRow.getText());
//Question3
			System.out.println("\nAll Rows");
			for (WebElement eachRow: allRows) {
		    System.out.println(eachRow.getText() );
			}

		    
		    
	}

}
