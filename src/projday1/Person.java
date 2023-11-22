package projday1;

public class Person {
	private String firstname;
	private String lastname;
	private String phonenumber;
	private char gender;

	public Person(String firstname, String lastname,String phonenumber, char gender) {
		// TODO Auto-generated constructor stub
		this.firstname=firstname;
		this.lastname=lastname;
		this.phonenumber=phonenumber;
		this.gender=gender;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname=firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname=lastname;
	}
	
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber=phonenumber;
	}
	
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	
	public void printDetails() {
		System.out.println("First Name: "+this.firstname);
		System.out.println("Last Name: "+this.lastname);
		System.out.println("Phone number: "+this.phonenumber);
		System.out.println("Gender: "+this.gender);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person ob = new Person("Nikhil","Vats","8368531899",'M');
		ob.printDetails();
	}

}
