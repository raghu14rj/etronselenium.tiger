package leopard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class actitime_1 {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.gecko.driver","./selenium softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
			 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
			 driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
			 driver.findElement(By.xpath("//label[@id='keepLoggedInLabel']")).click();
			 driver.findElement(By.xpath("//a[@id='loginButton']")).click();
			 String title=driver.getCurrentUrl();
			 System.out.println(title);
			 if(title.equals("http://localhost/administration/notifications.do"))
			 {
				 System.out.println("homepage is displayed: pass");
			 }
			 else
			 {
				 System.out.println("homepage is displayed: fail");
			 }
			 driver.findElement(By.xpath("//a[.='Logout']")).click();
			 String title1=driver.getCurrentUrl();
			 System.out.println(title1);
			 //gfhgfhgf
			 if(title.equals("http://localhost/login.do"))
			 {
				 System.out.println("loginpage is displayed: pass");	 
			 }
			 else
			 {
				 System.out.println("login page is displayed: fail");
			 }
}
}

