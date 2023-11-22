package projday4;

import java.util.InputMismatchException;
import java.util.Scanner;

class DivideException extends Exception{
	private String message;
	
	DivideException(String message){
		this.message=message;
	}
	@Override
	public String getMessage() {
		return this.message;
	}
	
	@Override
	public String toString() {
		return this.message;
	}
}

public class ExceptionHandlingEx {

	public static void main(String[] args) throws DivideException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c= a/b;
			if(c<3) {
				throw new DivideException("This is divideException");
			}
			System.out.println(c);
		}catch(ArithmeticException e) {  // arithmetic exception
			System.out.println(e);
		}catch(InputMismatchException e) {
			System.out.println(e);
		}catch(DivideException e) {
			System.err.println(e.getMessage());
		}finally{
			System.out.println("End of program");
		}
//		int d=a*b;
//		System.out.println(d);
	}

}
