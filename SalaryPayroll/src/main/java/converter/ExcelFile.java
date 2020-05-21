package converter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import model.EmployeeDetail;
import services.SalaryCalc;

public class ExcelFile {
	String filename1="G:\\Workspace\\SalaryPayroll\\Employee.xls";
	String filename2="G:\\Workspace\\SalaryPayroll\\PaySlip.xls";
	int i=1;
	File checkFile = new File(filename1);
	File file=new File(filename2);
	//Workbook workbook = null;
	FileOutputStream out;
	
	public void read(String fname)
	{
		try
	      {
	          FileInputStream file = new FileInputStream(new File(fname));
	          Workbook workbook = new HSSFWorkbook(file);
	          Sheet sheet = workbook.getSheetAt(0);
	          Iterator<Row> rowIterator = sheet.iterator();
	        int i=0;
	          while (rowIterator.hasNext()) 
	          {
	             Row  row = rowIterator.next();
	              if(i!=1) {
	              	 row = rowIterator.next();
	              	 i++;
	              }
	              //For each row, iterate through all the columns
	              Iterator<Cell> cellIterator = row.cellIterator();
	               
	              while (cellIterator.hasNext()) 
	              {
	                  Cell cell = cellIterator.next();
	                  //Check the cell type and format accordingly
	                  switch (cell.getCellType()) 
	                  {
	                      //case Cell.CELL_TYPE_NUMERIC:
	                         // System.out.print(cell.getNumericCellValue() + "\t");
	                          //break;
	                      case Cell.CELL_TYPE_STRING:
	                          System.out.print(cell.getStringCellValue() + "\t\t");
	                          break;
	                  }
	              }
	              System.out.println("");
	          }
	          file.close();
	      
	      }catch (Exception e) {
	      	System.out.println(e.getMessage());
	      }
	}
	
