import java.util.ArrayList;
import java.util.List;

public class projdatastrday1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		ArrayList<Integer> li = new ArrayList<Integer>();
		
		for(i=1;i<=50;i++) {
			if(i%3==0 || i%5==0) {
				li.add(i);
			}
		}
		System.out.println(li);
		System.out.println(li.size());
		ArrayList<Integer> li1 = new ArrayList<Integer>();
		ArrayList<Integer> li2 = new ArrayList<Integer>();
		if(li.size()>20) {
			li1.addAll(li.subList(0, 15));
		}
		li2.addAll(li.subList(15, 23));
		
		System.out.println(li1);
		
		System.out.println(li2);
	}

}