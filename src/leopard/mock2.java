package leopard;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.stream.FileImageOutputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mock2 {
	public static void main(String[]args) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{


     /*   System.setProperty("webdriver.gecko.driver","./selenium softwares/geckodriver.exe");
     WebDriver driver= new FirefoxDriver();
    driver.get("https://www.flipkart.com/");
    	Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		 Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("oneplus7T");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		 Thread.sleep(11000);
		String f = driver.findElement(By.xpath("//div[.='OnePlus 7T (Glacier Blue, 128 GB)']/../following-sibling::div/div[1]")).getText();
		System.out.println(f);
		*/
		
        System.setProperty("webdriver.gecko.driver","./selenium softwares/geckodriver.exe");
        Thread.sleep(3000);
       WebDriver driver1= new FirefoxDriver();
        Thread.sleep(4000);
        driver1.get("https://www.amazon.in/");
    	Thread.sleep(1000);
      //  driver1.findElement(By.xpath("(//input[@class='nav-input'])[2]")).click();
		// Thread.sleep(1000);
    	driver1.findElement(By.xpath("(//input[@class='nav-input'])[2]")).sendKeys("OnePlus 7T (Glacier Blue, 128 GB)");
		 Thread.sleep(1000);
 driver1.findElement(By.id("nav-search-submit-text")).click();
		 Thread.sleep(8000);
		String f1 = driver1.findElement(By.xpath("//span[.='37,999']")).getText();
		System.out.println(f1);

}  
}