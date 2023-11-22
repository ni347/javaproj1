
package projday6;

import java.util.HashSet;

public class SetOperationEx {

	public HashSet<Integer> substract(HashSet<Integer> a, HashSet<Integer> b){
		HashSet<Integer> se = new HashSet<Integer>(a);
		se.removeAll(b);
		return se;
	}
	
	public HashSet<Integer> union(HashSet<Integer> a, HashSet<Integer> b){
		HashSet<Integer> se2 = new HashSet<Integer>(a);
		se2.addAll(b);
		return se2;
	}
	
	public HashSet<Integer> intersection(HashSet<Integer> a, HashSet<Integer> b){
		HashSet<Integer> se = new HashSet<Integer>(a);
		se.retainAll(b);
		return se;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SetOperationEx ex = new SetOperationEx();
		HashSet<Integer> se = new HashSet<Integer>();
		
		se.add(5);
		se.add(6);
		se.add(7);
		se.add(8);
		HashSet<Integer> se1 = new HashSet<Integer>();
		se1.add(9);
		se1.add(3);
		se1.add(7);
//		
		System.out.println(ex.substract(se, se1));
		System.out.println(ex.union(se, se1));
		System.out.println(ex.intersection(se, se1));
	}

}
