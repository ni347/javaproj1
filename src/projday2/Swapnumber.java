package projday2;
import java.util.*;

public class Swapnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=16,b=24;
		System.out.print("a="+a);
		System.out.println("b="+b);
		
		a=a+b; // a=16+24=40
		b=a-b; // b=40-24=16
		a=a-b; // a=40-16=24
		
		System.out.print("a="+a);
		System.out.print("b="+b);
		
	}

}
