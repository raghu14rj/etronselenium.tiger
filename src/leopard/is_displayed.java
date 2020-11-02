package leopard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class is_displayed {
public static void main(String[]args) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver","./selenium softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com");
	WebElement ele=driver.findElement(By.xpath("//input[@name='firstname']"));
	ele.sendKeys("bat");
	Thread.sleep(1000); 
	
	WebElement ele1=driver.findElement(By.xpath("//input[@name='lastname']"));
	ele1.sendKeys("XYZ");
	Thread.sleep(1000); 
	ele1.sendKeys(Keys.CONTROL+"a");
	Thread.sleep(1000);
	ele1.sendKeys(Keys.DELETE);
	Thread.sleep(1000);
	ele.sendKeys(Keys.CONTROL+"a");
	Thread.sleep(1000);
	ele.sendKeys(Keys.CONTROL+"C");
	Thread.sleep(1000);
	ele1.sendKeys(Keys.CONTROL+"v");
	WebElement ele3=driver.findElement(By.xpath("//button[@id='u_0_13']"));
	ele1.sendKeys(Keys.ENTER);
	
} 
}