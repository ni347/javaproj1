package projday4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import projday5.e;

public class RegexExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// to create a gmail pattern
//		Pattern p = Pattern.compile("^[a-zA-Z0-9]+[0-9]{2,}@gmail.com$");
//		Matcher m = p.matcher("absc12345@gmail.com");
//		System.out.println(m.matches());
		
//		to create a name pattern
//		Pattern p = Pattern.compile("^[a-zA-Z]+\s[a-zA-Z'-]+[a-zA-Z]+$");
//		Matcher m = p.matcher("Giselle Dawn-Wright");
//		Matcher m1 = p.matcher("Deniel D'Cruz");
//		System.out.println(m.matches());
//		int count=0;
//		if(m1.matches()) {
//			count++;
//		}
//		Scanner sc = new Scanner(System.in);
		//String IP = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
//		String IP = .s;
//		String reg = IP + "\\."+ IP + "\\." + IP + "\\." + IP;
//	    Pattern pattern = Pattern.compile("^[a-zA-Z_]+@doselect.com|@doselect.in$");
//	    Matcher m = pattern.matcher("_Absc@doselect.com");
	     
//		for(String s:str1) {
//			System.out.println(s);
//		}
//		int count=0;
//		Pattern p = Pattern.compile("^[a-zA-Z_]+@{1}[a-zA-Z]+\\.[a-zA-Z]{2,}$");
//		Matcher m = p.matcher("amit@doselect.com");
//		Matcher m1 = p.matcher("_ami@doselect.in");
//		if(m.matches()) {
//			count++;
//		}if(m1.matches()) {
//			count++;
//		}
////		return count;
//		System.out.println(count);
//
//		System.out.println(m.matches());
//		System.out.println(m1.matches());
		
		int count=0;
		Pattern p = Pattern.compile("^[a-zA-Z-']+\s{1}[a-zA-Z-']+$");
		Matcher m = p.matcher("Daniel D'Cruz");
		Matcher m1 = p.matcher("Giselle Dawn-Wright");
		if(m.matches()&&m1.matches()) {
			count+=count+1;
		}if(m.matches()|| m1.matches()) {
			count+=count+1;
		}else {
			count=0;
		}
		System.out.println(count);
		
	}

}

//"amit@doselect.com"
//"_ami@doselect.in"