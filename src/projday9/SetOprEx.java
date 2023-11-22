package projday9;

import java.util.HashSet;
import java.util.Set;

public class SetOprEx {

	public Set<Integer> subtract(Set<Integer> a, Set<Integer> b){
		HashSet<Integer> res = new HashSet<Integer>(a);
		res.removeAll(b);
		return res;
	}
	
	public Set<Integer> union(Set<Integer> a, Set<Integer> b){
		HashSet<Integer> res = new HashSet<Integer>(a);
		res.addAll(b);
		return res;
	}
	
	public Set<Integer> intersection(Set<Integer> a, Set<Integer> b){
		HashSet<Integer> res = new HashSet<Integer>(a);
		res.retainAll(b);
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SetOprEx se = new SetOprEx();
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(5);
		set1.add(6);
		set1.add(7);
		set1.add(8);
		
		HashSet<Integer> set2 = new HashSet<Integer>();
		set2.add(9);
		set2.add(3);
		set2.add(7);
		System.out.println(se.subtract(set1, set2));
		System.out.println(se.union(set1, set2));
		System.out.println(se.intersection(set1, set2));
	}

}
