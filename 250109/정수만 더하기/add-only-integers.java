import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int sum = 0;
        int len = A.length();

        for(int i = 0;i<len;i++) {
            if('0'<=A.charAt(i) && A.charAt(i)<='9') {
                sum += (int)(A.charAt(i) - '0');
            }
        }

        System.out.print(sum);
    }
}