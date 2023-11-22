package projday3;

public class ConstructorOverloadingEx {
	
	ConstructorOverloadingEx(int a, int b){
		System.out.println(a+b);
	}
	
	ConstructorOverloadingEx(int a, int b, int c){
		System.out.println(a+b+c);
	}
	
	ConstructorOverloadingEx(int a, double b){
		System.out.println(a+b);
	}
	
	ConstructorOverloadingEx(double a, int b){
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloadingEx ob = new ConstructorOverloadingEx(10,20,30);
		ConstructorOverloadingEx ob1 = new ConstructorOverloadingEx(10,20);
		ConstructorOverloadingEx ob2 = new ConstructorOverloadingEx(10,20.5);
		ConstructorOverloadingEx ob3 = new ConstructorOverloadingEx(10.9,20);
	}

}
