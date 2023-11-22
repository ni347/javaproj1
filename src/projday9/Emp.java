package projday9;

import java.util.Scanner;

abstract class Employe{
	abstract void setSalary(int salary);
	abstract int getSalary();
	abstract void setGrades(String grade);
	abstract String getGrades();
	void label() {
		System.out.println("Employee data:\n");
	}
}

class Engineer extends Employe{
	private int salary;
	private String grade;
	
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return this.salary;
	}
	
	public void setGrades(String grade) {
		this.grade=grade;
	}
	public String getGrades() {
		return this.grade;
	}
}

class Manager extends Employe{
	private int salary;
	private String grade;
	
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return this.salary;
	}
	
	public void setGrades(String grade) {
		this.grade=grade;
	}
	public String getGrades() {
		return this.grade;
	}
}
public class Emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String sub = sc.nextLine();
		int n = Integer.parseInt(sub);
		for(int i=0;i<n;i++) {
			String[] input = sc.nextLine().split(" ");
			if(input[0].equals("ENGINEER")) {
				Engineer e = new Engineer();
				e.setSalary(Integer.parseInt(input[2]));
				e.setGrades(input[1]);
				e.label();
				System.out.println("GRADE :"+e.getGrades());
				System.out.println("SALARY :"+e.getSalary());
			}
			
			if(input[1].equals("MANAGER")) {
				Manager e = new Manager();
				e.setSalary(Integer.parseInt(input[2]));
				e.setGrades(input[1]);
				e.label();
				System.out.println("GRADE :"+e.getGrades());
				System.out.println("SALARY :"+e.getSalary());
			}
		}
		
		
	}

}
