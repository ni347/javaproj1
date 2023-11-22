package projday5;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Employee{
	private String name;
	private String ssn;
	private String dept;
	private int sal;
	
	public Employee(String name,String ssn,String dept,int sal) {
		this.name=name;
		this.ssn=ssn;
		this.dept=dept;
		this.sal=sal;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn=ssn;
	}
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept=dept;
	}
	
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal=sal;
	}
	

public String toString() {
	return ("Name: "+this.name+"\nSSN: "+this.ssn+"\nDept: "+this.dept+"\nSalary: "+this.sal);
}
}

public class EmployeeImplementation {
	
//	public EmployeeImplementation(String name,String ssn,String dept,int sal) {
//		
//	}
	
	public Employee getEmployeeInfo(String str) {
		Pattern p = Pattern.compile("^[a-zA-Z]+\s[a-zA-Z]+@[A-Z0-9]{7}[0-9]{3}-[A-Z]+#[0-9]$");
		Matcher m = p.matcher(str);
		
		StringTokenizer splitter = new StringTokenizer(str,"@-#");
		String[] str1= new String[4];
		int i=0;
		while(splitter.hasMoreTokens()) {
			str1[i] = splitter.nextToken();
			i++;
		}
		int sal = Integer.parseInt(str1[3]);
		return new Employee(str1[0],str1[1],str1[2],sal);
	}
	
	public String getEmployeeDept(Employee e) {
		int n;
	    n = Integer.parseInt(e.getSsn().substring(7,10));
	    
	    if(n>=1&&n<=60){
	    	return "L1";
	    }
	    else if(n>60&&n<=120){
	    	return "L2";
	    }
	    else if(n>120&&n<=180){
	    	return "L3";
	    }
	    else if(n>180){
	    	return "L4";
	    }
	    return "";
	}	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeImplementation e1 = new EmployeeImplementation();
		Employee e = e1.getEmployeeInfo("Nikhil Rai@1PC16CS130-ALU#8");
		System.out.println(e);
		System.out.println(e1.getEmployeeDept(e));
	}
}



