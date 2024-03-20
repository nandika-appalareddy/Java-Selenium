package AutomateWebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AutoSuggestionDropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		
		for(WebElement option : options) {
			if(option.getText().equals("India")) {
				option.click();
			}
		}
		
		Thread.sleep(5);
		driver.close();
	}

}
