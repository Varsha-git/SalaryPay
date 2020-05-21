package converter;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ConvertPdf {
	
	
	public void convertPdf() throws IOException
	{
	String filename="G:\\Workspace\\SalaryPayroll\\Employee.xls";
		File file=new File(filename);
	//Instantiate a new workbook with excel file path
	FileInputStream fis=new FileInputStream(file);
	Workbook workbook = new HSSFWorkbook(fis);
	//Save the document in Pdf format
	//workbook.save("F:\\FileTemp\\MyPdfFile.pdf", FileFormatType.PDF);

	}
		
}
