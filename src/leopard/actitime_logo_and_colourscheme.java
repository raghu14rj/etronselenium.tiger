package leopard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class actitime_logo_and_colourscheme {
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
			 driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//div[@class='backgroundColor']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//label[.='Do not show logo on printable reports and invoices']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@type='submit']")).click();
			 
			 
			 
			 driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
			 driver.close();
}}
