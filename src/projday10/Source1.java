package projday10;

class Speed{
	String speed;
}
class SpeedImplementataion{
	public String setSpeed(Speed s, int spd) {
		try {
			if(spd<30||spd>90) {
				throw new SpeedInvalidException("SpeedInvalidException");
			}
			else {
				s.speed="Valid Speed";
			}
		}catch(SpeedInvalidException e) {
//			s.speed = "Invalid Speed";
			return e.getMessage();
		}
		return s.speed;
	}
}
@SuppressWarnings("serial")
class SpeedInvalidException extends Exception{
	public SpeedInvalidException(String msg) {
		super(msg);
	}
}

public class Source1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Speed s = new Speed();
		SpeedImplementataion imp = new SpeedImplementataion();
		System.out.println(imp.setSpeed(s, 25));
		System.out.println(s.speed);
	}

}
