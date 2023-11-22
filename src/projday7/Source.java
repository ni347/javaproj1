package projday7;


//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
import java.util.*;
import java.io.*;
//import java.lang.*;
//import java.io.FileReader; 
//import java.io.IOException; 


//Implement the ExceptionCheck methods as per specification.
class ExceptionCheck {

	    public ArrayList<String> numberCheck(String str) {

	        ArrayList<String> result = new ArrayList<>();


	        for (char c : str.toCharArray()) {

	            try {

	                int num = Integer.parseInt(String.valueOf(c));

	                result.add(String.valueOf(num));

	            } catch (NumberFormatException e) {

	                result.add(e.getMessage());

	            }

	        }


	        return result;

	    }
		public String fileCheck(String filename) {

	        try {

	            File file = new File(filename);

	            if (file.exists()) {

	                return "File Found";

	            } else {

	                throw new FileNotFoundException("FileNotFoundException");

	            }

	        } catch (FileNotFoundException e) {

	            return e.getMessage();

	        }

	    }

}



public class Source {
	public static void main(String args[] ) throws Exception {
	  //Implement main() to check your program..
	  
	  ExceptionCheck ex = new ExceptionCheck();
	  String str = "10ASD";

	  ArrayList<String> numberCheckResult = ex.numberCheck(str);

	  System.out.println(numberCheckResult);

	//   System.out.println(ex.numberCheck());
	  String filename = "abc.txt";
	  System.out.println(ex.fileCheck(filename));
	}
}