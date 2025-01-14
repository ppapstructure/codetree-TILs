import java.util.Scanner;

public class Main {
    public static int square(int a, int b) {
        int mnt = 1;

        for(int i = 0;i<b;i++) {
            mnt *= a;
        }
        
        return mnt;
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = square(a,b);

        System.out.print(result);
    }
}