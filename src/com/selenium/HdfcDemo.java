package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.37841827.1661097533.1635938031-1486641431.1635938031");
		driver.manage().window().maximize();
		driver.switchTo().frame("login_page");
		WebElement c = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		c.sendKeys("123456789");
		driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']")).click();
		//driver.switchTo().defaultContent();
		
		
	}

}
