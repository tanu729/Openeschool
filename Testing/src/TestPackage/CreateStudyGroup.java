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
public class CreateStudyGroup {
	
	WebDriver driver;
	
	@BeforeTest()
	public void LoginSite() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares n Drivers\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://openeschool.com/Account/Login");
		driver.findElement(By.id("userName")).sendKeys("tanul@mindfieldsoft.com");
		driver.findElement(By.id("passwordField")).sendKeys("Password123!");
		WebElement login = driver.findElement(By.name("signup"));
		login.click();
		Thread.sleep(5000);
	}
	
	@Test
	public void CreateGroup() throws InterruptedException {
		WebElement button1 = driver.findElement(By.id("a2"));
		button1.click();
		Thread.sleep(5000);
		WebElement drpdown1 = driver.findElement(By.id("ProgramTypeId"));
		drpdown1.sendKeys("General Purpose Study Group");
		driver.findElement(By.id("Name")).sendKeys("Automation Group 1");
		driver.findElement(By.id("SubTitle")).sendKeys("Testing Group for OES Team");
		driver.findElement(By.id("Goal")).sendKeys("Test Data");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("Description_ifr")).sendKeys("It is a long established fact that a reader will be distracted by the readable content of a page when"
				+ "looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less" 
		+ " normal distribution of letters, as opposed to using 'Content here, content here'," +"making it look like readable English.");
		
		Thread.sleep(5000);
		
		WebElement radio1 = driver.findElement(By.xpath("//*[@id=\"privacyDiv"]/td/input[2]"));
		radio1.click();
		Thread.sleep(5000);
		WebElement button2 = driver.findElement(By.xpath("//*[@id=\"StudyGroup\"]/table/tbody/tr[7]/td[2]/input"));
		button2.click();
		
	}
	
	@AfterTest
	public void TearDown() {
		//driver.close();
	}

}
