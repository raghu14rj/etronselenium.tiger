package leopard;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multipleelements {
public static void main(String[]args) throws InterruptedException
{
System.setProperty("webdriver.gecko.driver","./selenium softwares/geckodriver.exe"); 
WebDriver driver=new FirefoxDriver();

driver.get("https://www.amazon.in");
List<WebElement> links = driver.findElements(By.xpath("//a"));
int d=links. size();
System.out.println(d);
Thread.sleep(1000);
for(int i=1;i<d;i=i+50)
{
String text=	links.get(i).getText();
System.out.println(text);
}


}

}
