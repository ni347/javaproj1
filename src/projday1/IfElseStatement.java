package projday1;
import java.util.Scanner;


public class IfElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age=sc.nextInt();
		boolean voter_id = true;
		String citizen = "Indian";
		if(age>=18 && voter_id == true && citizen == "Indian") {
			System.out.println("Candidate is eligible for voting");
		}
		else {
			System.out.println("Candidate is not eligible for voting");
		}
	}

}