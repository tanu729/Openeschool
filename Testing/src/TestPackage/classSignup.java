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
public class classSignup {
	
	WebDriver driver;
	
	@BeforeTest
	public void startBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares n Drivers\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void startTest( ) {
		driver.get("http://openeschool.com/Account/Register");
		driver.findElement(By.id("FirstName")).sendKeys("Nanak");
		driver.findElement(By.id("LastName")).sendKeys("Kapoori");
		driver.findElement(By.id("ContactNumber")).sendKeys("6285255612");
		driver.findElement(By.name("UserName")).sendKeys("nanak@yopmail.com");
		driver.findElement(By.id("Password")).sendKeys("Password123!");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("Password123!");
		WebElement drpdown1 = driver.findElement(By.id("Month"));
		drpdown1.sendKeys("May");
		WebElement drdown2 = driver.findElement(By.id("day"));
		drdown2.sendKeys("28");
		WebElement drpdown3 = driver.findElement(By.id("Year"));
		drpdown3.sendKeys("1990");
		WebElement radio1 = driver.findElement(By.xpath("//*[@id=\"registerForm\"]/div/div[3]/div[9]/input[2]"));
		radio1.click();
		WebElement radio2 = driver.findElement(By.xpath("//*[@id=\"registerForm\"]/div/div[3]/div[10]/table/tbody/tr/td[2]"));
		radio2.click();
		WebElement option1 = driver.findElement(By.id("chkTermAndCondi"));
		option1.click();
		WebElement signup = driver.findElement(By.id("btnRegister"));
		signup.click();
		
	}
	
	@AfterTest
	public void AfterTest() throws InterruptedException {
		Thread.sleep(5000);
		//driver.quit();
	}

}
