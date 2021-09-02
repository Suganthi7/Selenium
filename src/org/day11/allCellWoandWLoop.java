package org.day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class allCellWoandWLoop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumNew\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement  table = driver.findElement(By.tagName("table"));
		System.out.println(""+table.getText());
		List<WebElement> allROws = driver.findElements(By.tagName("tr"));
		WebElement second = allROws.get(2);
		System.out.println("\n\nSecond Row :\n"+second.getText());
		
		System.out.println("\n All table using Enhanced Loop\n");
		for (WebElement eachRow: allROws) {
			List<WebElement> cell = eachRow.findElements(By.tagName("td"));
			
			for (WebElement  eachCell: cell) {
				System.out.println(eachCell.getText());
				
				
}}
		System.out.println("\n\nNormal Loop");

	for (int i = 0; i < allROws.size(); i++){
		WebElement row = allROws.get(i);
		List<WebElement> cell = row.findElements(By.tagName("td"));
		
		for (int j = 0; j <cell.size(); j++) {
			WebElement eachCell = cell.get(j);
			System.out.println(eachCell.getText());
			
	}}	
	System.out.println("\n print particular row and cell");
	for (int i = 0; i < allROws.size(); i++){
		if (i==0||i==1||i==4) {
			
		WebElement row = allROws.get(i);
		List<WebElement> cell = row.findElements(By.tagName("td"));
		
		for (int j = 0; j <cell.size(); j++) {
			if (j==0||j==1) {
				WebElement eachCell = cell.get(j);
				System.out.println(eachCell.getText());
				
				
			}
			}}}
	System.out.println("\n\n print name ,Row and cloumn");
	
		for (int i = 0; i< allROws.size(); i++) {
			WebElement row = allROws.get(i);
			
			List<WebElement> cells = row.findElements(By.tagName("td"));
		
		for (int j = 0; j <cells.size(); j++) {
			
			WebElement eachCell = cells.get(j);
			
			String name = eachCell.getText();
			
			if (name.equals("Canada")) {
				System.out.println("Name: "+name);
				System.out.println("Row no:"+i);
				System.out.println("Row no:"+j);
				
			}
			if (name.equals("Italy")) {
				System.out.println("Name: "+name);
				System.out.println("Row no:"+i);
				System.out.println("Row no:"+j);
				
			}
			
			}
	}
	}
	
	}
