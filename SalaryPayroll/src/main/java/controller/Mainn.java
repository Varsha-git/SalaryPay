package controller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.*;
import services.ManagerOperations;
import services.SalaryCalc;
import utility.*;

class Front
{
	int choice;
	EmployeeDetail emp=null;
	SalaryCalc salc=null;
	List<EmployeeDetail> list=new ArrayList<EmployeeDetail>();
	List<SalaryCalc> salary= new ArrayList<SalaryCalc>();
	ManagerOperations mo=new ManagerOperations();
	void Manager() throws IOException
	{
				Scanner sc=new Scanner(System.in);
				BufferedReader br= new BufferedReader(new InputStreamReader(System.in));		
				do
				{
					System.out.println("Now you have entered as Manager. "+
				"\n"+"Which operation you want to perform."+"\n"+"1. Add Employee Detail"+" \n"+ "2. Delete Employee Detail"
						+"\n"+ "3. Read Employee Detail" + "\n"+ "4. Generate pay slip of particular employee");
				choice=sc.nextInt();
				switch(choice)
				{
				case 1:
						
					System.out.println("Enter Employee ID :");
					String id=br.readLine();
					System.out.println("Enter Name : ");
					String nm=br.readLine();
					System.out.println("Enter e-mail : ");
					String em=br.readLine();
					System.out.println("Enter Date of Joining :");
					String doj=br.readLine();
					System.out.println("Enter Job Title : ");
					String jt=br.readLine();
					System.out.println("Enter Department : ");
					String dp=br.readLine();
					System.out.println("Enter Current Address :");
					String ca=br.readLine();
					System.out.println("Enter Permanent Address :");
					String pa=br.readLine();
					System.out.println("Enter Employee Status : ");
					String es=br.readLine();
					System.out.println("Enter Employee Annual CTC : ");
					Double ac= Double.parseDouble(br.readLine());
					System.out.println("Enter Employee Account No. :");
					Long an=Long.parseLong(br.readLine());
					System.out.println("Enter IFSC Code : ");
					String ifsc=br.readLine();
					System.out.println("Enter PAN no. : ");
					String pan=br.readLine();
					
					emp= new EmployeeDetail(id,nm, em,doj,jt,dp,ca,pa,es,ac,an,ifsc,pan);
					list= mo.create(emp);
					try
					{
						list.add(emp);
						
					}
					catch(Exception e)
					{
						e.getMessage();
					}
					break;
				case 2:
				
					System.out.println("Which employee detail you want to delete. please Enter emp id : ");
					String idd=sc.next();
					mo.delete(idd);	
					break;
				
				case 3:
				
					System.out.println("Enter file name to get data ");
					String fname=sc.next();
					mo.read(fname);
					break;
				
				case 4:
				
					System.out.println("enter employee id :");
					String empid=sc.next();
					System.out.println("Enter account detail :");
					Long acc=sc.nextLong();
					System.out.println("enter gross salary : ");
					Double gs=sc.nextDouble();
					salc=new SalaryCalc(empid,acc,gs);
					try {
						salary=mo.generatePaySlip(salc);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						salary.add(salc);
					}
					catch(Exception e)
					{
						e.getMessage();
					}
					break;
					//System.out.println("net salary = "+net);		
				case 5: break;
				}
			
				}while(choice!=5);
	}
}

public class Mainn {
	
	public static void main(String args[]) throws IOException
	{
		System.out.println("SALARY PAY SYSTEM ");
		int choice;
		Front fobj=new Front();
		Scanner sc=new Scanner(System.in);
		ManagerLoginValidation cv=new ManagerLoginValidation();
		while(true)
		{
			System.out.println("Choose your login- 1. Manager Log in " +"\n" + "2. Manager Sign up "+"\n" + "3. Employee login"+ "\n");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1 :
					System.out.println("Enter Email : ");
					String email=sc.next();
					System.out.println("Enter Password : ");
					String pwd=sc.next();
					if(cv.checkManagerLogin(email,pwd))
					{
					System.out.println();
					System.out.println("You have log in succesfully !!! ");
					fobj.Manager();
					}
					else
					{
						System.out.println("Incorrect email or password");
					}
										
					break;
				case 2 : 
					System.out.println("Enter name");
					String name=sc.next();
					System.out.println("Enter number");
					String number=sc.next();
					System.out.println("Enter company name");
					String cname=sc.next();
					System.out.println("Enter company address");
					String cadd=sc.next();
					System.out.println("Enter Company registered number");
					String reg=sc.next();
					System.out.println("Enter Password : ");
					String psswd=sc.next();
					System.out.println("Enter Confirm Password : ");
					String cpswd=sc.next();
					if(cv.checkManagerSignup(name, number,cname,cadd,reg,psswd,cpswd))
					{
					System.out.println("You sign up");
					}
					else
					{
					System.out.println("sign up again");
					}
					break;
		case 3 : 
				System.out.println("Enter Employee ID :");
				String eid=sc.next();
				System.out.println("Enter Email : ");
				String mail=sc.next();
				System.out.println("Enter Password : ");
				String pswd=sc.next();
				if(cv.checkEmployeeLogin(eid,mail,pswd))
				{
				System.out.println();
				System.out.println("You log in succesfully in employee account");
				}
				System.out.println("1. Read your Detail");
				
				int ch=sc.nextInt();
				if(ch==1)
				{
					
				}
				break;
		default:
				System.out.println("please select 1 or 2");
		
		}
	}
	
	}
}





