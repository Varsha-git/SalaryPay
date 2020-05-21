package model;

import java.time.LocalDate;

public class ManagerSignup {
	private String name;
	private String number;
	LocalDate salaryDate;
	private String companyName;
	private String companyAddress;
	private String companyRegNo;
	private String password;
	private String confirmpassword;
	
	//private String state;
	//private String pincode;
	//private String companyPAN;
	//private String companyTAN;
	//private String gstin;

	public ManagerSignup(String name, String number, LocalDate salaryDate, String companyName, String companyAddress,
			String companyRegNo,String password) {
		super();
		this.name = name;
		this.number = number;
		this.salaryDate = salaryDate;
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.companyRegNo = companyRegNo;
		this.password=password;
		this.confirmpassword=confirmpassword;
		//this.state = state;
		//this.pincode = pincode;
		//this.companyPAN = companyPAN;
		//this.companyTAN = companyTAN;
		//this.gstin = gstin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompanyName() {
	return companyName;
	}
	public void setCompanyName(String companyName) {
	this.companyName = companyName;
	}
	public String getCompanyAddress() {
	return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
	this.companyAddress = companyAddress;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	/*public String get() {
	return state;
	}
	public void setState(String state) {
	this.state = state;
	}
	public String getPincode() {
	return pincode;
	}	
	public void setPincode(String pincode) {
	this.pincode = pincode;
	}
	public String getCompanyPAN() {
	return companyPAN;
	}
	public void setCompanyPAN(String companyPAN) {
	this.companyPAN = companyPAN;
	}
	public String getCompanyTAN() {
	return companyTAN;
	}
	public void setCompanyTAN(String companyTAN) {
	this.companyTAN = companyTAN;
	}
	//public String getGstin() {
	//return gstin;
	//}
	//public void setGstin(String gstin) {
	//this.gstin = gstin;
	//}*/
	public String getCompanyRegNo() {
	return companyRegNo;
	}
	public void setCompanyRegNo(String companyRegNo) {
	this.companyRegNo = companyRegNo;
	}
	public LocalDate getSalaryDate() {
	return salaryDate;
	}
	public void setSalaryDate(LocalDate salaryDate) {
	this.salaryDate = salaryDate;
	}

	public String getNumber() {
	return number;
	}
	public void setNumber(String number) {
	this.number = number;
	}
	
}
