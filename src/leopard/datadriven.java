  package leopard;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class datadriven {
public static void main(String[]args) throws EncryptedDocumentException, InvalidFormatException, IOException  
{
FileInputStream fis =new FileInputStream("./excel1/presentdata.xlsx");
Workbook wb = WorkbookFactory.create(fis);
Sheet sh = wb.getSheet("Sheet1");
Row r = sh.getRow(4);
Cell c = r.getCell(2);
String data = c.getStringCellValue();
System.out.println(data);
System.out.println(c.toString());
}
}
