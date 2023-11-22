package projday9;

@SuppressWarnings("serial")
class TypeException extends Exception{
	@Override
	public String toString() {
		return "Vehicle Type Not Set";
	}
}

class Vehicles{
	String type, model_no, model_name, owner_name, owner_details;
	
    Vehicles() {
		
	}
	
	Vehicles(String model_no, String model_name, String owner_name, String owner_details) {
//		this.type=type;
		this.model_no=model_no;
		this.model_name=model_name;
		this.owner_name=owner_name;
		this.owner_details=owner_details;
	}
	
	
	
	public String get_type() {
		return type;
	}
	
	public String retrieve() {
		return "null";
	}
}

class Car extends Vehicles{
	
    Car() {
		
	}

	Car(String model_no, String model_name, String owner_name, String owner_details) {
		super(model_no, model_name, owner_name, owner_details);
	}
	
	public void set_type(String type) {
		this.type=type;
	}
	
	public String get_type() {
		return type;
	}
	
	@Override
	public String retrieve() {
		try {
			if(type==null) {
				throw new TypeException();
			}
			else {
				return model_no + model_name + owner_name + owner_details;
			}
		}catch(TypeException e) {
			return e.toString();
		}
	}
}

public class CustomExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c = new Car("2022", "baleno","nick","delhi wala");
//		Vehicles v = new Vehicles();
		c.get_type();
		System.out.println(c.retrieve());
	}

}
