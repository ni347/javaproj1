package projday2;

class Person {
	private String name;
	private float age;

	public Person(String name, float age) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public float getAge() {
		return this.age;
	}
	public void setAge(float age) {
		this.age=age;
	}
}

public class Account extends Person{
	private long accNum;
	private double initBalance;
	private Person accHolder;
	
	public Account(String name, float age, long accNum, double initBalance) {
		super(name,age);
		this.accNum=accNum;
		this.initBalance=initBalance;
//		this.accHolder=accHolder;
	}
	
	public long getAccNum() {
		return this.accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum=accNum;
	}
	
	public double getInitBalance() {
		return this.initBalance;
	}
	public void setInitBalance(double initBalance) {
		this.initBalance=initBalance;
	}
	
	public void depositAmt(double deposit) {
		initBalance = this.getInitBalance()+deposit;
	}
	
	public void withdrawlAmt(double withdrawl) {
		initBalance = this.getInitBalance()-withdrawl;
	}
	
	public double getBalance() {
		return initBalance;
	}
	
//	public Person getAccHolder() {
//		return this.accHolder;
//	}
//	public void setAccHolder(Person accHolder) {
//		this.accHolder=accHolder;
//	}
	
	public String toString() {
		return ("Name: "+super.getName() + "\nAge: "+super.getAge() + "\nAccNumber: "+this.accNum + "\nInitial Balance: "+this.initBalance);
	}
	
//	public double 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account ob = new Account("Smith",26,123456789,2000.0);
		Account ob1 = new Account("Kathy",26,739573946,3000.0);
		System.out.println(ob);
		System.out.println(ob1);
		ob.depositAmt(2000.0);
		System.out.println(ob.initBalance);
		ob1.withdrawlAmt(2000.0);
		System.out.println(ob1.initBalance);
	}

}
