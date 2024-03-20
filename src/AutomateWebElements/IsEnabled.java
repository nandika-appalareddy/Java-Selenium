package AutomateWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_0']")).click();
		if(driver.findElement(By.cssSelector("div[id='Div1']")).getAttribute("style").contains("0.5")) {
			Assert.assertTrue(true); //is disabled
		}else {
			Assert.assertTrue(false); //is Enabled
		}
		
		Thread.sleep(5);
		driver.close();
	}

}
