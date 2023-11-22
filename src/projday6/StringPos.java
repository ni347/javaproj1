package projday6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringPos {
	
	public List<List<Integer>> printPostition(String k) {
		List<List<Integer>> li = new ArrayList<>();
		for(int i=0,j=0;i<k.length();i=j) {
			while(j<k.length()&&k.charAt(j)==k.charAt(i)) {
				j++;
			}
			if(j-1>=3) {
				List<Integer> group = Arrays.asList(i,j-1);
				li.add(group);
			}
		}
		return li;
	}
	
	public ArrayList<String> addAfter(ArrayList<String> a,String m, String n){
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
		StringPos pos = new StringPos();
		String str="mousssssseeee";
		
		List<List<Integer>> r = new ArrayList<>();
		r = pos.printPostition(str);
		System.out.println(r);
		ArrayList<String> r1 = new ArrayList<>();
		r1.add("ad");
		r1.add("cc");
		r1.add("df");
		r1.add("ez");
		System.out.println(pos.addAfter(r1, "cc", "ni"));
	}

}
