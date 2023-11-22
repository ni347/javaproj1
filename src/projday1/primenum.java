package projday1;
import java.util.Scanner;

public class primenum {
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i< n;i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(isPrime(n)) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
	}
}
