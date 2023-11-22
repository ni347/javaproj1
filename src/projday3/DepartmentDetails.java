package projday3;

abstract class Employee{
	private String name;
	private String id;
	private int age;
	private int salary;
	private String gender;
	
	Employee(String name, String id, int age,int salary, String gender){
		this.name=name;
		this.id=id;
		this.age=age;
		this.salary=salary;
		this.gender=gender;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id=id;
	}
	
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getSalary() {
		return this.salary;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	
	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	
//	abstract void calAge();
	
	abstract void empDetails();
}

public class DepartmentDetails extends Employee{
	private String deptName;
	private String compName;
	
	DepartmentDetails(String name, String id, int age,int salary, String gender, String deptName, String compName){
		super(name,id,age,salary,gender);
		this.deptName=deptName;
		this.compName=compName;
	}
	public String getDeptName() {
		return this.deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName=deptName;
	}
	
	public String getCompName() {
		return this.compName;
	}
	public void setCompName(String compName) {
		this.compName=compName;
	}
	
//	public void calAge() {
//		int a=0;
//		int a = 
//	}
	
	public void empDetails() {
		System.out.println("Name: "+super.getName()+"\nID: "+super.getId()+"\nAge: "+super.getAge()+"\nSalary: "+super.getSalary()+"\nGender: "+super.getGender()+"\nDeptName: "+this.deptName+"\nCompName: "+this.compName);
	}

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		DepartmentDetails dt = new DepartmentDetails("Nikhil","E01",24,25000,"Male","Testing","Capgemini");
		dt.empDetails();
	}

}
