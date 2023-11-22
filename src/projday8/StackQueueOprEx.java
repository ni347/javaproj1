package projday8;
import java.util.*;

public class StackQueueOprEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(30);
		list.add(90);
		
		Stack<Integer> stack = new Stack<Integer>();
		Queue<Integer> que = new PriorityQueue<Integer>();
		for(int i=0;i<list.size();i++) {
			stack.push(list.get(i));
			que.add(list.get(i));
		}
		System.out.println("Stack: "+stack);
		stack.pop();
		stack.pop();
		System.out.println("Stack after removing: "+stack);
		
		System.out.println("Queue: "+que);
		que.remove();
		que.remove();
		System.out.println("Queue after removing: "+que);
	}

}
