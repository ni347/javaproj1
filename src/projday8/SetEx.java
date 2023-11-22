package projday8;

import java.util.ArrayList;
//import java.util.Scanner;
import java.util.*;

public class SetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

////		Scanner sc = new Scanner(System.in);
//		int []arr = new int[5];
//		for(int)
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(20);
		
		Set<Integer> set = new HashSet<Integer>();
		set.addAll(list);
		System.out.println(set);
		System.out.println(set.size());
	}

}
