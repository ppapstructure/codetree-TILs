import java.util.Scanner;

public class Main {
    public static boolean isPrime(int n) {
        // 완벽한 소수 판별을 위해 이정도 예외케이스는 알아두었어야함.
        if (n==1) return false;

        for(int i = 2;i<n;i++) {
            if(n%i==0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;

        for(int i = a;i<=b;i++) {
            if(isPrime(i)) sum += i;
        }

        System.out.print(sum);
    }
}