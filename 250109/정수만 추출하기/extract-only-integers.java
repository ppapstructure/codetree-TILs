import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        
        int lenA = A.length();
        int lenB = A.length();

        for(int i=0;i<lenA;i++) {
            if('0'<=A.charAt(i) && A.charAt(i)<='9') {
                continue;
            }
            else {
                // System.out.print("i: " + i );
                A = A.substring(0,i);
                break;
            }
        }

        for(int i=0;i<lenB;i++) {
            if('0'<=B.charAt(i) && B.charAt(i)<='9') {
                continue;
            }
            else {
                // System.out.print("i: " + i );
                B = B.substring(0,i);
                break;
            }
        }

        System.out.print(Integer.parseInt(A)+Integer.parseInt(B));
    }
}