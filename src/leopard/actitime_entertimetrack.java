package leopard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class actitime_entertimetrack {
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
			 driver.findElement(By.xpath("//a[.='Enter Time-Track']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//span[.='New']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//button[@id='ext-gen103']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@id='createTasksPopup_newCustomer']")).sendKeys("ram");
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@id='createTasksPopup_newProject']")).sendKeys("ramayan");
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ramayanbrand");
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//span[.='Create Tasks']")).click();
			
			 
			 driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
			 driver.close();

}}
