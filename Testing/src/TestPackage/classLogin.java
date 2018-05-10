/**
 * 
 */
package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author root
 *
 */
public class classLogin {
	WebDriver driver;
	
	@Test(priority=1)
	public void InitBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares n Drivers\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://openeschool.com/Account/Login");
		driver.findElement(By.id("userName")).sendKeys("tanul@mindfieldsoft.com");
		driver.findElement(By.id("passwordField")).sendKeys("Password123!");
		WebElement login = driver.findElement(By.name("signup"));
		login.click();
		driver.quit();
		
	}
	
	@Test(priority=2)
	public void InitBrowser1() {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares n Drivers\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://openeschool.com/Account/Login");
		driver.findElement(By.id("userName")).sendKeys("tanul@mindfieldsoft.com");
		driver.findElement(By.id("passwordField")).sendKeys(" ");
		WebElement login = driver.findElement(By.name("signup"));
		login.click();
		driver.quit();
		
	}
	
	@Test(priority=3)
	public void InitBrowser2() {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares n Drivers\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://openeschool.com/Account/Login");
		driver.findElement(By.id("userName")).sendKeys(" ");
		driver.findElement(By.id("passwordField")).sendKeys("Password123!");
		WebElement login = driver.findElement(By.name("signup"));
		login.click();
		driver.quit();
		
	}
	
	@Test(priority=4)
	public void InitBrowser3() {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares n Drivers\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://openeschool.com/Account/Login");
		driver.findElement(By.id("userName")).sendKeys(" ");
		driver.findElement(By.id("passwordField")).sendKeys(" ");
		WebElement login = driver.findElement(By.name("signup"));
		login.click();
		driver.quit();
	}
	
	@Test(priority=5)
	public void InitBrowser4() {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares n Drivers\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://openeschool.com/Account/Login");
		driver.findElement(By.id("userName")).sendKeys("anaya@yopmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("password");
		WebElement login = driver.findElement(By.name("signup"));
		login.click();
		driver.quit();
	}
	
}
