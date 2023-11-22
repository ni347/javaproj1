package projday7;

import java.util.ArrayList;

public class ArrListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(48);
		list.add(58);
		list.add(12);
		list.add(67);
		list.add(45);
		System.out.println("Before remove: ");
		for(Integer i:list) {
			System.out.println(i);
		}
		list.remove(2);
		System.out.println("After remove: ");
		for(Integer i:list) {
			
			System.out.println(i);
		}
		System.out.println(list.contains(48));
		System.out.println(list.size());
	}

}
