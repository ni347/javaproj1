package projday6;

@SuppressWarnings("serial")
class TypeException extends Exception{
	@Override
	public String toString() {
		return "Vehicle type Not Set";
	}
}
class Vehicles{
	String type;
	String model_no;
	String model_name;
	String owner;
	String owner_details;
	
	Vehicles() {
		
	}
	
	Vehicles(String model_no, String model_name, String owner, String owner_details){
//		this.type=type;
		this.model_no=model_no;
		this.model_name=model_name;
		this.owner=owner;
		this.owner_details=owner_details;
	}
	
	public String get_type(){
		return this.type;
	}
	
	public String retrieve() {
		return "null";
	}
}

class Car extends Vehicles{
	Car() {
		
	}
	Car(String model_no, String model_name, String owner,String owner_details){
		super(model_no,model_name,owner,owner_details);
	}
	
	public String get_type(){
		return this.type;
	}
	public void set_type(String type) {
		this.type=type;
	}
	
	public String retrieve(){
		try {
			if(type==null) {
				throw new TypeException();
			}
			else {
				return model_no+model_name+owner+owner_details;
			}
		}catch(TypeException e) {
			return e.toString();
		}
	}
}


public class CustomExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Vehicles v = new Vehicles();
		Car c = new Car("2022", "baleno","nick","delhi wala");
		c.get_type();
		System.out.println(c.retrieve());
	}
}
