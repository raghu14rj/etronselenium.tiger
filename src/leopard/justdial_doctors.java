package leopard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class justdial_doctors {
	public static void main(String[]args) throws InterruptedException

	{
		System.setProperty("webdriver.gecko.driver","./selenium softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.justdial.com");
		Thread.sleep(1000);	 
		driver.findElement(By.xpath("//span[@id='hotkeys_text_22']")).click();
		Thread.sleep(1000);	 
		driver.findElement(By.xpath("//span[@class='meditle lng_commn']")).click();
		Thread.sleep(10000);	 
		driver.findElement(By.xpath("//span[@id='bd_name']")).sendKeys("joss");
		Thread.sleep(1000);	 
		driver.findElement(By.xpath("//span[@id='bd_mobile']")).sendKeys("9844575608");
		Thread.sleep(1000);	 
		driver.findElement(By.xpath("//span[@button='jbtn']")).click();
		Thread.sleep(1000);	 
		driver.findElement(By.xpath("//span[@class='jcl']")).click();
		Thread.sleep(1000);	 
		driver.findElement(By.xpath("//span[@class='lng_cont_name']")).click();
		Thread.sleep(10000);	 
		driver.findElement(By.xpath("//span[@id='bd_name']")).sendKeys("joss");
		Thread.sleep(1000);	 
		driver.findElement(By.xpath("//span[@id='bd_mobile']")).sendKeys("1234567890");
		Thread.sleep(1000);	 
		driver.findElement(By.xpath("//span[@button='jbtn']")).click();
		driver.findElement(By.xpath("//span[@class='jcl']")).click();
		Thread.sleep(1000);		 
			 
			 
			 
			 WebElement ele=driver.findElement(By.xpath("//a[@class='tel ttel']"));
			 String x=ele.getText();
			 System.out.println(x);
			 Thread.sleep(1000);
			 WebElement ele1=driver.findElement(By.xpath("//span[@class='lng_add']"));
			 String y=ele1.getText();
			 System.out.println(y);
			 
			 driver.quit();
}

}
