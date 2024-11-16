package com.TestOrange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestOrange {
	@Test
	public void methodtest() {
		WebDriverManager.chromedriver().setup(); // setting up driver
		// intializing webdriver
		WebDriver driver = new ChromeDriver();
		// maximixing the browser window
		driver.manage().window().maximize();
		// getting the required url website
		driver.get("https://www.orangehrm.com/");
	}
	@Test
	public void methodtest2() {
		WebDriverManager.chromedriver().setup(); // setting up driver
		// intializing webdriver
		WebDriver driver = new ChromeDriver();
		// maximixing the browser window
		driver.manage().window().maximize();
		// getting the required url website
		driver.get("https://www.facebook.com/");
	}

	/*
	 * public static void main(String[] args) {
	 * WebDriverManager.chromedriver().setup(); // setting up driver // intializing
	 * webdriver WebDriver driver = new ChromeDriver(); // maximixing the browser
	 * window driver.manage().window().maximize(); // getting the required url
	 * website driver.get("https://www.orangehrm.com/"); // giving credentials of
	 * email driver.findElement(By.name("EmailHomePage")).sendKeys(
	 * "arramsaikrishnaraju@gmail.com"); // submitting the create account request
	 * driver.findElement(By.name("action_request")).click(); // giving username
	 * driver.findElement(By.name("subdomain")).sendKeys("Saikrishnaraju"); //
	 * giving full name driver.findElement(By.id("Form_getForm_Name")).
	 * sendKeys("Saikrishnaraju Arram"); // giving contact number
	 * driver.findElement(By.id("Form_getForm_Contact")).sendKeys("8686015019");
	 * driver.findElement(By.id("Form_getForm_Country")).sendKeys("India");
	 * driver.findElement(By.id("recaptcha-anchor")).click();
	 * driver.findElement(By.name("action_submitForm")).click(); }
	 */

}
