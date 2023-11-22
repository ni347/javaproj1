package projday1;
import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the operands:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		System.out.println("Enter the operator:");
		char op = sc.next().charAt(0);
		switch(op) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
		default:
			System.out.println("Wrong choice");
		}
	}

}
