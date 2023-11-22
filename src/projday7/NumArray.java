package projday7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class NumArray {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			StudentData st = new StudentData();
			Scanner sc = new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int d=sc.nextInt();
			int f=sc.nextInt();
			
			File fi = new File("C:\\Users\\NIVATS\\Desktop\\fhandling//StudentDataArrayList.txt");
			try {
				FileWriter fw = new FileWriter(fi);
				fw.write("Numbers are : "+a+","+b+","+c+","+d+","+f);
				fw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}

			ArrayList<Integer> li = new ArrayList<Integer>();
			li.add(a);
			li.add(b);
			li.add(c);
			li.add(d);
			li.add(f);
			System.out.println(li);
			System.out.println(li.size());
	}

}
