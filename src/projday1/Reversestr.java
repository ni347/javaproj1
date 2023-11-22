package projday1;
import java.util.*;

public class Reversestr {
	public String stringRev(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
	return rev;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reversestr sr = new Reversestr();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String rev = sr.stringRev(str);
		System.out.println(rev);
	}

}
