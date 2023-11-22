package projday5;

import java.util.ArrayDeque;

public class ArrayDequeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayDeque<Integer> list = new ArrayDeque<Integer>();
		list.add(12);
		list.add(13);
		list.add(15);
		list.add(16);
		list.addFirst(11);
		list.addLast(20);
		for(Integer i:list) {
			System.out.println(i); 
		}
		System.out.println();
		list.removeFirst();
		list.removeLast();
		for(Integer i:list) {
			System.out.println(i); 
		}
	}

}
