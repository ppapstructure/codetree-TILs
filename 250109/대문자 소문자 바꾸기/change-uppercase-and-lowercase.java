import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();

        for(int i = 0;i<len;i++) {
            if('A'<=str.charAt(i)&&str.charAt(i)<='Z') {
                System.out.print((char)(str.charAt(i)+'a'-'A'));
            }
            else if('a'<=str.charAt(i)&&str.charAt(i)<='z') {
                System.out.print((char)(str.charAt(i)-('a'-'A')));
            }

        }
    }
}