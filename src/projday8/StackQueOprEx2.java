package projday8;

import java.util.*;

public class StackQueOprEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> s1 = new Stack<Integer>();
		s1.push(34);
		s1.push(65);
		s1.push(54);
		s1.push(23);
		s1.push(0);
		s1.push(87);
		s1.push(55);
		
		Stack<Integer> s2 = new Stack<Integer>();
		s2.push(56);
		s2.push(63);
		s2.push(32);
		s2.push(0);
		s2.push(75);
		s2.push(0);
		s2.push(12);
		Stack<Integer> s3 = new Stack<Integer>();
		s3.push(21);
		s3.push(90);
		s3.push(0);
		s3.push(52);
		s3.push(0);
		s3.push(43);
		s3.push(0);
//		s3.push(1);
		
		Queue<Integer> que = new PriorityQueue<Integer>();
//		Queue<Integer> que1 = new PriorityQueue<Integer>();
		int count=0;
		
		for(int i=0;i<s1.size();i++) {
			if(s1.get(i)!=0) {
				que.add(s1.get(i));
			}
			else {
				break;
			}
		}
		System.out.println(que);
		
		for(int i=0;i<s2.size();i++) {
			
			if(s2.get(i)==0) {
				count=count+1;

			}
			if(count<2 || s2.get(i)!=0) {
				que.add(s2.get(i));				
			}
			
			else {
				break;
			}
		}
		System.out.println(que);
		
		for(int i=0;i<s3.size();i++) {
			
			if(s3.get(i)==0) {
				count=count+1;

			}
			if(count!=3 || s3.get(i)!=0) {
				que.add(s3.get(i));				
			}
			
		}
		
		
//		System.out.println(count);
		System.out.println(que);

	}

}
