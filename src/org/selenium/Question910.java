package org.selenium;

import org.openqa.selenium.By;import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question910 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Question9 Automation Testing
		
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement txtFname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		txtFname.sendKeys("suganthi");
		WebElement txtLname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		txtLname.sendKeys("jayaraj");
		WebElement txtAddr = driver.findElement(By.xpath("//textarea[@rows='3']"));
		txtAddr.sendKeys("Medavakkam");
		WebElement txtEmail = driver.findElement(By.xpath("//input[@type='email']"));
		txtEmail.sendKeys("greenTechnology@gmail.com");
		WebElement txtPhoneNo = driver.findElement(By.xpath("//input[@type='tel']"));
		txtPhoneNo.sendKeys("987654321");
        WebElement txtPasswd = driver.findElement(By.xpath("//input[@id='firstpassword']"));
        txtPasswd.sendKeys("9876543");
        WebElement txtCpwd = driver.findElement(By.xpath("//input[@id='secondpassword']"));
        txtCpwd.sendKeys("56789543");
		 WebElement btnSubmit = driver.findElement(By.xpath("//button[@id='submitbtn']"));
        btnSubmit.click();
       
        //Question10  
        
        driver.get("http://adactinhotelapp.com/");
        WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
        userName.sendKeys("suganthi");
        WebElement userPwd = driver.findElement(By.xpath("//input[@id='password']"));
        userPwd.sendKeys("123456");
        WebElement btnLogin = driver.findElement(By.xpath("//input[@id='login']"));
        btnLogin.click();
        
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
