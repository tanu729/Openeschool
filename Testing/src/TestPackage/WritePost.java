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
public class WritePost {
	WebDriver driver;
	
	@BeforeTest
	public void LoginBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares n Drivers\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://openeschool.com/Account/Login");
		driver.findElement(By.id("userName")).sendKeys("tanul@mindfieldsoft.com");
		driver.findElement(By.id("passwordField")).sendKeys("Password123!");
		WebElement login = driver.findElement(By.name("signup"));
		login.click();
	}
	
	@Test(priority=1)
	public void PostWriting() throws InterruptedException {
		driver.findElement(By.id("postTxt")).sendKeys("Hi firends, hope you all are good.");
		WebElement post = driver.findElement(By.id("addMainPost"));
		post.click();
		//Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
	}
	
	@Test(priority=2)
	public void PostArticle() throws InterruptedException {
		WebElement article = driver.findElement(By.xpath("//*[@id=\"post-options\"]/li[3]/span[2]"));
		article.click();
		WebElement drpdown1 = driver.findElement(By.className("txtinput width60p"));
		drpdown1.sendKeys("");
		driver.findElement(By.id("Title")).sendKeys("Tech 1 Testing");
		driver.findElement(By.id("Content_ifr")).sendKeys("Test data is the data written by OES Test Team.");
		driver.findElement(By.className("ui-widget-content ui-autocomplete-input")).sendKeys("testing");
		WebElement button1 = driver.findElement(By.id("Submit2"));
		button1.click();
		Thread.sleep(5000);	
	}
	
	
	@AfterTest
	public void TearDown() {
		driver.quit();
	}
	
	
	
}
