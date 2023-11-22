package projday3;

interface A{
	public void printDetailsA();
	default void printDetails1() {
		System.out.println("This is the default method.");
	}
}

interface B{
	public void printDetailsB();
}

class C{
	public void display() {
		System.out.println("This is a method of class C");
	}
}

public class InterfaceExample extends C implements A,B {
	public void printDetailsA() {
		System.out.println("This is the abstract methood of A");
	}
	public void printDetailsB() {
		System.out.println("This is the abstract method of B");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample obj  = new InterfaceExample();
		obj.printDetailsA();
		obj.printDetails1();
		obj.printDetailsB();
		obj.display();
	}

}
