import java.util.*;
public class recursivemultiplication {


        public static void multiplyRecursively(int n, int m) {
            //Write code here and print output

            if(n>m){
                System.out.println(add(n,m));
            }else{
                System.out.println(add(m,n));
            }


        }

    public static int add(int n, int m){

        if(m==1) return n;

        return n + add(n,m-1);
    }


        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int m = scn.nextInt();
            multiplyRecursively(n, m);
        }
    }
