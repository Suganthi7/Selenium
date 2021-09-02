package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/drag_drop.html ");
	driver.manage().window().maximize();
	Actions a=new Actions(driver);
	
	WebElement bank = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
	WebElement acc1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	a.dragAndDrop(bank, acc1).perform();
	Thread.sleep(2000);
	WebElement amt1 = driver.findElement(By.xpath("(//li[@id='fourth'])[1]"));
	WebElement amtcolmn1 = driver.findElement(By.xpath("//ol[@id='amt7']"));
	a.dragAndDrop(amt1, amtcolmn1).perform();
	Thread.sleep(2000);
	WebElement sales= driver.findElement(By.xpath("//a[text()=' SALES ']"));
	WebElement acc2 = driver.findElement(By.xpath("//ol[@id='loan']"));
	a.dragAndDrop(sales, acc2).perform();
	Thread.sleep(2000);
	WebElement amt2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
	WebElement amtclm2 = driver.findElement(By.xpath("(//ol[@class='field13 ui-droppable ui-sortable'])[2]"));
	a.dragAndDrop(amt1,amtclm2).perform();

	
	
}
}
