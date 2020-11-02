package leopard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class justdial_homeloans {
	public static void main(String[]args) throws InterruptedException

	{
		System.setProperty("webdriver.gecko.driver","./selenium softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.justdial.com");
			 driver.findElement(By.xpath("//span[@id='hotkeys_text_43']")).click();
			 driver.findElement(By.xpath("//span[@class='meditle lng_commn']")).click();
			
			 driver.findElement(By.xpath("//input[@id='loans_fname']")).sendKeys("joss");
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@id='loans_mobile']")).sendKeys("8073334690");
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@id='loans_email']")).sendKeys("raghu14.rj@gmail.com");
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@id='loans_city']")).sendKeys("mumbai");
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//a[.='Mumbai']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//span[@class='icon-unche']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//span[@class='rdobtnleft rdobtn']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//button[@class='jbtn']")).click();
			 
			 driver.quit();
}


}
