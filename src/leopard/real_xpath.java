package leopard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class real_xpath {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.gecko.driver","./selenium softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://ksrtc.in/oprs-web/login/show.do");
			 driver.findElement(By.xpath("//label[text()='User Name']")).sendKeys("raghu14.rj@gmail.com");
			 driver.findElement(By.xpath("//label[text()='Password']")).sendKeys("8073334690");
			 driver.findElement(By.xpath("//input[@id='submitBtn']")).click();
			 String title=driver.getTitle();
			 System.out.println(title);
			 
			 
			 
			 
	
	



		
	}


}
