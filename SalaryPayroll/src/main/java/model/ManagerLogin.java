package model;
import java.time.*;
public class ManagerLogin {
	
	
	private String email;
	private String password;
	//private String confirmpassword;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	//public String getConfirmpassword() {
		//return confirmpassword;
	//}
	//public void setConfirmpassword(String confirmpassword) {
		//this.confirmpassword = confirmpassword;
	//}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ManagerLogin( String email, String password) {
		super();
		this.email = email;
		this.password = password;
		
	}
	}
