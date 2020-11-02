package leopard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class actitime_createprojects {
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
			 driver.findElement(By.xpath("//a[@class='content tasks']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//div[@class='addNewButton']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//div[.='+ New Project']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@class='projectNameField inputFieldWithPlaceholder']")).sendKeys("johnson");
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//td[@id='ext-gen23']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//span[.='Create Project']")).click();
			
			 
			 driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
			 driver.quit();


}}
