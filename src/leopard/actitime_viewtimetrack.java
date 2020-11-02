package leopard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class actitime_viewtimetrack {
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
			 driver.findElement(By.xpath("//a[@class='item']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//td[@class='generatePDF headerFooterCell activeButton cellWithBorder']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//div[@id='viewTTPdfPreviewLightbox_downloadPdfBtn']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//div[@id='closeViewTTPdfPreviewLightboxButton']")).click();
			 Thread.sleep(1000);
			 
			 driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
			 driver.close();

}}
//gghgh