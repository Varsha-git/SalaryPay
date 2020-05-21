package services;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import converter.*;
import model.*;
public class ManagerOperations{
		
	ExcelFile excel=new ExcelFile();
	List<EmployeeDetail> list=new ArrayList<>();
	List<SalaryCalc> list1=new ArrayList<>();
	//SalaryCalc sc=new SalaryCalc();
	public List<EmployeeDetail> create(EmployeeDetail emp) throws IOException
	{
		list.add(emp);
		//System.out.println("list.add method works");
		excel.adding(emp, list);	
		return list;
	}
	
	public void delete(String id)
	{
		
		//((ManagerOperations) list).remove(emp);
		excel.deleting(id);
		//return list;
	}
	
	public void read(String fname)
	{
		excel.read(fname);
	}
	
	public List<EmployeeDetail> update(EmployeeDetail emp)
	{
		System.out.println("You can update only employee account detail else delete employee");
		return null;
	}
	
	public List<SalaryCalc> generatePaySlip (SalaryCalc sal) throws IOException
	{
		double taxrate=0.3;
		//double tax=(taxrate * grosspay);
	//	System.out.println(tax);
//		double netsalary= grosspay-tax;
		list1.add(sal);
		excel.addPay(sal, list1);
		return list1;
		//return netsalary;
	}
	
}
