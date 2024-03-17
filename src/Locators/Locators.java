package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException{

		WebDriver driver = new ChromeDriver();								//Creating an Instance of ChromeDriver with the properties of the WebDriver
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	//Making selenium to wait for sometime to get the process complete
		//Invoking web browser
		driver.get("https://rahulshettyacademy.com/locatorspractice/");		//hitting the ulr
		
		//Entering user name and password
		driver.findElement(By.id("inputUsername")).sendKeys("Appala Reddy");	//finding the html element i.e., locator via id and entring username
		driver.findElement(By.name("inputPassword")).sendKeys("Avinash");	//locator via name and entring the password
		//hitting signin button
		driver.findElement(By.className("signInBtn")).click();				//finding locator via classname and hitting the signin button
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); 	//printing the error message
		
		//going to forget password page
		driver.findElement(By.linkText("Forgot your password?")).click(); 	//finding locator via linktext and hitting forget password button
		
		//resetting password
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Avinash");
		driver.findElement(By.cssSelector("input[placeholder=Email]")).sendKeys("appalareddy976@gmail.com");
		
		//clearing the value entered
		driver.findElement(By.cssSelector("input[placeholder=Email]")).clear();
		//reentering email
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("avinash@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("6303680994");
		
		//hitting reset password button
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		//printing message
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());

		Thread.sleep(2000);
		
		//logging in again
		driver.findElement(By.xpath("//button[contains(@class,'go-to-login-btn')]")).click();
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("AppalaReddy");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		Thread.sleep(2000);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		driver.close();
	}

}
