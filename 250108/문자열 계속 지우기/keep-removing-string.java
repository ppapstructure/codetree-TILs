import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        while(true) {
            
            int idx = A.indexOf(B);
            if(idx==-1) break;

            int lenB = B.length();
            A = A.substring(0,idx) + A.substring(idx+lenB);
        }

        System.out.print(A);
    }
}