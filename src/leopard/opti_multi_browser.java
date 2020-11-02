package leopard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class opti_multi_browser {
	public  static void generic(WebDriver driver,String url) {
	driver.get(url);
	String title=driver.getTitle();
	System.out.println(title);
	String url1=driver.getCurrentUrl();
	System.out.println(url1);
	String src=( driver.getPageSource());
	System.out.println(src);
}
public static void main(String[]args)
{
	
	System.setProperty("webdriver.gecko.driver","./selenium softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
generic(driver,"https://www.google.com");
	System.setProperty("webdriver.chrome.driver","./selenium softwares/chromedriver.exe");
	WebDriver driver1=new ChromeDriver();
	generic(driver1,"https://www.facebook.com");




}

	
}
