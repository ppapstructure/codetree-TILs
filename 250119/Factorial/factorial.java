import java.util.Scanner;


public class Main {
    public static int Fac(int n) {
            if(n==1) return 1;

            return Fac(n-1)*n;
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(Fac(n));
    }
}