	@SuppressWarnings("resource")
	public void deleting(String id)
	{
		try
		{
		FileInputStream file=new FileInputStream(checkFile);
		Workbook workbook= new HSSFWorkbook(file);
		Sheet sheet=workbook.getSheet("EmployeeDetails");
		for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
      	  Row row = sheet.getRow(rowIndex);
      	  if (row != null) {
      	    Cell cell = row.getCell(0);
      	    String value=cell.getStringCellValue();
      	    if (value.equals(id)) {
      	    	sheet.removeRow(sheet.getRow(rowIndex));
      	    	//heet.shiftRows(rowIndex+1,sheet.getLastRowNum(), -1);
      	    	 System.out.println("Deleted Successfully!");
      	    }
      	  }
      	}
          out = new FileOutputStream(checkFile);
	        workbook.write(out);
	        out.close();
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
	public HSSFWorkbook adding(EmployeeDetail emp,List<EmployeeDetail> list) throws IOException
	{
		if(checkFile.exists())
		{
			try
			{
				System.out.println("getting intp checkfile exist");
				FileInputStream fis = new FileInputStream(checkFile);
				Workbook workbook = new HSSFWorkbook(fis);
				Sheet sheet= workbook.getSheet("EmployeeDetails");
				//int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
				//System.out.println("Total rows retained" + rowCount);
				fis.close();
				for(EmployeeDetail emp1: list)
				{
					System.out.println("in for loop");	
					int rowSize = sheet.getPhysicalNumberOfRows();
					System.out.println(rowSize);
			      	Row nextRows = sheet.createRow(++rowSize);
			      	System.out.println(rowSize);
			      	nextRows.createCell(0).setCellValue(emp1.getEmployeeid());
			      	nextRows.createCell(1).setCellValue(emp1.getName());
			      	nextRows.createCell(2).setCellValue(emp1.getEmail());
			      	nextRows.createCell(3).setCellValue(emp1.getDateofjoining());
			      	nextRows.createCell(4).setCellValue(emp1.getJobtitle());
			      	nextRows.createCell(5).setCellValue(emp1.getDepartment());
			      	nextRows.createCell(6).setCellValue(emp1.getCurrentaddress());
			      	nextRows.createCell(7).setCellValue(emp1.getPermanentaddess());
			      	nextRows.createCell(8).setCellValue(emp1.getAnnualctc());
			      	nextRows.createCell(9).setCellValue(emp1.getEmployeestatus());
			      	nextRows.createCell(10).setCellValue(emp1.getAccountdetail());
			      	nextRows.createCell(11).setCellValue(emp1.getIfsccode());
			      	nextRows.createCell(12).setCellValue(emp1.getPannum());
				}
				out = new FileOutputStream(filename1);
				workbook.write(out);
				out.close();
				workbook.close();
			}	
			catch (IOException e) {
		
			e.printStackTrace();
			}
		
			return null;
		}
		else
		{
			try
			{
				Workbook workbook = new HSSFWorkbook ();
				HSSFSheet sheet= (HSSFSheet) workbook.createSheet("EmployeeDetails");
				Row row=sheet.createRow(0);
				row.createCell(0).setCellValue("ID");
				row.createCell(1).setCellValue("Name");
				row.createCell(2).setCellValue("Email-Id");
				row.createCell(3).setCellValue("DateOFJoining");
				row.createCell(4).setCellValue("Job Title");
				row.createCell(5).setCellValue("Department");
				row.createCell(6).setCellValue("Current Address");
				row.createCell(7).setCellValue("Permanent Address");
				row.createCell(8).setCellValue("Employee Status");
				row.createCell(9).setCellValue("Annual CTC");
				row.createCell(10).setCellValue("Account No.");
				row.createCell(11).setCellValue("IFSC Code");
				row.createCell(12).setCellValue("PAN No.");
				
				for(EmployeeDetail emp1: list)
				{
			      	Row nextRows = sheet.createRow(i);
			      	nextRows.createCell(0).setCellValue(emp1.getEmployeeid());
			      	nextRows.createCell(1).setCellValue(emp1.getName());
			      	nextRows.createCell(2).setCellValue(emp1.getEmail());
			      	nextRows.createCell(3).setCellValue(emp1.getDateofjoining());
			      	nextRows.createCell(4).setCellValue(emp1.getJobtitle());
			      	nextRows.createCell(5).setCellValue(emp1.getDepartment());
			      	nextRows.createCell(6).setCellValue(emp1.getCurrentaddress());
			      	nextRows.createCell(7).setCellValue(emp1.getPermanentaddess());
			      	nextRows.createCell(8).setCellValue(emp1.getAnnualctc());
			      	nextRows.createCell(9).setCellValue(emp1.getEmployeestatus());
			      	nextRows.createCell(10).setCellValue(emp1.getAccountdetail());
			      	nextRows.createCell(11).setCellValue(emp1.getIfsccode());
			      	nextRows.createCell(12).setCellValue(emp1.getPannum());
	      	  	}
				out = new FileOutputStream(filename1);
				workbook.write(out);	
			}
			catch (Exception e)
			{
					e.printStackTrace();
			}
			return null;
		}	//close else
	}

	public HSSFWorkbook addPay(SalaryCalc sal,List<SalaryCalc> list1) throws IOException
	{
		
		//if(checkFile.exists())
		//{
			try
			{
				System.out.println("getting intp checkfile exist");
				FileInputStream fis = new FileInputStream(file);
				Workbook workbook = new HSSFWorkbook(fis);
				Sheet sheet= workbook.createSheet("SalarySlip");
				Row row=sheet.createRow(0);
				row.createCell(0).setCellValue("ID");
				row.createCell(1).setCellValue("Name");
				row.createCell(2).setCellValue("Email-Id");
				//int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
				//System.out.println("Total rows retained" + rowCount);
				fis.close();
				for(SalaryCalc salry: list1)
				{
					System.out.println("in for loop");
					Row nextRows = sheet.createRow(i);
					//int rowSize = sheet.getPhysicalNumberOfRows();
			      //	Row nextRows = sheet.createRow(rowSize++);
			      	nextRows.createCell(0).setCellValue(salry.getEmpid());
			      	nextRows.createCell(1).setCellValue(salry.getAccountdetail());
			      	nextRows.createCell(2).setCellValue(salry.getGrossannualsalary());
			      //	nextRows.createCell(3).setCellValue(fillSheet.getMobile());
			      //	nextRows.createCell(4).setCellValue(fillSheet.getUserName());
	      	  	}
				out = new FileOutputStream(file);
				workbook.write(out);
				out.close();
				workbook.close();
			}	catch (IOException e) {
		
			e.printStackTrace();
		}
		
		return null;
		}
	
}