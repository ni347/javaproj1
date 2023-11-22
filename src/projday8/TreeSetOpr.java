package projday8;

import java.util.*;

public class TreeSetOpr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> set=new TreeSet<Integer>();  
		set.add(45);  
		set.add(24);  
		set.add(75);  
		set.add(132);  
		//traversing elements  
		Iterator<Integer> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}

}
