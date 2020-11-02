package leopard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class actitime_about_actitime {
	public static void main(String[]args) throws InterruptedException

{
	System.setProperty("webdriver.gecko.driver","./selenium softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://localhost/login.do");
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		 driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	//	 driver.findElement(By.xpath("//label[@id='keepLoggedInLabel']")).click();
		 driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_support']")).click();
		 driver.findElement(By.xpath("//a[.='About your actiTIME']")).click();
		WebElement a= driver.findElement(By.className("productVersionInfo"));
		 String b=a.getText();
		 System.out.println(b);
		 WebElement c= driver.findElement(By.xpath("//span[.='(build 39769)']"));
		 String d=c.getText();
		 System.out.println(d);
		
		 
		

		 driver.findElement(By.className("systemInfoTabHeader")).click();
		WebElement e=driver.findElement(By.xpath("//td[.='1.8.0_92-b14']"));
		String f=e.getText();
		System.out.println(f);
		 driver.findElement(By.id("aboutPopupCloseButtonId")).click();
		 driver.findElement(By.id("logoutLink")).click();
		 driver.quit();
}}
