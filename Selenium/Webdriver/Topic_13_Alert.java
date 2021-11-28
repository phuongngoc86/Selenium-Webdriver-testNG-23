package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_13_Alert {
  WebDriver driver;
  Alert alert;
  WebDriverWait expliciWait;
  String projectPath = System.getProperty("user.dir");
private FluentWait<WebDriver> explicitWait;
  
  @BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		
	
		
		expliciWait = new WebDriverWait (driver, 30);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
 
 }
  /*Chú ý : Arlert không phải là web browser mà là  nên không khởi tạo như new, mà chỉ 
  Switch qua : Alert / fame (ifame) / Windows (Tab)
  */
  @Test
  public void TC_01_Accept_Alert1()  {
	  driver.get("https://automationfc.github.io/basic-form/index.html");
	  
	  driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	  
	  //Wait trước rồi mới witch qua alert 
	  alert = explicitWait.until(ExpectedConditions.alertIsPresent());
	 
	 Assert.assertEquals(alert.getText(), "I am a JS Alert");
	 sleepInsecond(3);
	  
	  alert.accept();
	  sleepInsecond(3);
  }
 
 
  
  private void sleepInsecond(int i) {
	// TODO Auto-generated method stub
	
}
@Test
  public void TC_02_Confirm_Alert()  {
	  
	  
  }
  
  @Test
  public void TC_03_Prompt_Alert()  {
	  
	  
  }
  
  @Test
  public void TC_04_Authentication_Alert()  {
	  
	  
  }
  @AfterClass
	public void afterClass() {
		//driver.quit();
	}
}
  
