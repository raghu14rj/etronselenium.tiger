package leopard;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class launch_empty_chrome {
	
public static void main(String[]args)
{
	String key="webdriver.chrome.driver";
	String value="./selenium softwares/chromedriver.exe";
	System.setProperty(key, value);
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com");
	String title1=driver.getTitle();
	System.out.println(title1);
	String url1=driver.getCurrentUrl();
	System.out.println(url1);
	

}
}
