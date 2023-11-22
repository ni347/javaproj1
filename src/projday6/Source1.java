package projday6;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
public class Source1 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        // Declare the variable
        int a;
        
        // Read the variable from STDIN
        a = in.nextInt();
        
        // Output the variable to STDOUT
        // System.out.println(a);
        // int curr;
        if(a>=1&&a<=10){
            int[][] arr = new int[a][a];
            for(int i=0;i<a;i++){
                for(int j=0;j<a;j++){
                    arr[i][j]=in.nextInt();
                }
            }
            int[][] trans = new int[a][a];
            
                for(int i=0;i<a;i++){
                    for(int j=0;j<a;j++){
                        if(arr[i][j]>=1&&arr[i][j]<=100){
                            trans[j][i]=arr[i][j];
                        }
                        
                    }
                }
            
            

            for(int i=0;i<a;i++){
                for(int j=0;j<a;j++){
                    System.out.print(trans[i][j]+" ");
                }
                System.out.println("");
            }
        }
        
   }
}



