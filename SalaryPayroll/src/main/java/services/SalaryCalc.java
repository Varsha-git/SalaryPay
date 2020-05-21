package services;
import utility.*;

public class SalaryCalc{
	
	private String empid;
	private double annualctc;
	private long accountdetail;
	private String ifsccode;
	private String permanentaddess;
	private String pannum;
	private int incometax;
	private int pf;
	private double grossannualsalary;
	
	
	
	
	public SalaryCalc(String empid, long accountdetail, double grossannualsalary) {
		super();
		this.empid=empid;
		//this.annualctc = annualctc;
		this.accountdetail = accountdetail;
		//this.ifsccode = ifsccode;
		//this.permanentaddess = permanentaddess;
		//this.pannum = pannum;
		//this.incometax = incometax;
	//	this.pf = pf;
		this.grossannualsalary = grossannualsalary;
	}
	
	
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public double getAnnualctc() {
		return annualctc;
	}
	public void setAnnualctc(double annualctc) {
		this.annualctc = annualctc;
	}
	public long getAccountdetail() {
		return accountdetail;
	}
	public void setAccountdetail(long accountdetail) {
		this.accountdetail = accountdetail;
	}
	public String getIfsccode() {
		return ifsccode;
	}
	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}
	public String getPermanentaddess() {
		return permanentaddess;
	}
	public void setPermanentaddess(String permanentaddess) {
		this.permanentaddess = permanentaddess;
	}
	public String getPannum() {
		return pannum;
	}
	public void setPannum(String pannum) {
		this.pannum = pannum;
	}
	public int getIncometax() {
		return incometax;
	}
	public void setIncometax(int incometax) {
		this.incometax = incometax;
	}
	public int getPf() {
		return pf;
	}
	public void setPf(int pf) {
		this.pf = pf;
	}
	public double getGrossannualsalary() {
		return grossannualsalary;
	}
	public void setGrossannualsalary(double grossannualsalary) {
		this.grossannualsalary = grossannualsalary;
	}
	
	
}
