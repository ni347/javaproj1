package projday9;

class Age {
	
	String drink, vote, movie;
}

@SuppressWarnings("serial")
class IllegalAgeException extends Exception{
	public IllegalAgeException(String s) {
		super(s);
	}
}

public class ExceptionCheck{
	
	public String drinkingCheck(Age a, int age) {
		try {
			if(age<21) {
				a.drink="Illegal";
				throw new IllegalAgeException("Illegal age for drinking");
			}
			else {
				a.drink="Legal";
				return a.drink;
			}
		}catch(IllegalAgeException e) {
			return e.getMessage();
		}
	}
	
	public String votingCheck(Age a, int age) {
		try {
			if(age<18) {
				a.vote="Illegal";
				throw new IllegalAgeException("Illegal age for voting");
			}
			else {
				a.vote="Legal";
				return a.vote;
			}
		}catch(IllegalAgeException e) {
			return e.getMessage();
		}
	}
	
	public String movieCheck(Age a, int age) {
		try {
			if(age<14) {
				a.movie="Illegal";
				throw new IllegalAgeException("Illegal age for movie");
			}
			else {
				a.movie="Legal";
				return a.movie;
			}
		}catch(IllegalAgeException e) {
			return e.getMessage();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Age a = new Age();
		ExceptionCheck ec = new ExceptionCheck();
		System.out.println(ec.drinkingCheck(a, 15));
		System.out.println(ec.votingCheck(a, 15));
		System.out.println(ec.movieCheck(a, 15));
	}

}
