package projday4;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(14);
		list.add(13);
		list.add(4, 16);
		System.out.println(list.contains(12));
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.addAll(list);
		list1.add(19);
		System.out.println(list.equals(list1));
		//		list.remove(1); //to remove an element form list
//		Iterator<Integer> itr = list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}

		for(Integer i:list1) {
			System.out.println(i);
		}
	}

}
