package leopard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
//vjhjh
public class pomflipkart {
	
		@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
		private WebElement email;
		@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
		private WebElement pwd;
	@FindBy(xpath="//button[@type='submit']")
		private WebElement login;
		
	public pomflipkart(WebDriver driver)	
	{
		PageFactory.initElements(driver, this);
	}

	public void enteremail(String un)
	{
		email.sendKeys(un);
	}
	public void enterpwd(String pwd1)
	{
		pwd.sendKeys(pwd1);
	}
	public void login()
	{
		login.click();
	}

	}

//jj
class test2
{
		@Test
		public void test_login()
		{
			System.setProperty("webdriver.gecko.driver","./selenium softwares/geckodriver.exe");
			WebDriver driver= new FirefoxDriver();
	driver.get("https://www.flipkart.com/");
		pomflipkart ps=new pomflipkart(driver);
		ps.enteremail("raghu14.rj@gmail.com");
		ps.enterpwd("8073334690");
		ps.login();
		}
	}

