package leopard;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

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
import org.openqa.selenium.firefox.FirefoxDriver;

public class datadrivenlinks
{
public static void write_data(int row,String data) throws EncryptedDocumentException, InvalidFormatException, IOException
	//public static void main(String[]args) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException

	{
		 FileInputStream fis = new FileInputStream("./excel1/presentdata.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("sheet1");
		Row r = sh.createRow(row);
		Cell c = r.createCell(0);
		c.setCellValue(data);
		//permission
		FileOutputStream fos = new FileOutputStream("./excel1/presentdata.xlsx");
		wb.write(fos);
	}




public static void main(String[]args) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	System.setProperty("webdriver.gecko.driver","./selenium softwares/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	List<WebElement> links = driver.findElements(By.tagName("a"));
	Thread.sleep(3000);
	int count = links.size();
	System.out.println(count);
	TreeSet<String> tr=new TreeSet<String>(Collections.reverseOrder());
	for(WebElement we:links)
	{
		String dat = we.getText();
		tr.add(dat);
	}
	int i=0;
	for(String dat: tr)
	{
		if (i<count)
		write_data(i,dat);
		System.out.println(dat);
		
	}
}



}
