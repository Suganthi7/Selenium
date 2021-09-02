package org.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question47 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumNew\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
        driver.switchTo().frame(0);
		driver.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']")).click();
		Thread.sleep(10000);
        Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		//Question7
		driver.get(" https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
        driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("Greens");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']")).click();
		driver.findElement(By.xpath("(//input[@class='input_password'])[2]")).sendKeys("12345");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//img[@border='0'])[4]")).click();
		Thread.sleep(5000);
		 Alert a1 = driver.switchTo().alert();
		System.out.println(a1.getText());
			a1.accept();
		
	}

}
