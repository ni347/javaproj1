package projday2;

//import projday.Person;

public class Employee {
	private String EmpName;
	private String EmpId;
	private String EmpPhonenumber;
	private String EmpGender;
	private int EmpSal;

	public Employee(String EmpName, String EmpId,String EmpPhonenumber, String EmpGender, int EmpSal) {
		// TODO Auto-generated constructor stub
		this.EmpName=EmpName;
		this.EmpId=EmpId;
		this.EmpPhonenumber=EmpPhonenumber;
		this.EmpGender=EmpGender;
		this.EmpSal=EmpSal;
	}
	
	public String getEmpname() {
		return EmpName;
	}
	public void setEmpname(String EmpName) {
		this.EmpName=EmpName;
	}
	
	public String getEmpid() {
		return EmpId;
	}
	public void setEmpid(String EmpId) {
		this.EmpId=EmpId;
	}
	
	public String getEmpphonenumber() {
		return EmpPhonenumber;
	}
	public void setEmpphonenumber(String EmpPhonenumber) {
		this.EmpPhonenumber=EmpPhonenumber;
	}
	
	public String getEmpgender() {
		return EmpGender;
	}
	public void setEmpgender(String EmpGender) {
		this.EmpGender=EmpGender;
	}
	
	public int getEmpsal() {
		return EmpSal;
	}
	public void setEmpsal(int EmpSal) {
		this.EmpSal=EmpSal;
	}
	
//	public void printDetails() {
//		System.out.println("Name: "+this.EmpName);
//		System.out.println("id: "+this.EmpId);
//		System.out.println("Phone number: "+this.EmpPhonenumber);
//		System.out.println("Gender: "+this.EmpGender);
//		System.out.println("Salary: "+this.EmpSal);
//	}
	
	public void printDetails() {
		System.out.println("Name | id | Phone number | Gender | Salary");
		System.out.println(this.EmpName + " | " + this.EmpId + " | " + this.EmpPhonenumber + " | " + this.EmpGender + " | " + this.EmpSal);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("Nikhil","E01","8368531899","M",250);
		emp.printDetails();
	}

}
