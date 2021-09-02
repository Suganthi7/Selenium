package org.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumNew\\Drivers\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
        driver.findElement(By.xpath("(//img[@id='user-id-goahead'])[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@class='login-input type_UserPrincipal']")).sendKeys("Greens");
        driver.findElement(By.xpath("//input[@name='AuthenticationFG.ACCESS_CODE']")).sendKeys("1234567");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//input[@id='VALIDATE_CREDENTIALS1']")).click();
		
	
	}

}
