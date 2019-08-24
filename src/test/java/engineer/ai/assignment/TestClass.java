package engineer.ai.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
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
		WebElement bfill = driver.findElement(By.id("B-fill"));
		
		// R-fill
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(rfill).build().perform();
		
		Thread.sleep(3000);
		WebElement rfillAfterHover = driver.findElement(By.id("R-fill"));
		String rClassAttribute = rfillAfterHover.getAttribute("class");
		Assert.assertEquals(rClassAttribute, "black", "Assert failed, colour did not change!");
		
		
		WebElement body = driver.findElement(By.tagName("body"));
		body.click();
		
		// G-fill
		WebElement gfill = driver.findElement(By.id("G-fill"));
		Thread.sleep(3000);
		Actions gFillaction = new Actions(driver);
		gFillaction.moveToElement(gfill).build().perform();

		Thread.sleep(2000);
		
		WebElement gfillAfterHover = driver.findElement(By.id("G-fill"));
//		Thread.sleep(3000);
		String gClassAttribute = gfillAfterHover.getAttribute("class");
//		Thread.sleep(1000);
		Assert.assertEquals(gClassAttribute, "black", "Assert failed, colour did not change!");
				
		driver.quit();	
		
	}
	
}
