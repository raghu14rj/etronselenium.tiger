package leopard;     
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class datadrivenprint {
	public static void main(String[]args) throws InvalidFormatException, IOException

	{
		 FileInputStream fis = new FileInputStream("./excel1/presentdata.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("sheet1");
		Row r = sh.createRow(0);
		Cell c = r.createCell(0);
		c.setCellValue("manager");
		//permissiuon
		FileOutputStream fos = new FileOutputStream("./excel1/presentdata.xlsx");
		 wb.write(fos);
		 
	}

}
