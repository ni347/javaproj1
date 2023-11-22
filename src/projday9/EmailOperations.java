package projday9;

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//import java.util.*;
import java.util.regex.*;

class Header{
	String from,to;
	
	public Header(String from, String to) {
		this.from=from;
		this.to=to;
	}
}

class Email{
	Header header;
	String body,greetings;
	
	public Email(Header header, String body, String greetings) {
		this.header=header;
		this.body=body;
		this.greetings=greetings;
	}
}

public class EmailOperations {
	
	public int emailVerify(Email e) {
		int count=0;
		Pattern p = Pattern.compile("^[a-zA-Z_]+@{1}[a-zA-Z]+\\.[a-zA-Z]{2,}$");
		Matcher m = p.matcher(e.header.from);
		Matcher m1 = p.matcher(e.header.to);
		if(m.matches()) {
			count = count+1;
		}
		if(m1.matches()) {
			count = count+1;
		}
		return count;
	}
	
	public String bodyEncryption(Email e) {
		StringBuffer res = new StringBuffer();
		String text=e.body;
		int s=3;
		for(int i=0;i<text.length();i++) {
			if(Character.isWhitespace(text.charAt(i))) {
				res.append(text.charAt(i));
				continue;
			}
			if(Character.isUpperCase(text.charAt(i))) {
				char ch = (char)(((int)text.charAt(i) + s - 65)%26 + 65);
				res.append(ch);
				continue;
			}
			if(Character.isLowerCase(text.charAt(i))) {
				char ch = (char)(((int)text.charAt(i) + s - 97)%26 + 97);
				res.append(ch);
				continue;
			}	
		}
		return res.toString();
	}
	
	public String greetingMessage(Email e) {
		String str = e.header.from;
		String name = str.substring(0,str.indexOf('@'));
		String msg = e.greetings + " " + name;
		return msg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmailOperations eo = new EmailOperations();
		Header h = new Header("amit@doselect.com","_ami@doselect.in");
		Email email = new Email(h,"abc def","Regards");
		
		System.out.println(eo.emailVerify(email));
		System.out.println(eo.bodyEncryption(email));
		System.out.println(eo.greetingMessage(email));		
	}
}