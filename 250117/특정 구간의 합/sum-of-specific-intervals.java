import java.util.Scanner;

public class Main {
    public static int n, m;
    public static int[] arr;

    public static void sum_func(int a, int b) {
        int sum = 0;

        for(int i = a-1;i<b;i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n];

        for(int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i<m;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum_func(a, b);
        }

    }
}