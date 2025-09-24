package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteBackDataToExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis= new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("data");
//		Row r = sh.getRow(1);
		Row r = sh.createRow(7);
		Cell c = r.createCell(3);
		c.setCellValue("selenium");
		FileOutputStream fos=new FileOutputStream("./src/test/resources/TestData.xlsx");
		wb.write(fos);
		
		wb.close();
		
	}
}
