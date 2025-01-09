import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int n = 1;

        int lenA = A.length();

        for(int i = 0;i<lenA;i++) {
            A = A.substring(lenA-1,lenA) + A.substring(0,lenA-1);
            
            if(A.equals(B)) System.out.print(n);
            else n++;
        }

        if(n>A.length()) System.out.print(-1);


    }
}