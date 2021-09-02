package org.day10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question5 {public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumNew\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(" http://www.greenstechnologys.com/");
	Actions a=new Actions(driver);

	WebElement courseBtn = driver.findElement(By.xpath("//a[text()='COURSES']"));
	a.moveToElement(courseBtn).perform();
	Thread.sleep(5000);
driver.findElement(By.xpath("(//span[text()='Python'])[1]")).click();
Thread.sleep(5000);
WebElement pgDown = driver.findElement(By.xpath("(//h3[@class='panel-title'])[40]"));
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeAsyncScript("arguments[0].scrollIntoView(true)", pgDown);
Thread.sleep(5000);
Robot r=new Robot();
WebElement  extrCurr = driver.findElement(By.xpath("(//button[text()='Explore Curriculum'])[2]"));
r.keyPress(KeyEvent.VK_ESCAPE);
r.keyRelease(KeyEvent.VK_ESCAPE);
a.contextClick(extrCurr).perform();

r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);

	
}

}
