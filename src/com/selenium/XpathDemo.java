package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
	
	public static void main(String[] args) {
		
	
	
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.ticketnew.com/Movie-Ticket-Online-booking/C/Chennai");

	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//span[@class='text'][1]")).click();
	driver.findElement(By.xpath("//input[@id='txtEmail'or @placeholder='Email ID']")).sendKeys("jothi12@gmail.com");
	driver.findElement(By.xpath("//input[@id='txtpwd'and @placeholder='Password']")).sendKeys("12345678");
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//*[@class='recaptcha-checkbox-border']")).click();
	driver.switchTo().parentFrame();
	
	//driver.findElement(By.id("btnLogin")).click();

	

}
}
