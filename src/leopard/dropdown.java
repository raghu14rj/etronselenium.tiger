package leopard;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void main(String[]args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver","./selenium softwares/geckodriver.exe"); 
	WebDriver driver=new FirefoxDriver();

	driver.get("https://www.facebook.com");
	WebElement links = driver.findElement(By.xpath("//select[@id='month']"));
	
	Select s=new Select(links);
	List<WebElement> options = s.getOptions();
	ArrayList<String> we=new ArrayList<>();
	for(WebElement t:options)
	{
		String text=t.getText();  
		we.add(text);
	}
	System.out.println(we);
	System.out.println("*************************");
	TreeSet<String> tr=new TreeSet<>(we);
	System.out.println(tr);
	
	

}

		
	}
