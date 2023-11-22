package projday5;

import java.util.ArrayList;

public class Source {

	public String printIndex(ArrayList<String> list,int ind) {
		String str="";
		if(ind>0 && ind<list.size()) {
			str=list.get(2); 
		}
		return str;
	}
	
	public ArrayList<String> addAfter(ArrayList<String> a,String m,String n){
		n = "Binna"; 
//		String m1;
		m = a.get(1);
		a.add(2, n);
		 return a;
	}
	
	public ArrayList<String> pickIndexAndAppend(ArrayList<String> p,int ind){
		String s=p.get(ind);
		p.remove(ind);
		p.add(s);
		return p;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Source sc = new Source();
		ArrayList<String> list = new ArrayList<String>();
		list.add("Nikhil");
		list.add("Nitish");
		list.add("Abhinav");
		list.add("Akhil");
		list.add("Sumeet");
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Nick");
		a.add("Nitin");
		a.add("Abhi");
		a.add("Priya");
		a.add("Preeti");
		
		ArrayList<String> p = new ArrayList<String>();
		p.add("Breaking Bad");
		p.add("Young Sheldon");
		p.add("Friends");
		p.add("Shrelock");
		p.add("Stranger Things");
		System.out.println(sc.printIndex(list, 2));
		System.out.println(sc.addAfter(a, "Nitin", "Binna"));
		System.out.println(sc.pickIndexAndAppend(p, 2));
		
//		System.out.println(list.contains("Nikhil"));
		
	}

}
