package projday5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("C:\\Users\\NIVATS\\Desktop\\fhandling\\file1.txt");
//		try {
//			FileWriter fw = new FileWriter(f);
//			fw.write("This is a line");
//			fw.close();
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
		try {
			Scanner sc = new Scanner(System.in);
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
