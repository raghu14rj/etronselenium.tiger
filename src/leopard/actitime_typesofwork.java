package leopard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class actitime_typesofwork {
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
			 driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_settings']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//a[.='Types of Work']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//span[.='Create Type of Work']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@id='name']")).sendKeys("hardwork1");
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//label[.='Billable']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@type='submit']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//label[.='Active only']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//label[.='Billable only']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@valve='Show Types of Work']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
			 driver.close();

}}
////