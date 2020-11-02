package leopard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class realxpath_gmail {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.gecko.driver","./selenium softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.apsrtconline.in/oprs-web/login/show.do");
			 driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("raghu14.rj");
			 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("8073334690");
			 driver.findElement(By.xpath("//input[@id='submitBtn']")).click();
			 String title=driver.getCurrentUrl();
			 System.out.println(title);
			 if(title.equals("https://www.apsrtconline.in/oprs-web/ticket/cancel.do?l=1"))
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
			 
			 if(title.equals("https://www.apsrtconline.in/oprs-web/login/show.do"))
			 {
				 System.out.println("loginpage is displayed: pass");	 
			 }
			 else
			 {
				 System.out.println("login page is displayed: fail");
			 }
}
}


