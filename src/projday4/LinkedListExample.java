package projday4;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<>();
		list.add(12);
		list.add(14);
		list.add(13);
		list.addFirst(11);
		list.addLast(20);
		list.set(1, 16);
		list.add(21);
//		list.remove(3);
		System.out.println(list.contains(12));
		
		for(Integer i:list) {
			System.out.println(i);
		}

	}

}
