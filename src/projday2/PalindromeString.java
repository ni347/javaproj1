package projday2;

import java.util.Scanner;

import projday1.Reversestr;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("String:");
		String str = sc.next();
		Reversestr sr = new Reversestr();
		String rev = sr.stringRev(str);
		System.out.println("reverse:"+rev);
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
