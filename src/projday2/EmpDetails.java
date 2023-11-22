package projday2;

//import projday.Person;

class Employee1 {
	private String EmpName;
	private String EmpId;
	private String EmpPhonenumber;
	private String EmpGender;
	private int EmpSal;
	
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
	
	
//	public void printDetails() {
//		System.out.println("Name | id | Phone number | Gender | Salary");
//		System.out.println(getEmpname() + " | " + getEmpid() + " | " + getEmpphonenumber() + " | " + getEmpgender() + " | " + getEmpsal());
//		
//	}
	
	public String toString() { //Objet clss = Cosmic Super class
		return this.EmpName + " | " + this.EmpId + " | " + this.EmpPhonenumber + " | " + this.EmpGender + " | " + this.EmpSal;
	}
	
}

public class EmpDetails{
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee1 emp = new Employee1("Nikhil","E01","8368531899","M",250);
		Employee1 emp = new Employee1();
		emp.setEmpname("Nikhil");
		emp.setEmpid("E02");
		emp.setEmpphonenumber("8368531899");
		emp.setEmpgender("Male");
		emp.setEmpsal(2500);
//		emp.printDetails();
		System.out.println("Name | id | Phone number | Gender | Salary");
//		System.out.println(emp.getEmpname() + " | " + emp.getEmpid() + " | " + emp.getEmpphonenumber() + " | " + emp.getEmpgender() + " | " + emp.getEmpsal());
		System.out.println(emp);
	}

}
