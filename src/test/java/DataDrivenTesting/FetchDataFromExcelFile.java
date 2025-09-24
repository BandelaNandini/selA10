package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		//Convert physical file to java obj
		FileInputStream fis= new FileInputStream("./src/test/resources/TestData.xlsx");
		
		//Fetch the workbook
		Workbook wb = WorkbookFactory.create(fis);
		
		//Fetch the sheet
		Sheet sh = wb.getSheet("data");
		
		//Fetch the row
		Row r = sh.getRow(1);
		
		//Fetch the cell
		Cell c = r.getCell(1);
		
		//Fetch the data
		double data = c.getNumericCellValue();
		System.out.println(data);
	}

}
