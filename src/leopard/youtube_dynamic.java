package leopard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class youtube_dynamic {
	public static void main(String[]args) throws InterruptedException

	{
		System.setProperty("webdriver.gecko.driver","./selenium softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com");
			 driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Lyrical: Khairiyat | Chhichhore | Nitesh Tiwari | Arijit Singh | Sushant, Shraddha | Pritam\r\n" + 
			 		"38");
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//yt-icon[@class='style-scope ytd-searchbox']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer']")).click();
			 Thread.sleep(1000);
			  WebElement ele=driver.findElement(By.xpath("(//h1[@class='title style-scope ytd-video-primary-info-renderer']/following-sibling::div[1]/div[3]//a//yt-formatted-string)[1]"));
               String x=ele.getText();
               System.out.println(x);
			  Thread.sleep(1000);
			  WebElement ele1=driver.findElement(By.xpath("(//(//h1[@class='title style-scope ytd-video-primary-info-renderer']/following-sibling::div[1]/div[3]//a//yt-formatted-string)[2]"));
			  String y=ele1.getText();
			  System.out.println(y);
			  Thread.sleep(1000);  
			  WebElement ele2=driver.findElement(By.xpath("(//(//h1[@class='title style-scope ytd-video-primary-info-renderer']/following-sibling::div[1]/div[3]//a//yt-formatted-string)[3]"));
			 String z=ele2.getText();
			System.out.println(z);
			Thread.sleep(1000);  
             driver.quit();
}
}
//gfgfjghfh
