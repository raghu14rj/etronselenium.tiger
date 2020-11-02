package leopard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multiple_browsers {
	public static void main(String[]args) throws InterruptedException
	{
		String key="webdriver.gecko.driver";
		String value="./selenium softwares/geckodriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		
		String key1="webdriver.chrome.driver";
		String value1="./selenium softwares/chromedriver.exe";
		System.setProperty(key1, value1);
		WebDriver driver1=new ChromeDriver();
		driver.get("https://www.google.com");
		String title1=driver.getTitle();
		System.out.println(title1);
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
		
	
	
	
	
	}
}
