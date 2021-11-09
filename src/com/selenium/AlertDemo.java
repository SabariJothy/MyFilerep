package com.selenium;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Alert.html");

		driver.manage().window().maximize();
		WebElement b = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		b.click();
		
		
		
		}
	}



		
		
	
	
