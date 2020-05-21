package model;

import java.time.LocalDate;

public class EmployeeDetail {
	private String employeeid;
	private String name;
	private String email;
	private String dateofjoining;
	private String jobtitle;
	private String department;
	private String currentaddress;
	private String employeestatus;
	private double annualctc;
	private long accountdetail;
	private String ifsccode;
	private String permanentaddess;
	private String pannum;
	
	public String getCurrentaddress() {
		return currentaddress;
	}
	public void setCurrentaddress(String currentaddress) {
		this.currentaddress = currentaddress;
	}
	public String getEmployeestatus() {
		return employeestatus;
	}
	public void setEmployeestatus(String employeestatus) {
		this.employeestatus = employeestatus;
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
		
	public EmployeeDetail(String employeeid,String name, String emai,String dateofjoining,String jobtitle,
			String depart,String currentadd,String permanadd,String empstatus,double ctc,long acc,String code,String pan) {
		super();
		this.employeeid = employeeid;
		this.name = name;
		this.email = emai;
		this.dateofjoining = dateofjoining;
		this.jobtitle = jobtitle;
		this.department = depart;
		this.currentaddress=currentadd;
		this.permanentaddess=permanadd;
		this.employeestatus=empstatus;
		this.annualctc = ctc;
		this.accountdetail=acc;
		this.ifsccode=code;
		this.pannum = pan;
		
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDateofjoining() {
		return dateofjoining;
	}
	public void setDateofjoining(String dateofjoining) {
		this.dateofjoining = dateofjoining;
	}
	public String getJobtitle() {
		return jobtitle;
	}
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}
	
}
