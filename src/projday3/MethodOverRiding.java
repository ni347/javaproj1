package projday3;

class Parent{
	public void printDetails() {
		System.out.println("Parent method");
	}
}

public class MethodOverRiding extends Parent{
	@Override // Annotation used to provide addition info about following methods.
	public void printDetails() {
		System.out.println("Child method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverRiding mo = new MethodOverRiding();
		mo.printDetails();
	}

}
