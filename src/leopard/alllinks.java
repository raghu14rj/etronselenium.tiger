package leopard;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class alllinks {
	public static void main(String[]args) throws InterruptedException, AWTException 
	{
	System.setProperty("webdriver.gecko.driver","./selenium softwares/geckodriver.exe"); 
	WebDriver driver=new FirefoxDriver();

	driver.get("file:///C:/Users/ravis/Desktop/links.html");
	WebElement ele=driver.findElement(By.xpath("//a[.='google']"));
	Thread.sleep(2000);
	Actions act=new Actions(driver);
	act.contextClick(ele).perform();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_W);
	r.keyRelease(KeyEvent.VK_W);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_SPACE);
	r.keyPress(KeyEvent.VK_N);
	r.keyRelease(KeyEvent.VK_ALT);
	r.keyRelease(KeyEvent.VK_SPACE);
	r.keyRelease(KeyEvent.VK_N);
	WebElement ele1=driver.findElement(By.xpath("//a[.='gmail']"));
	Thread.sleep(2000);
	Actions act1=new Actions(driver);
	act1.contextClick(ele1).perform();
	Robot r1=new Robot();
	r1.keyPress(KeyEvent.VK_W);
	r1.keyRelease(KeyEvent.VK_W);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_SPACE);
	r.keyPress(KeyEvent.VK_N);
	r.keyRelease(KeyEvent.VK_ALT);
	r.keyRelease(KeyEvent.VK_SPACE);
	r.keyRelease(KeyEvent.VK_N);
	WebElement ele2=driver.findElement(By.xpath("//a[.='fb']"));
	Thread.sleep(2000);
	Actions act2=new Actions(driver);
  	act2.contextClick(ele2).perform();
	Robot r2=new Robot();
	r2.keyPress(KeyEvent.VK_W);
	r2.keyRelease(KeyEvent.VK_W);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_SPACE);
	r.keyPress(KeyEvent.VK_N);
	r.keyRelease(KeyEvent.VK_ALT);
	r.keyRelease(KeyEvent.VK_SPACE);
	r.keyRelease(KeyEvent.VK_N);
	WebElement ele3=driver.findElement(By.xpath("//a[.='youtube']"));
	Thread.sleep(2000);
	Actions act3=new Actions(driver);
	act3.contextClick(ele3).perform();
	Robot r3=new Robot();
	r3.keyPress(KeyEvent.VK_W);
	r3.keyRelease(KeyEvent.VK_W);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_SPACE);
	r.keyPress(KeyEvent.VK_N);
	r.keyRelease(KeyEvent.VK_ALT);
	r.keyRelease(KeyEvent.VK_SPACE);
	r.keyRelease(KeyEvent.VK_N);
	WebElement ele4=driver.findElement(By.xpath("//a[.='amazon']"));
	Thread.sleep(2000);
	Actions act4=new Actions(driver);
	act4.contextClick(ele4).perform();
	Robot r4=new Robot();
	r4.keyPress(KeyEvent.VK_W);
	r4.keyRelease(KeyEvent.VK_W);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_SPACE);
	r.keyPress(KeyEvent.VK_N);
	r.keyRelease(KeyEvent.VK_ALT);
	r.keyRelease(KeyEvent.VK_SPACE);
	r.keyRelease(KeyEvent.VK_N);
}
}