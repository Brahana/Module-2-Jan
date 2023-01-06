import java.util.Scanner;

public class Main {

	public static void toh(int n,char A,char B,char C)
	{
		if(n==0)
			return;
		toh(n-1,A,C,B);
		System.out.println("Moving ring "+n+ " from " +A+ " to " +B);
		toh(n-1,C,B,A);
	}
    static void towersOfHanoi(int n, char source, char dest) {
      toh(n,'A','B','C');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towersOfHanoi(n, 'A', 'B'); // move n disks from A to B
    }
}
