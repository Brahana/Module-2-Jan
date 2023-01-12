import java.util.*;
import java.util.Scanner;

public class Main{
    
		  static void printSubsequence(String s , String ans) {		
        
		if( s.length() == 0){
			System.out.print(ans+" ");
			return;
		}
		printSubsequence(s.substring(1) , ans + s.charAt(0));
		printSubsequence(s.substring(1) , ans);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printSubsequence(s,"");
    }
}
