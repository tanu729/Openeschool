/**
 * 
 */
package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author root
 *
 */
public class loginwithValidation {
	WebDriver driver;
	
	@BeforeTest
	public void InitBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares n Drivers\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://openeschool.com/Account/Login");
	}
	
	@Test(priority=1)
	public void logincorrect() {		
		driver.findElement(By.id("userName")).sendKeys("tanul@mindfieldsoft.com");
		driver.findElement(By.id("passwordField")).sendKeys("Password123!");
		WebElement login = driver.findElement(By.name("signup"));
		login.click();		
	}
	
	@Test(priority=2)
	public void loginpwdBlank() {
		driver.findElement(By.id("userName")).sendKeys("tanul@mindfieldsoft.com");
		driver.findElement(By.id("passwordField")).sendKeys(" ");
		WebElement login = driver.findElement(By.name("signup"));
		login.click();		
	}
	
	@Test(priority=3)
	public void loginuserBlank() {
		driver.findElement(By.id("userName")).sendKeys(" ");
		driver.findElement(By.id("passwordField")).sendKeys("Password123!");
		WebElement login = driver.findElement(By.name("signup"));
		login.click();		
	}
	
	@Test(priority=4)
	public void loginUidPwdBlank() {
		driver.findElement(By.id("userName")).sendKeys(" ");
		driver.findElement(By.id("passwordField")).sendKeys(" ");
		WebElement login = driver.findElement(By.name("signup"));
		login.click();
	}
	
	@Test(priority=5)
	public void loginWrong() {
		driver.findElement(By.id("userName")).sendKeys("anaya@yopmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("password");
		WebElement login = driver.findElement(By.name("signup"));
		login.click();
	}
	
	@AfterTest()
	public void tearDown()
	{
		driver.quit();
	}
	
}

