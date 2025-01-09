import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        String Anum = new String();
        String Bnum = new String();

        int lenA = A.length();
        int lenB = B.length();


        for(int i = 0;i<lenA;i++) {
            if('0'<=A.charAt(i)&&A.charAt(i)<='9') {
                Anum += A.charAt(i);
            }
        }

        for(int i = 0;i<lenB;i++) {
            if('0'<=B.charAt(i)&&B.charAt(i)<='9') {
                Bnum += B.charAt(i);
            }
        }

        System.out.print(Integer.parseInt(Anum) + Integer.parseInt(Bnum));
    }
}