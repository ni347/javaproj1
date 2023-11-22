package projday3;

abstract class Student{
	private String name;
	private int roll;
	
	Student(String name, int roll){
		this.name=name;
		this.roll=roll;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setRoll(int roll) {
		this.roll=roll;
	}
	public int getRoll() {
		return this.roll;
	}
	
	abstract void printStuDetails();
}

public class StrdentDetailsUsingAbstract extends Student{
	StrdentDetailsUsingAbstract(String name, int roll){
		super(name,roll);
	}
	
	public void printStuDetails() {
		System.out.println("Name: "+super.getName()+"\nRoll: "+super.getRoll());
	}
	
	public static void main(String[] args) {
		StrdentDetailsUsingAbstract ob = new StrdentDetailsUsingAbstract("Nick",101);
		ob.printStuDetails();
	}

}
