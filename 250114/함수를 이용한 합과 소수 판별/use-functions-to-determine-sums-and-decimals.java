import java.util.Scanner;

public class Main {

    public static boolean is_even(int i) {
        int sum = 0;
        while(i>0) {
            sum += i%10;
            i /= 10;
        }

        if(sum%2==0) return true;
        else return false;
    }
    public static boolean isPrime(int i) {
        for(int j = 2;j<i;j++) {
            if(i%j==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for(int i = a;i<=b;i++) {
            if(isPrime(i)&&is_even(i)) cnt++;
        }

        System.out.print(cnt);

    }
}