package projday5;

import java.util.Collections;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String,String> hm = new TreeMap<String,String>(Collections.reverseOrder());
		hm.put("Nikhil", "Male");
		hm.put("Akhil", "Male");
		hm.put("Riya", "Female");
		
		
		for(Entry<String,String> m:hm.entrySet()) {
			System.out.println(m.getKey()+": "+m.getValue());
		}
	}

}
