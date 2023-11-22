package projday5;

import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> list = new PriorityQueue<Integer>();
		list.add(12);
		list.add(13);
		list.add(15);
		list.add(16);
//		list.add(null;)  // null not allowed
//		list.remove(); //to remove an element from list 
		list.poll(); // to remove an element
		System.out.println(list); // peek() is used to print first element

	}

}
