package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {
	static WebDriver driver;

	

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.switchTo().frame("singleframe");
		driver.findElement(By.xpath("//input[@type='text'][position()=1]")).sendKeys("Caste Maranum");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='Multiple']//child::iframe")));
		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'and @style='float: left;height: 250px;width: 400px'])")));
		System.out.println("=============");
		//driver.findElement(By.xpath("(//input[@type='text']))")).sendKeys("auto");
		
		List<WebElement> findElements =
		driver.findElements(By.xpath("(//input[@type='text'])"));
		findElements.get(1).sendKeys("auto");
		
		
		
}
}