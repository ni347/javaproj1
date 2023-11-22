package projday6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Header{
	String from;
	String to;
	
	Header(String from, String to){
		this.from=from;
		this.to=to;
	}
	
}

class Email{
	Header header;
	String body;
	String greetings;
	
	Email(Header header, String body, String greetings){
		this.header=header;
		this.body=body;
		this.greetings=greetings;
	}
}
class EmailOprEx {

	int count=0;
	public int emailVerify(Email e) {
		
		Pattern p = Pattern.compile("^[a-zA-Z_]+@{1}[a-zA-Z]+\\.[a-zA-Z]{2,}$");
		Matcher m = p.matcher(e.header.from);
		Matcher m1 = p.matcher(e.header.to);
		if(m.matches()) {
			count++;
		}if(m1.matches()) {
			count++;
		}
		return count;
			
	}
	
	public String bodyEncryption(Email e) {
		StringBuffer result = new StringBuffer();
		String text = e.body;
		int s = 3;
		for (int i=0; i<text.length(); i++) {
			if(Character.isWhitespace(text.charAt(i))) {
				result.append(text.charAt(i));
				continue;
			}
			if(Character.isUpperCase(text.charAt(i))) {
				char ch = (char)(((int)text.charAt(i) + s - 65) % 26 + 65);
				result.append(ch);
			}
			else {
				char ch = (char)(((int)text.charAt(i) + s - 97) % 26 + 97);
				result.append(ch);
			}
		}
		return result.toString();
		
	}
	
	public String greetingMessage(Email e) {
		String str = e.header.from;
		String name = str.substring(0,str.indexOf("@"));
		String msg = e.greetings + " " + name;
		return msg;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmailOprEx ex = new EmailOprEx();
		Header h = new Header("amit@doselect.com","_ami@doselect.in");
		Email email = new Email(h,"Thank you","Best Regards");
		System.out.println(ex.emailVerify(email));
		System.out.println(ex.bodyEncryption(email));
		System.out.println(ex.greetingMessage(email));
	}

}
