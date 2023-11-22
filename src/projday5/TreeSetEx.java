package projday5;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> tr = new TreeSet<Integer>();
		tr.add(4);
		tr.add(2);
		tr.add(9);
		tr.add(1);
		tr.add(8);
		tr.add(10);
		tr.add(11);
		tr.add(6);
		tr.add(5);
		NavigableSet<Integer> n = tr.descendingSet();
		TreeSet<Integer> ts1 = (TreeSet<Integer>) tr.descendingSet();
		
		for(Integer i:ts1) {
			System.out.println(i);
		}
	}

}
