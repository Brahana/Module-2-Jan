import java.util.Scanner;



class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++){
			A[i] = s.nextInt();
		}
		int T = s.nextInt();
		System.out.println(lastIndex(A, T, N-1));
	}

	static int lastIndex(int A[],int T,int startIndex)
	{
		//Write your code here
		if(startIndex<0)
			return -1;
		if(A[startIndex]!=T)
			return lastIndex(A,T,startIndex-1);
		return startIndex;
       
	}
}

//
import java.util.Scanner;



class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++){
			A[i] = s.nextInt();
		}
		int T = s.nextInt();
		System.out.println(lastIndex(A, T, 0));
	}

	static int lastIndex(int A[],int T,int startIndex)
	{
		//Write your code here
		if(startIndex==A.length)
		{
			return -1;
		}
       int smallAns=lastIndex(A,T,startIndex+1);
		int ans=0;
		if(smallAns== -1)
		{
			if(A[startIndex]==T)
			{
				ans=startIndex;
			}
			else
			{
				ans=smallAns;
			}
				
		}
		else
		{
			ans=smallAns;
		}
		return ans;
	}
}
