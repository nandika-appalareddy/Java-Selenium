package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3_DynamicPassword {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		String password = getPassword(driver);
		Thread.sleep(2000);

		driver.findElement(By.id("inputUsername")).sendKeys("Avinash");
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.cssSelector("button[class='submit signInBtn']")).click();
		
		driver.close();
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("AppalaReddy");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Avinash@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("6303680994");
		
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		String passwordText  = driver.findElement(By.cssSelector("p.infoMsg")).getText();
		String passwordText1 = passwordText.split("'")[1];
		String password = passwordText1.split("'")[0];
		
		driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		
		return password;
	}

}
