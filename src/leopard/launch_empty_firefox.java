package leopard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class launch_empty_firefox {
public static void main(String[]args) throws InterruptedException
{
	String key="webdriver.gecko.driver";
	String value="./selenium softwares/geckodriver.exe";
	System.setProperty(key, value);
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com");
	
	System.out.println(driver.getTitle());
	
	System.out.println(driver.getCurrentUrl());
	
	
	
}
}
