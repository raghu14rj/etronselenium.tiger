package leopard;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class pomfacebook {
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	@FindBy(xpath="//input[@id='pass']")
	private WebElement pwd;
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement login;
	
public pomfacebook(WebDriver driver)	
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


class test1
{
//	@test
	public void test_login()
	{
		System.setProperty("webdriver.gecko.driver","./selenium softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	pomfacebook ps=new pomfacebook(driver);
	ps.enteremail("raghu14.rj@gmail.com");
	ps.enterpwd("8073334690");
	ps.login();
	}
}