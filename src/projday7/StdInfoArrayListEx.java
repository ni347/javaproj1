package projday7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StdInfoArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentData st = new StudentData();
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String roll = sc.next();
		String marks = sc.next();
		File fi = new File("C:\\Users\\NIVATS\\Desktop\\fhandling//StudentDataArrayList.txt");
		try {
			FileWriter fw = new FileWriter(fi);
			fw.write("Student_Name : "+name+"\nStudent_Roll_No : "+roll+"\nStudent_Marks : "+marks);
			fw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

		ArrayList<String> li = new ArrayList<String>();
		li.add(name);
		li.add(roll);
		li.add(marks);
		System.out.println(li);
//		for(String i:li) {
//			System.out.println(i);
//		}
	}

}
