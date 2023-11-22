package projday5;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<String,String> hm = new LinkedHashMap<String,String>();
		hm.put("Nikhil1", "Vats");
		hm.put("Nikhil", "Kumar");
		hm.put("Riya", "Sharma");
		hm.remove("Riya");
		
		for(Entry<String,String> m:hm.entrySet()) {
			System.out.println(m.getKey()+": "+m.getValue());
		}
		
	}

}
