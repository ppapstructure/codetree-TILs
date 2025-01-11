import java.util.Scanner;

public class Main {

    public static int findLCM(int n, int m) {
        int gcd = 0;

        for(int i = 1;i <= Math.min(n,m);i++) {
            if(n%i==0 && m%i==0) gcd = i;
        }
        // System.out.println("gcd:"+gcd);
        return (n*m)/gcd;
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();

        int result = findLCM(n,m);

        System.out.print(result);
    }
}