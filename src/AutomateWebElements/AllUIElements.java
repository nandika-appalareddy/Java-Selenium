package AutomateWebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AllUIElements {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.cssSelector("a[value='GOI']")).click();
	  //driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
	    driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='HYD']")).click();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_view_date1']")).click();
		driver.findElement(By.cssSelector("a[class='ui-state-default ui-state-highlight ui-state-hover']")).click();
		if(driver.findElement(By.cssSelector("div[id='Div1']")).getAttribute("style").contains("0.5")) {
			Assert.assertTrue(true); //is disabled
		}else {
			Assert.assertTrue(false); //is Enabled
		}
		driver.findElement(By.cssSelector("div[id='divpaxinfo']")).click();
		for(int i=2;i<6;i++) {
			driver.findElement(By.cssSelector("span[id='hrefIncAdt']")).click();
		}
		WebElement staticdropdown = driver.findElement(By.cssSelector("select[id*='DropDownListCurrency']"));
		Select option = new Select(staticdropdown);
		option.selectByValue("INR");
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		
		for(WebElement opt : options) {
			if(opt.getText().equals("India")) {
				opt.click();
			}
		}
		driver.findElement(By.cssSelector("input[name='ctl00$mainContent$btn_FindFlights']")).click();
		
		Thread.sleep(5);
		driver.close();
	}

}
