package projday9; 

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;

import java.util.*;


public class StringPos {

	public List<List<Integer>> printPosition(String k){
		List<List<Integer>> li = new ArrayList<>();
		for(int i=0,j=0;i<k.length();i=j) {
			while(j<k.length()&&k.charAt(i)==k.charAt(j)) {
				j++;
			}
			if(j-1>=3) {
				List<Integer> group = Arrays.asList(i,j-1);
				li.add(group);
			}
		}
		return li;
	}
	
	public ArrayList<String> addAfter(ArrayList<String> a, String m, String n){
		ArrayList<String> res = new ArrayList<>();
		for(String str:a) {
			res.add(str);
		
		if(str.equals(m)) {
			res.add(n);
		}
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringPos sp = new StringPos();
		
		System.out.println(sp.printPosition("mousssssseeee"));
		ArrayList<String> a = new ArrayList<>();
		a.add("ad");
		a.add("cc");
		a.add("df");
		a.add("az");
		String m = "cc",n="kc";
		System.out.println(sp.addAfter(a, m, n));
	}

}
