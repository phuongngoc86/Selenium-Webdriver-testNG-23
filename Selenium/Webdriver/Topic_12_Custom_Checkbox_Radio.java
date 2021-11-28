package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_12_Custom_Checkbox_Radio {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver", projectPath + "//BrowserDrivers//geckodriver");
		driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	
	}

	@Test
	public void TC_01_ValidateCurrentUrl() {
		// Login Page Url matching
		driver.get("https://material.angular.io/components/radio/examples");
	}

	@Test
	public void TC_03_Custom_Checkbox_Radio() {
		driver.get("https://material.angular.io/components/radio/examples");
		
		driver.findElement(By.xpath("//div[@aria-label='Hồ Chí Minh']")).click();
		sleepInsecond(2);
		//Sau khi click 
		Assert.assertTrue(driver.findElement(By.xpath("//div[@aria-label='Hồ Chí Minh' and @aria-checked='true']")).isDisplayed());
		
		// Click vào 7 cái checkbox 
		List<WebElement> beforeCheckbox = driver.findElement(Buy.xpath("//div[@role='checkbox']"));
		for (WebElement checkbox : afterCheckbox) {
			checkbox.click();
			sleepInMilisecond(500);
			Assert.assertEquals(checkbox.Attribute("aria-checked"),"true");
		
		}
		List<WebElement> afterCheckboxes = driver.findElements(By.xpath("//div[@role='checkbox']"));
		for (WebElement checkbox : afterCheckboxes) {
			Assert.assertTrue(checkbox.isDisplayed());
		}
		
		
	}

	private void sleepInsecond() {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void TC_04_LoginFormDisplayed() {
		// Login form displayed
		
		
		//Case 4 : Dùng JavascriptExcutor để click 
		// Không quan tâm element có  bị ẩn hay không 
		//
		// Thẻ input để verify 
		
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}