package leopard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class relative_xpath {
	public static void main(String[]args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver","./selenium softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/ravis/Desktop/demo3.html");
	driver.findElement(By.xpath("html/body/div[1]/input[1]")).clear();
	driver.findElement(By.xpath("html/body/div[1]/input[1]")).sendKeys("selenium A");
	Thread.sleep(3000);
	driver.findElement(By.xpath("html/body/div[1]/input[2]")).clear();
	driver.findElement(By.xpath("html/body/div[1]/input[2]")).sendKeys("selenium B");
	Thread.sleep(3000);
	driver.findElement(By.xpath("html/body/div[2]/input[1]")).clear();
	driver.findElement(By.xpath("html/body/div[2]/input[1]")).sendKeys("selenium C");
	Thread.sleep(3000);
	driver.findElement(By.xpath("html/body/div[2]/input[2]")).clear();
	driver.findElement(By.xpath("html/body/div[2]/input[2]")).sendKeys("selenium D");
	Thread.sleep(3000);
	driver.findElement(By.xpath("html/body/div[1]/input[1]")).clear();
	driver.findElement(By.xpath("html/body/div[1]/input[2]")).clear();
	driver.findElement(By.xpath("html/body/div[2]/input[1]")).clear();
	driver.findElement(By.xpath("html/body/div[2]/input[2]")).clear();
	
}
}