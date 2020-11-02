package leopard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mutliaction_locators {
	static {
	System.setProperty("webdriver.gecko.driver","./selenium softwares/geckodriver.exe");}
		
	
	public static void main(String[]args) throws InterruptedException
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/ravis/Desktop/demo2.html");
		Thread.sleep(3000);
		driver.findElement(By.id("a1")).sendKeys("narayana");
		Thread.sleep(3000);
		driver.findElement(By.className("c2")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("a3")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("a4")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("a5")).click();
		Thread.sleep(3000);
		driver.close();
		driver.findElement(By.className("c8")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
