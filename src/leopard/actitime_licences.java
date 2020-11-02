package leopard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class actitime_licences {
	public static void main(String[]args) throws InterruptedException

	{
		System.setProperty("webdriver.gecko.driver","./selenium softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
			 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
			 driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
			 driver.findElement(By.xpath("//label[@id='keepLoggedInLabel']")).click();
			 driver.findElement(By.xpath("//a[@id='loginButton']")).click();
			Thread.sleep(1000);
			 driver.findElement(By.xpath("//div[@title='Warning! Password recovery function is disabled as email settings are not configured.']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//a[.='Licenses']")).click();
			 Thread.sleep(1000);
			 WebElement a= driver.findElement(By.xpath("//nobr[.='Product Edition:']"));
			 String b=a.getText();
			 System.out.println(b);
			 Thread.sleep(1000);
			 WebElement c= driver.findElement(By.xpath("//nobr[.='Issue Date:']"));
			 String d=c.getText();
			 System.out.println(d);
			 Thread.sleep(1000);
			WebElement e=driver.findElement(By.xpath("//nobr[.='Licensed Users:']"));
			String f=e.getText();
			System.out.println(f);

			 
			 
			 driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
			 driver.close();

}}
