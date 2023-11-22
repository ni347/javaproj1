package projday3;

//import java.lang.reflect.Array;
import java.util.*;

public class SortArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {5,7,4,9,3};
//		logic to sort an array in ascending order
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr.length;j++) {
//				if(arr[i]<arr[j]) {
//					int temp = arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//				System.out.print(arr[j]);
//			}
//			System.out.println();
//		}
////		Arrays.sort(arr);
//		for(int i:arr) {
//			System.out.println(i);
//		}
		
//		logic to sort an array in descending order.
//		Scanner sc = new Scanner(System.in);
		int[] arr1 = {1,7,4,8,3};
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				if(arr1[i]>arr1[j]) {
					int temp = arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
//				System.out.print(arr1[j]);
			}
//			System.out.println();
		}
		for(int i:arr1) {
			System.out.println(i);
		}
	}

}
