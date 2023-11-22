package projday7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentData st = new StudentData();
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int roll = sc.nextInt();
		int marks = sc.nextInt();
		File fi = new File("C:\\Users\\NIVATS\\Desktop\\fhandling//StudentInfo.txt");
		try {
			FileWriter fw = new FileWriter(fi);
			fw.write("Student_Name : "+name+"\nStudent_Roll_No : "+roll+"\nStudent_Marks : "+marks);
			fw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		try {
			Scanner sc1 = new Scanner(System.in);
			while(sc1.hasNextLine()) {
				String line = sc1.nextLine();
				System.out.println(line);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
//		st.display(name, roll, marks);
	}

}


