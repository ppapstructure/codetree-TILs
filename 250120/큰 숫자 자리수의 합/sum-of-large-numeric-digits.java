import java.util.Scanner;

public class Main {
    public static int recursive(int n) {
        if(n/10==0) 
            return n%10;

        return recursive(n/10) + n%10;
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print(recursive(a*b*c));

    }
}