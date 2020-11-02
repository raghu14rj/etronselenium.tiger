package leopard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locaters {
public static void main(String[]args) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver","./selenium softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/ravis/Desktop/demo1.html");
	WebElement ele=driver.findElement(By.tagName("a"));
	Thread.sleep(3000);
	ele.click();
}
}
