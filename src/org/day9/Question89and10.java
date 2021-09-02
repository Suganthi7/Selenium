package org.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question89and10 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumNew\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("renurenu");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("renurenu");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		WebElement roomType = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select s=new Select(roomType);
		System.out.println("Room List:\n");
		List<WebElement>  roomList= s.getOptions();
		for (WebElement eachRoom : roomList) {
			System.out.println(eachRoom.getText());
			
		}
		System.out.println("Location List:\n");
		WebElement loc = driver.findElement(By.xpath("//select[@id='location']"));
		Select s1=new Select(loc);
		List<WebElement> locList = s1.getOptions();
		for (WebElement eachLoc : locList) {
			System.out.println(eachLoc.getText());
			}
		System.out.println("Adault Room:\n");
		WebElement adtRoom = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select s2=new Select(adtRoom);
		List<WebElement> adtRoomList = s2.getOptions();
		for (WebElement eachadtlist : adtRoomList) {
			System.out.println(eachadtlist.getText());
			
		}
		
	}

}
