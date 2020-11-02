package leopard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class real_css_selector {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","./selenium softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
			 driver.findElement(By.xpath("input[@id='email']")).sendKeys("raghu14.rj@gmail.com");
			 driver.findElement(By.xpath("input[@id='password']")).sendKeys("1234");
			 driver.findElement(By.xpath("input[@class='login']")).click();
	

	}

}
