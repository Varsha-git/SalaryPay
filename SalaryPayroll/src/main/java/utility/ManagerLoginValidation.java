package utility;
import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ManagerLoginValidation {

	private static final String PASSWORD_PATTERN = "^((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,20})$";
	String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	private Pattern pattern= Pattern.compile(PASSWORD_PATTERN);
	private Pattern pattern2=Pattern.compile(regex);
	private Matcher matcher1,matcher2;
	
	public boolean checkManagerSignup(String name,String number,String companyName,String companyAddress,String companyRegNo,String password,String confirmPassword)
	{
		System.out.println("in sign up method");
		if(fieldNotEmpty(name, number,companyName,companyAddress,companyRegNo) && validConfPassword(password,confirmPassword))
			return true;
		else 
			return false;
	}
	public boolean checkEmployeeLogin(String employeeid,String email,String password)
	{		
		//System.out.println("entering into check manager method");
		if((validPassword(password)) && (validEmail(email)) && (!employeeid.isEmpty() && employeeid != null))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public boolean checkManagerLogin(String email,String password)
	{		
		//System.out.println("entering into check manager method");
		if((validPassword(password)) && (validEmail(email)))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	
	private boolean validPassword(String password)
	{
		//System.out.println("Entering into check password");
		
		// if(password.equals(confirmPassword)) {
		 
		 if(pattern.matcher(password).matches())
			 return true;
		 else
			 return false;
		 //matcher2 = pattern.matcher(confirmPassword);
		// System.out.println(matcher1);
		 //System.out.println(matcher2);
		//return (matcher1.matches());
		 
	}
	
	private boolean validConfPassword(String password,String confirmPassword)
	{
		//System.out.println("Entering into check password");
		pattern = Pattern.compile(PASSWORD_PATTERN);
		 if(password.equals(confirmPassword)) {
		 
		 matcher1 = pattern.matcher(password);
		 matcher2 = pattern.matcher(confirmPassword);
		//System.out.println(matcher1);
		//System.out.println(matcher2);
		return (matcher1.matches() && matcher2.matches());}
		 return false;
		 
		 
	}
	
	private boolean validEmail(String email)
	{	
		 // System.out.println("Enter email validation");
		//matcher1=pattern2.matcher(email);
		 return pattern2.matcher(email).matches();
	}
	
	/*private boolean validMobile(String number)
	{
		//System.out.println("Checking Mobile");
		String regex = "(0/91)?[7-9][0-9]{9}";
		return number.matches(regex);
	}*/

	
	private boolean fieldNotEmpty(String name,String number,String companyName,String companyAddress,String companyRegNo)
	{
		if((name != null && !name.isEmpty()) && (number != null && !number.isEmpty())
				&& (companyName != null && !companyName.isEmpty()) && (companyAddress != null && !companyAddress.isEmpty())
				&& (companyRegNo != null && !companyRegNo.isEmpty())) {
			System.out.println("Success");
			return true;
		}
		else
	{
		System.out.println("failed");
		return false;
	}
	
}
}
