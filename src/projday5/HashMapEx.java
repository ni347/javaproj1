package projday5;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("Nikhil1", "Vats");
		hm.put("Nikhil", "Kumar");
		hm.put("Riya", "Sharma");
		hm.remove("Riya");
		
		for(Entry<String,String> m:hm.entrySet()) {
			System.out.println(m.getKey()+": "+m.getValue());
		}
		System.out.println(hm);
	}

}
