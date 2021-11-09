package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		
		WebElement d = driver.findElement(By.xpath("//iframe[@src='default.html']"));
	
		driver.switchTo().frame(d);
		
		WebElement c = driver.findElement(By.xpath("//button[@id='Click']"));
		c.click();
		driver.switchTo().parentFrame();
	
		WebElement d1 = driver.findElement(By.xpath("//iframe[@src='page.html']"));
		
		driver.switchTo().frame(d1);
		driver.switchTo().frame("frame2");
		WebElement c1 = driver.findElement(By.id("Click1"));
		c1.click();
		
}
	}