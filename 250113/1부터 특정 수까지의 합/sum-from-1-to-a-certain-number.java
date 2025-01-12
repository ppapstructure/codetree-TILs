import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = func(n);

        System.out.print(result);
    }

    public static int func(int n) {
        int val=0;
        for(int i = 1;i <= n;i++) {
            val += i;
        }

        return val/10;
    }
}