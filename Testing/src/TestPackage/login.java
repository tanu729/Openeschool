/**
 * 
 */
package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author root
 *
 */
public class login {
	WebDriver driver;
	
	@Test(priority=1)
	public void InitBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares n Drivers\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://openeschool.com/Account/Login");
		driver.findElement(By.id("userName")).sendKeys("tanul@mindfieldsoft.com");
		driver.findElement(By.id("passwordField")).sendKeys("!");
		WebElement login = driver.findElement(By.name("signup"));
		login.click();
		
		String actual_result=driver.getTitle();
		
		System.out.println(actual_result);
		
		String expected_result="Tanul K Saxena";
		
		Assert.assertEquals(actual_result, expected_result);
		
		driver.quit();
		
	}
}