import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int lenA = A.length();
        int lenB = B.length();
        int cnt = 0;

        for(int i = 0;i<lenA-lenB+1;i++) {
            if(A.substring(i,i+lenB).equals(B)) cnt++;
        }

        System.out.print(cnt);
    }
}