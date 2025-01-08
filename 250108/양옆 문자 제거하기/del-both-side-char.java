import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ans = new String();
        int len = str.length();

        ans = str.substring(0,1) + str.substring(2,len-2) + str.substring(len-1);
        System.out.print(ans);
    }
}