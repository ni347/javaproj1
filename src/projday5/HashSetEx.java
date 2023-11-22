package projday5;

import java.util.HashSet;
import java.util.Hashtable;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(23);
		hs.add(32);
		hs.add(90);
		hs.add(29);
		hs.add(null);
		hs.add(null);
		hs.add(null);
		for(Integer i:hs) {
			System.out.println(i);
		}
		Hashtable ht = new Hashtable();
		ht.put("kk", 12);
		ht.put("gg", 13);
		for(Integer i:hs) {
			System.out.println(i);
		}
	}

}
