package org.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
	
public static void main(String[] args) {
	
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");	
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get(" http://gmail.com/");
	
	WebElement findElement = driver.findElement(By.xpath(""));
	findElement.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
