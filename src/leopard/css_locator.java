package leopard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class css_locator {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./selenium softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
		 driver.findElement(By.cssSelector("input[id='email']")).sendKeys("raghu14.rj");
		 driver.findElement(By.cssSelector("input[id='password']")).sendKeys("1234");
		 driver.findElement(By.cssSelector("input[value='login']")).click();
}}
