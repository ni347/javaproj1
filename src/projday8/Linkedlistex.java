package projday8;

import java.util.*;

public class Linkedlistex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> al=new LinkedList<String>();  
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay");  
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}

}
