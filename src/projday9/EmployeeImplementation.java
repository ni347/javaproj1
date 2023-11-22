package projday9;

class Employee{
	String name, ssn, dept;
	int sal;
	
	public Employee(String name, String ssn, String dept, int sal) {
		this.name=name;
		this.ssn=ssn;
		this.dept=dept;
		this.sal=sal;
	}
}

public class EmployeeImplementation {
	
	public Employee getEmployeeInfo(String str) {
		String name="";
		String ssn="";
		String dept="";
		int sal=0;
		String[] s = str.split("@|-|#");
		name = s[0];
		ssn = s[1];
		dept = s[2];
		sal = Integer.parseInt(s[3]);
		Employee emp = new Employee(name,ssn,dept,sal);
		return emp;
	}
	
	public String getEmployeeDept(Employee e) {
		String dept="";
		String SSN = e.ssn.substring(e.ssn.length()-3);
		int ssn_num = Integer.parseInt(SSN);
		if(ssn_num>=1&&ssn_num<=60) {
			dept = "L1";
		}
		else if(ssn_num>60&&ssn_num<=120) {
			dept = "L2";
		}
		else if(ssn_num>120&&ssn_num<=180) {
			dept = "L3";
		}
		else {
			dept = "L4";
		}
		return dept;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Amit Rai@1PC16CS046-ALU#8";
		EmployeeImplementation ei = new EmployeeImplementation();
		Employee emp = ei.getEmployeeInfo(s1);
		String dept= ei.getEmployeeDept(emp);
		
		System.out.println("Employee name: " + emp.name);
		System.out.println("Employee ssn: "+emp.ssn);
		System.out.println("Employee dept: "+emp.dept);
		System.out.println("Employee sal: "+emp.sal);
		
		System.out.println("Emp dept: "+dept);
		
	}
}