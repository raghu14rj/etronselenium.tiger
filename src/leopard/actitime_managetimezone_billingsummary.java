package leopard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class actitime_managetimezone_billingsummary {
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
			 driver.findElement(By.xpath("//div[.='REPORTS']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//span[.='New Report']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//div[@id='reportName_3']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@id='configureReportParametersButton']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//span[@id='applyReportConfiguration']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//div[@class='addToDashboard']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@class='reportNameEdit inputFieldWithPlaceholder']")).sendKeys("par");
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//span[.='Save']")).click();
			 Thread.sleep(1000);
			 
			 driver.findElement(By.id("logoutLink")).click();
			 driver.quit();

}}
