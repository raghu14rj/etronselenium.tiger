package leopard;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class alltabs {
	public static void main(String[]args) throws InterruptedException, AWTException
	{
	System.setProperty("webdriver.gecko.driver","./selenium softwares/geckodriver.exe"); 
	WebDriver driver=new FirefoxDriver();

	driver.get("https://www.flipkart.com/");
	List<WebElement> ele=driver.findElements(By.xpath("//a"));
	Thread.sleep(2000);
	for(WebElement i:ele) 
	{
			Actions act=new Actions(driver);
	act.contextClick(i).perform();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_T);
	}
	Thread.sleep(2000);
	Set<String> we = driver.getWindowHandles();
	int e = we.size();
	System.out.println(e);
	
	 ArrayList<String> a1=new ArrayList<String>(we);
		Thread.sleep(2000);
		String tab = a1.get(2);
	 driver.switchTo().window(tab);
	 Thread.sleep(2000);
		String tab1 = a1.get(4);
	 driver.switchTo().window(tab1);
	 Thread.sleep(2000);
		String tab2 = a1.get(1);
	 driver.switchTo().window(tab2);
	 Thread.sleep(2000);
		String tab3 = a1.get(3);
	 driver.switchTo().window(tab3);
	 Thread.sleep(2000);
		String tab4 = a1.get(5);
	 driver.switchTo().window(tab4);
}
}