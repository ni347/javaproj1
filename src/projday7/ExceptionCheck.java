package projday7;

class Age{
	String drink;
	String vote;
	String movie;
}

class IllegalAgeException extends Exception{
	public IllegalAgeException(String s) {
		super(s);
	}
}

public class ExceptionCheck {

	public String drinkingCheck(Age a, int age) {
		try {
			if(age<21) {
				a.drink="Illegal";
				throw new IllegalAgeException("Illegal drinking age");
				
			}else {
				a.drink="Illegal";
				return a.drink;
			}
		}
		catch(IllegalAgeException e){
	    return e.getMessage();
		}
		
		
	}
	
	
	
    public String  votingCheck(Age a, int age) {
    	try {
			if(age<18) {
				a.vote="Illegal";
				throw new IllegalAgeException("Illegal voting age");
			}
			else {
				a.vote="legal";
				return a.vote;
			}
			
		}
		catch(IllegalAgeException e){
		    return e.getMessage();
		}
	}
	
    public String  movieCheck(Age a, int age) {
		try {
			if(age<14) {
				a.movie="Illegal";
				throw new IllegalAgeException("Illegal movie age");
			}
			else {
				a.movie="legal";
				return a.movie;
			}
			
		}
		catch(IllegalAgeException e){
		    return e.getMessage();
		}
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Age a = new Age();
		ExceptionCheck ex = new ExceptionCheck();
		System.out.println(ex.drinkingCheck(a, 19));
		System.out.println(ex.votingCheck(a, 15));
		System.out.println(ex.movieCheck(a, 15));
	}

}
