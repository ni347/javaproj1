package projday4;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> s = new Stack<Integer>();
		s.push(50);
		s.push(28);
		s.push(37);
		
		for(Integer i:s) {
			System.out.println(i);
		}
		s.pop();
		System.out.println();
		for(Integer i:s) {
			System.out.println(i);
		}
	}

}
