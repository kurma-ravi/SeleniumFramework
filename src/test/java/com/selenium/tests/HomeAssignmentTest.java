package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class HomeAssignmentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String projectPath = System.getProperty("user.dir");
		//System.out.println("ProjectPath : "+projectPath);
		
		//System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckodriver/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
						
		//WebDriverManager.chromedriver().version("2.36").setup();
		//WebDriver driver = new ChromeDriver();
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://52.66.207.5:8080/webapp/");
		driver.findElement(By.id("username")).sendKeys("swastik");
		driver.findElement(By.id("password")).sendKeys("swastik");
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//font")).getText(), "LOGIN SUCCESSFUL");
		
		//driver.close();
	}

}
