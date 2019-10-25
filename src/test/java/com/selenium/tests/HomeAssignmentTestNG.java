package com.selenium.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeAssignmentTestNG {
	
	WebDriver driver = null;

	@BeforeTest
	public void setUpTest(){
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		//driver = new ChromeDriver();
		
	}
	
	@Test
	public void loginTest(){
		
		/*driver.get("http://52.66.207.5:8080/webapp");
		driver.findElement(By.id("username")).sendKeys("swastik");
		driver.findElement(By.id("password")).sendKeys("swastik");
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//font")).getText(), "LOGIN SUCCESSFUL");*/
		driver.get("http://seleniumhq.org/");
	}
	
	@AfterTest
	public void finishTest(){
		
		driver.close();
		System.out.println("Test Completed Successfully");
		
	}
}
