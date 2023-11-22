package projday3;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] arr = new char[5];
		int[] arr1 = new int[5];
		
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=sc.next().charAt(0);
//		}
		for(int i=0;i<arr.length;i++) {
			arr1[i]=sc.nextInt();
		}
		
//		for(int i=0,j=4;i<=4;i++,j--) {
//			
//			System.out.println(arr[i]+" "+arr[j]);
//		}
        for(int i=0,j=4;i<=4;i++,j--) {
			
			System.out.println(arr1[i]+" "+arr1[j]);
		}
        
        int[][] arr2 = new int[2][3]; // double dimensional array
        //1 2 3 = 5000, 5004, 5008 //Address of memory location
        //4 5 6 = 5012, 5016, 5020 
        int[][] arr3 = {{1,2,3},{4,5,6}};
        for(int i=0;i<2;i++) {
        	for(int j=0;j<2;j++) {
        		System.out.println(arr[i][j]);
        	}
        	System.out.println();
        }
	}

}
