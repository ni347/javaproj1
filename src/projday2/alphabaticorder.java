package projday2;

public class alphabaticorder{
	   static boolean alphabetical_order(String my_str){
	      int str_len = my_str.length();
	      for (int i = 1; i < str_len; i++){
	         if (my_str.charAt(i) < my_str.charAt(i - 1)){
	            return false;
	         }
	      }
	      return true;
	   }
	   public static void main(String args[]){
	      String my_str = "abcmnqdz";
	      if (alphabetical_order(my_str)){
	         System.out.println("Positive string");
	      } else{
	         System.out.println("Negative String");
	      }
	   }
}
