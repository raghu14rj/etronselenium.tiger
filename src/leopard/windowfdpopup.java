  package leopard;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowfdpopup {
public static void main(String[]args) throws InterruptedException, IOException
{
	
		System.setProperty("webdriver.gecko.driver","./selenium softwares/geckodriver.exe"); 
		WebDriver driver=new FirefoxDriver();

		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.xpath("//a[.='3.141.59']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\ravis\\Desktop\\fd.exe");
		

}
}
