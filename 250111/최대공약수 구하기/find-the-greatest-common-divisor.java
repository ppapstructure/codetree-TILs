// lV1에서 유클리드 호제법을 구했는데 기억이 안났음.
// 답지 풀이 참고
import java.util.Scanner;

public class Main {
    public static int gcd(int n,int m) {
        int a, b, temp;
        if (n>m) {
            a=n;
            b=m;
        }
        else {
            a=m;
            b=n;
        }

        while(true) {
            temp = a%b;
            a = b;
            b = temp;

            if(a%b==0) break;
        }

        return b;
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int result = gcd(n,m);
        System.out.print(result);
    }
}