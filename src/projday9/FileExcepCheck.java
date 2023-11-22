package projday9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Valid {
	
//	@SuppressWarnings("static-access")
	public ArrayList<String> numberCheck(String str){
		
		ArrayList<String> res = new ArrayList<String>();
		for(char c:str.toCharArray()) {
			try {
//				@SuppressWarnings("unused")
				int num = Integer.parseInt(str.valueOf(c));
				res.add(str.valueOf(c));
			}catch(NumberFormatException e) {
				res.add(e.getMessage());
			}
		}
		return res;
	}
	
	public String fileCheck(String filename) {
		try {
			File file = new File(filename);
			if(file.exists()) {
				return "File found";
			}else {
				throw new FileNotFoundException("File not found");
			}
		}catch(FileNotFoundException e) {
			return e.getMessage();
		}
	}
}
public class FileExcepCheck{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="10ASD";
		String filename="abc.txt";
		Valid v = new Valid();

		System.out.println(v.numberCheck(str));
		System.out.println(v.fileCheck(filename));
	}

}
