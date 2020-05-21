package services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.EmployeeDetail;

public class EmployeeOperation {

	
	 List<EmployeeDetail> list=new ArrayList<>();
		
		public List<EmployeeDetail> read(EmployeeDetail emp) throws IOException
		{
			
			//list.add(emp);
			//excel.excelGenerator(emp, list);
			return list;
		}
}
