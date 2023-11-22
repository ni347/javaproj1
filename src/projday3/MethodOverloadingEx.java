package projday3;

public class MethodOverloadingEx {
	
	public int printAdd(int a, int b) {
		return a+b;
	}
	
	public double printAdd(double a, double b) {
		return a+b;
	}
	
	public int printAdd(int a, int b, int c) {
		return a+b+c;
	}
	
	public double printAdd(double a, double b, double c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingEx ob = new MethodOverloadingEx();
		System.out.println(ob.printAdd(1, 2));
		System.out.println(ob.printAdd(2.1, 5.4));
		System.out.println(ob.printAdd(3.4, 5.2, 7.1));
		System.out.println(ob.printAdd(3, 4, 9));
	}

}
