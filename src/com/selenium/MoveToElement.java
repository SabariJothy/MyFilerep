package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement 
{
	public static WebDriver driver;
public static void main(String[] args) 
{ 
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
	driver=new ChromeDriver();
	
	driver.get("http://www.leafground.com/");
	driver.manage().window().maximize();
	
	
	WebElement Action1 = driver.findElement(By.xpath("//img[@class='wp-categories-icon svg-image' and @alt='Edit / Text Fields']"));
	WebElement Action2 = driver.findElement(By.xpath("//h5[text()='Image']"));
	
	Actions action= new Actions(driver);
	
	action.moveToElement(Action1);
	action.clickAndHold();
	
	action.moveToElement(Action2);
	action.release().perform();
	
	System.out.println("the image was moved");
	
	
		
	  } 
		

	}


