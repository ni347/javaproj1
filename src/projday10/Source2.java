package projday10;

import java.util.Map;
import java.util.TreeMap;

public class Source2 {
	
	public TreeMap<String,String> data;
	
	public Source2() {
		data=new TreeMap<>();
	}
	
	public String getNumber(String name) {
		return data.get(name);
	}
	
	public boolean getName(String number) {
		for(Map.Entry<String, String> m: data.entrySet()) {
			if(m.getValue().equals(number)) {
				return true;
			}
		}
		return false;
	}
	
	public String putNumber(String name, String number) {
		try {
			if(name!=null&&number!=null) {
				data.put(name, number);
				return "True";
			}else {
				throw new IllegalArgumentException("Name or Number:Null Exception");
			}
		}catch(IllegalArgumentException e) {
			return e.getMessage();
			
		}

	}
	
	public TreeMap<String,String> print(){
		return data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Source2 dir = new Source2();
		
		System.out.println(dir.putNumber("A1", "1111"));
		System.out.println(dir.putNumber("A2", "2222"));
		System.out.println(dir.putNumber("A3", "3333"));


		
		System.out.println(dir.print());
		
		System.out.println(dir.getNumber("A1"));
		System.out.println(dir.getNumber("A2"));
		System.out.println(dir.getNumber("A3"));

	}

}
