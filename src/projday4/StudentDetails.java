package projday4;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;


class Student{
	private String name;
	private int roll;
	private double eng;
	private double hindi;
	private double maths;
	private double science;
	private double comp;

Student(String name, int roll, double eng, double hindi, double maths, double science, double comp){
	this.name=name;
	this.roll=roll;
	this.eng=eng;
	this.hindi=hindi;
	this.maths=maths;
	this.science=science;
	this.comp=comp;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}

public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll=roll;
}

public double getEng() {
	return eng;
}
public void setEng(double eng) {
	this.eng=eng;
}

public double getHindi() {
	return hindi;
}
public void setHindi(double hindi) {
	this.hindi=hindi;
}

public double getMaths() {
	return maths;
}
public void setMaths(double maths) {
	this.maths=maths;
}

public double getScience() {
	return science;
}
public void setScience(double science) {
	this.science=science;
}

public double getComp() {
	return comp;
}
public void setComp(double comp) {
	this.comp=comp;
}
}
class PercentageCalculator extends Student{
	double per;
	PercentageCalculator(String name, int roll,double eng, double hindi,double maths, double science, double comp){
		super(name,roll,eng,hindi,maths,science,comp);
		per = this.calPercent(eng, hindi, maths, science, comp);
	}
	public double calPercent(double eng, double hindi,double maths, double science, double comp){

		return (eng + hindi + maths + science + comp)/500*100;
	}
	
	public String toString() {
		return ("Enter name: "+super.getName()+"\nEnter roll: "+super.getRoll()+"\nPercent: "+this.per);
	}
	
	
}

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StudentDetails st[] = new StudentDetails();
		Scanner sc = new Scanner(System.in);
		LinkedList<PercentageCalculator> list = new LinkedList<PercentageCalculator>();
		for(int i=0;i<2;i++) {
			System.out.println("Details of Student"+(i+1)+": ");
			System.out.println("Enter name: ");
			String name = sc.next();
			System.out.println("Enter roll: ");
			int roll = sc.nextInt();
			System.out.println("Enter English marks");
			double eng = sc.nextDouble();
			System.out.println("Enter Hindi marks");
			double hindi = sc.nextDouble();
			System.out.println("Enter Maths marks");
			double maths = sc.nextDouble();
			System.out.println("Enter Science marks");
			double science = sc.nextDouble();
			System.out.println("Enter Computer marks");
			double comp = sc.nextDouble();
			list.add(new PercentageCalculator(name,roll,eng,hindi,maths,science,comp));
			
		}
		LinkedList<Double> percentage = new LinkedList<Double>();
		for(PercentageCalculator p:list) {
			percentage.add(p.per);
			percentage.add(p.per);
		}
		

	}

}
