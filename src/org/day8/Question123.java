package org.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question123 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumNew\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Question1
		driver.get(" http://demo.automationtesting.in/Alerts.html");
	    driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
	    driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	    Alert a = driver.switchTo().alert();
	    System.out.println(a.getText());
	    a.accept();
	    Thread.sleep(5000);
	    
	    //Question2
	    driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
	    driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	    Alert a1 = driver.switchTo().alert();
	    System.out.println(a1.getText());
	    a1.dismiss();
	    Thread.sleep(5000);
	    
	    //Question3
	    driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
	    driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	    Alert a2 = driver.switchTo().alert();
	    System.out.println(a2.getText());
	    a2.sendKeys("Java");
	    a2.accept();
	    
}

}
