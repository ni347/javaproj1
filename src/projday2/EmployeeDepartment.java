package projday2;

import java.util.HashMap;
import java.util.Scanner;

import projday3.ArrayList;
import projday3.EmployeeDetails;

class EmployeePersonal{
	private String EmpName;
	private String EmpId;
	private String EmpPhonenumber;
	private String EmpGender;
	private int EmpSal;
	
	public EmployeePersonal(String EmpName, String EmpId,String EmpPhonenumber, String EmpGender, int EmpSal) {
		// TODO Auto-generated constructor stub
		this.EmpName=EmpName;
		this.EmpId=EmpId;
		this.EmpPhonenumber=EmpPhonenumber;
		this.EmpGender=EmpGender;
		this.EmpSal=EmpSal;
	}
	
	public String getEmpname() {
		return this.EmpName;
	}
	public void setEmpname(String EmpName) {
		this.EmpName=EmpName;
	}
	
	public String getEmpid() {
		return this.EmpId;
	}
	public void setEmpid(String EmpId) {
		this.EmpId=EmpId;
	}
	
	public String getEmpphonenumber() {
		return this.EmpPhonenumber;
	}
	public void setEmpphonenumber(String EmpPhonenumber) {
		this.EmpPhonenumber=EmpPhonenumber;
	}
	
	public String getEmpgender() {
		return this.EmpGender;
	}
	public void setEmpgender(String EmpGender) {
		this.EmpGender=EmpGender;
	}
	
	public int getEmpsal() {
		return this.EmpSal;
	}
	public void setEmpsal(int EmpSal) {
		this.EmpSal=EmpSal;
	}
	
}

public class EmployeeDepartment extends EmployeePersonal{
	private String DeptName;
	private String CompName;
	
	public EmployeeDepartment(String EmpName, String EmpId,String EmpPhonenumber, String EmpGender, int EmpSal, String DeptName, String CompName) {
		super(EmpName,EmpId,EmpPhonenumber,EmpGender,EmpSal);
		this.DeptName=DeptName;
		this.CompName=CompName;
	}
	
	public String getDeptname() {
		return this.DeptName;
	}
	public void setDeptname(String DeptName) {
		this.DeptName=DeptName;
	}
	
	public String getCompname() {
		return this.CompName;
	}
	public void setCompname(String CompName) {
		this.CompName=CompName;
	}
	
//	public void eDetails() {
//		System.out.println("Employee Name:"+this.getEmpname());
//		System.out.println("Employee id:"+this.getEmpid());
//		System.out.println("Employee Phone Number:"+this.getEmpphonenumber());
//		System.out.println("Employee Gender:"+this.getEmpgender());
//		System.out.println("Employee Salary:"+this.getEmpsal());
//		System.out.println("Employee Department Name:"+this.DeptName);
//		System.out.println("Employee Company Name:"+this.DeptName);
//	}
	
	public String toString() {
		return ("Employee Name:"+super.getEmpname()+"\nEmployee id:"+super.getEmpid()+"\nEmployee Phone Number:"+super.getEmpphonenumber()+"\nEmployee Gender:"+super.getEmpgender()+"\nEmployee Salary:"+super.getEmpsal()+"\nEmployee Department Name:"+this.DeptName+"\nEmployee Company Name:"+this.CompName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		EmployeeDepartment obj = new EmployeeDepartment("Nikhil","E02","8368531899","Male",2500,"Automation","Capgemini");
//		System.out.println("Name | id | Phone number | Gender | Salary | Department Name | Company Name");
//		System.out.println(obj.getEmpname() + " | " + obj.getEmpid() + " | " + obj.getEmpphonenumber() + " | " + obj.getEmpgender() + " | " + obj.getEmpsal() + "|" + obj.getDeptname() + "|" + obj.getCompname());
//		obj.eDetails();
		EmployeeDepartment[] ob1 = new EmployeeDepartment[2];
		ob1[0] = new EmployeeDepartment("Nikhil","E01","8368531899","Male",2500,"Automation","Capgemini");
//		ob1[1] = new EmployeeDepartment("Abhinav","E02","8368999999","Male",3500,"IT","Capgemini");
//		System.out.println("Employee1 details\n"+ob1[0]);
//		System.out.println("Employee2 details\n"+ob1[1]);
		
		
//		if(sc.hasNext()) {
//			
//		}
		HashMap<String, EmployeeDetails> list = new HashMap<String, EmployeeDetails>();

		for(int i=0;i<2;i++) {
			
			System.out.println("Employee details"+(i+1)+": ");
			System.out.println("Enter name: ");
			String name  = sc.next();
			System.out.println("Enter id: ");
			String id = sc.next();
			System.out.println("Enter Contact number: ");
			String contact = sc.next();
			System.out.println("Enter gender: ");
			String gen = sc.next();
			System.out.println("Enter salary: ");
			int sal = sc.nextInt();
			System.out.println("Enter department: ");
			String dep = sc.next();
			sc.nextLine();
			System.out.println("Enter company: ");
			String comp = sc.next();
			list.add();
			ob1[i] = new EmployeeDepartment(name,id,contact,gen,sal,dep,comp);
		}
		
	
		
		
		
	}

}
