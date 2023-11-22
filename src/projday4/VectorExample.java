package projday4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> list = new Vector<Integer>();
		list.add(12);
		list.add(14);
		list.add(13);
		list.set(1, 16);
		System.out.println(list.contains(12));
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("\nUsing Enumeration");
		Enumeration<Integer>=list.elements();

		for(Integer i:list1) {
			System.out.println(i);
		}
	}

}
