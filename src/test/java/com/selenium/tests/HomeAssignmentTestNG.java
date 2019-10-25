package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeAssignmentTestNG {
	
	WebDriver driver = null;

	@BeforeTest
	public void setUpTest(){
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		
		//driver = new HtmlUnitDriver(true);

	}
	
	@Test
	public void loginTest() throws InterruptedException{
		System.out.println("Test cases are executing");
		//driver.get("https://google.com");
		driver.get("http://13.233.124.116:8080/webapp/");
		driver.findElement(By.id("username")).sendKeys("ravi");
		driver.findElement(By.id("password")).sendKeys("ravi");
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//font")).getText(), "LOGIN SUCCESSFUL");
		Thread.sleep(3000);
	}
	
	@Test
	public void invalidLoginTest() throws InterruptedException {
		driver.get("http://13.233.124.116:8080/webapp");
		driver.findElement(By.id("username")).sendKeys("ravi");
		driver.findElement(By.id("password")).sendKeys("ss");
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//font")).getText(), "INVALID CREDENTIALS");
		Thread.sleep(3000);
	}
	
	@AfterTest
	public void tearDownTest(){
		driver.close();
		System.out.println("Test Completed Successfully");
		
	}
}
