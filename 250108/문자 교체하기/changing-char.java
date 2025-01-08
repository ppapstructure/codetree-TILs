import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        char[] arrA = A.toCharArray();
        char[] arrB = B.toCharArray();
        arrB[0] = arrA[0];
        arrB[1] = arrA[1];

        B = String.valueOf(arrB);
        System.out.print(B);
    }
}