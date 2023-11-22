package projday5;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
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
		System.out.println();
		HashSet<Integer> hs1 = new HashSet<Integer>();
		hs1.add(23);
		hs1.add(32);
		hs1.add(90);
		hs1.add(29);
		hs1.add(null);
		hs1.add(null);
		hs1.add(null);
		for(Integer i:hs) {
			System.out.println(i);
		}
	}

}
