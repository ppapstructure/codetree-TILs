import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        String str = Integer.toString(n);


        // System.out.print(str);

        for(int i = 0;i<str.length();i++) {
            sum += str.charAt(i)-'0';
            // System.out.println(str.charAt(i));

        }

        System.out.print(sum);

    }
}