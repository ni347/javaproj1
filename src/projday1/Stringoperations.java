package projday1;
import java.util.*;

public class Stringoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome to Capgemini";
		String str1 = " Hyderabad!";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice:");
		int i = sc.nextInt();
		
		
		switch(i) {
		case 1:
			System.out.println(str.toUpperCase());
			break;
			
		case 2:
			System.out.println(str.toLowerCase());
			break;
			
		case 3:
			System.out.println(str1.trim());
			break;
		
		case 4:
			System.out.println(str.substring(11, 20));
			break;
		
		case 5:
			System.out.println(str.charAt(11));
			break;
			
		case 6:
			System.out.println(str.length());
			break;
		
		case 7:
			System.out.println(str.replace("Capgemini", "Hyderabad"));
			break;
			
		case 8:
			System.out.println(str.indexOf("C",11));
			break;
			
		case 9:
			System.out.println(str.concat(str1));
			break;
			
		default:
			System.out.println("Wrong choice");
			break;
		}

	}

}
