package leopard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class actitime_create_new_report {
	public static void main(String[]args) throws InterruptedException

	{
		System.setProperty("webdriver.gecko.driver","./selenium softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
			 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
			 driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
			 driver.findElement(By.xpath("//label[@id='keepLoggedInLabel']")).click();
			 driver.findElement(By.xpath("//div[.='Login ']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//div[.='REPORTS']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//div[@id='ext-gen29']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.id("configureReportParametersButton")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//span[.='All Staff']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//img[contains(@id,'ext-gen')])[2]")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//span[@class='checkbox'])[1]")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//span[.='Generate HTML Report']")).click();
			 driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
			 driver.close();

//ggkjk

}
}