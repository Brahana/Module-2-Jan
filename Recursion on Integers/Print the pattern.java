import java.io.*;
import java.util.*;

class Main
{

	public static void solve(int n)
    {
        // Your code here
		if(n==0)
			return;
		solve(n-1);
		printpattern(n);
		System.out.println();
        
    }
	public static void printpattern(int n)
	{
		if(n==0)
			return ;
		printpattern(n-1);
		System.out.print("* ");
	}
	
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
		solve(n);

    }
}
