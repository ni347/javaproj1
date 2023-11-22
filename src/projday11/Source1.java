package projday11;

class Speed{
	String speed;
}

class SpeedImplementation{
	public String setSpeed(Speed s, int spd) {
		try {
			if(spd<30||spd>90) {
				throw new SpeedInvalidException("SpeedInvalidException");
			}
			else {
				s.speed="Valid Speed";
			}
		}
			catch(SpeedInvalidException e) {
				s.speed="Invalid Speed";
				return e.getMessage();
			}
			return s.speed;
		}
	}

class SpeedInvalidException extends Exception{
	public SpeedInvalidException(String s) {
		super(s);
	}
}

public class Source1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Speed s1 = new Speed();
//		SpeedImplementation si = new SpeedImplementation();
//		
//		System.out.println(si.setSpeed(s1, 20));
////		System.out.println(s1.speed);
	}

}
