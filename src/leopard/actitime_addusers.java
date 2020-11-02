package leopard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class actitime_addusers {
	public static void main(String[]args) throws InterruptedException

	{
		System.setProperty("webdriver.gecko.driver","./selenium softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		 driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		// driver.findElement(By.xpath("//label[@id='keepLoggedInLabel']")).click();
		 driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	  	 Thread.sleep(1000);
			 driver.findElement(By.xpath("//div[.='USERS']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//div[.='Add User']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@id='userDataLightBox_firstNameField']")).sendKeys("name");
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@id='userDataLightBox_middleNameField']")).sendKeys("middlename");
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@id='userDataLightBox_lastNameField']")).sendKeys("lastname");
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@id='userDataLightBox_usernameField']")).sendKeys("raghu14.rj");
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@id='userDataLightBox_passwordField']")).sendKeys("8073334690");
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@id='userDataLightBox_passwordCopyField']")).sendKeys("8073334690");
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@id='userDataLightBox_emailField']")).sendKeys("raghu14.rj@gmail.com");
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//div[@id='userDataLightBox_commitBtn']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.id("logoutLink")).click();
			 driver.quit();

}}

