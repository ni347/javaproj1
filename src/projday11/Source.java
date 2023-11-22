package projday11;

import java.util.Map;
import java.util.TreeMap;

public class Source {
	
	private static TreeMap<String,String> data;
	public Source() {
		data=new TreeMap<String,String>();
	}
	
	public String getNumber(String name) {
		if(data.containsKey(name)) {
			return data.get(name);
		}
		else {
			return null;
		}
	}
	
	public boolean getName(String number) {
		if(data.containsKey(number)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String putNumber(String name,String number) {
		try {
			if(name==null||number==null) {
				throw new IllegalArgumentException("Name or Number: NULL Exception");
			}
			else {
				data.put(name, number);
				return "True";
			}
		}catch(IllegalArgumentException e) {
			return e.getMessage();
		}
//		return number;
	}
	
	public TreeMap<String,String> print(){
		for(Map.Entry<String,String> entry: data.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+"=>"+value);
		}
		return data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Source sc = new Source();
System.out.println(sc.putNumber("A1", "1111"));
System.out.println(sc.putNumber("A2", "2222"));
System.out.println(sc.putNumber("A3", "3333"));
System.out.println(sc.print());
System.out.println(sc.getNumber("A1"));
System.out.println(sc.getNumber("A2"));
System.out.println(sc.getNumber("A3"));
//System.out.println();
		
	}

}
