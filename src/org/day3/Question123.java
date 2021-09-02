package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question123 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		//Amazon Question1
		driver.get("https://www.amazon.in/");
		WebElement txtSearch = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		txtSearch.sendKeys("iphone11+");
		WebElement btnSearch = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		btnSearch.click();
		//Questio2 Facebook
		driver.get("https://www.facebook.com/");
		WebElement txtEmail = driver.findElement(By.xpath("//input[@id='email']"));
		txtEmail.sendKeys("Greentechnology@gmail.com");
		WebElement txtPass = driver.findElement(By.xpath("//input[@id='pass']"));
		txtPass.sendKeys("12345667");
		WebElement btnLogin = driver.findElement(By.xpath("//button[@name='login']"));
		btnLogin.click();
		//Question3  and Day2 Question 9 also
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement txtFname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		txtFname.sendKeys("suganthi");
		WebElement txtLname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		txtLname.sendKeys("jayaraj");
		WebElement txtAddr = driver.findElement(By.xpath("//textarea[@rows='3']"));
		txtAddr.sendKeys("Medavakkam");
		WebElement txtMail = driver.findElement(By.xpath("//input[@type='email']"));
		txtMail.sendKeys("greenTechnology@gmail.com");
		WebElement txtPhoneNo = driver.findElement(By.xpath("//input[@type='tel']"));
		txtPhoneNo.sendKeys("987654321");
        WebElement txtPasswd = driver.findElement(By.xpath("//input[@id='firstpassword']"));
        txtPasswd.sendKeys("9876543");
        WebElement txtCpwd = driver.findElement(By.xpath("//input[@id='secondpassword']"));
        txtCpwd.sendKeys("56789543");
		 WebElement btnSubmit = driver.findElement(By.xpath("//button[@id='submitbtn']"));
        btnSubmit.click();
	}

}
