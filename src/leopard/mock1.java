package leopard;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mock1 {
public static void main(String[]args) throws InterruptedException
{
        System.setProperty("webdriver.gecko.driver","./selenium softwares/geckodriver.exe");
     WebDriver driver= new FirefoxDriver();
    	                                 driver.get("https://www.flipkart.com/");
    	Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		 Thread.sleep(1000);
    	driver.findElement(By.xpath("//span[.='Men']")).click();
		 Thread.sleep(1000);
    	List<WebElement> links = driver.findElements(By.xpath("//a"));
    	Thread.sleep(3000);
int count=links.size();
System.out.println(count);

}
}


