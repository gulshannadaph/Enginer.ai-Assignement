package engineer.ai.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestClass {
	public WebDriver driver;
	
	@Test
	public void test_Hover() throws InterruptedException{
	
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.rrrgggbbb.com/");
		driver.manage().window().maximize();
		
		WebElement rfill = driver.findElement(By.id("R-fill"));
		WebElement gfill = driver.findElement(By.id("G-fill"));
		WebElement bfill = driver.findElement(By.id("B-fill"));
		
		Thread.sleep(3000);
		
		Actions action = new Actions(driver);
		action.moveToElement(rfill).build().perform();
		
		
		
		
		
		
		
	}
	
}
