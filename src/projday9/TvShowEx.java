package projday9;

import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

public class TvShowEx {
	
	public String printIndex(ArrayList<String> list, int ind) {
		return list.get(ind);
	}
	
	public ArrayList<String> addAfter(ArrayList<String> a, String m, String n){
//		ArrayList<String> res = new ArrayList<String>();
		int i = a.indexOf(m)+1;
		a.add(i, n);
		return a;
	}
	
	public ArrayList<String> pickIndexAndAppend(ArrayList<String> p,int ind){
//		ArrayList<String> res = new ArrayList<String>();
		String s = p.remove(ind);
		p.add(s);
		return p;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Scanner sc = new Scanner(System.in);
		ArrayList<String> li = new ArrayList<String>();
		
//		String li1 = sc.nextLine();
//		String li2 = sc.nextLine();
//		String li3 = sc.nextLine();
//		String li4 = sc.nextLine();
//		
		li.add("Breaking Bad");
		li.add("Young Sheldon");
		li.add("Friends");
		li.add("Stranger Things");
		
//		li.add(li1);
//		li.add(li2);
//		li.add(li3);
//		li.add(li4);
		
//		String n = "Sherlock";
		
		TvShowEx ex = new TvShowEx();
		System.out.println(ex.printIndex(li, 2));
		System.out.println(ex.addAfter(li, "Friends", "Sherlock"));
		System.out.println(ex.pickIndexAndAppend(li, 2));

	}
}