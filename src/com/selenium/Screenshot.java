package com.selenium;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		
		TakesScreenshot tks= (TakesScreenshot)driver;
		
	File souceLocation=tks.getScreenshotAs(OutputType.FILE);//get sc panra
	
	File desLocation= new File("./Screenshot/leafs.png");//store 
	
	
	try {
		FileUtils.copyFile(souceLocation, desLocation);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
//	try{
//	
//		FileUtils.copyFile(souceLocation,desLocation);
//		
//	}catch(IOException e) {
//		
//		e.printStackTrace();
//	}
//		
		
System.out.println("============Screenshot has taken======");
	}

			 
		

	}

	


