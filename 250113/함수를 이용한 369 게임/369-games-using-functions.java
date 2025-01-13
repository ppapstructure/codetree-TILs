import java.util.Scanner;

public class Main {

    public static boolean is_true369(int i) {
        int n = i;
        boolean is_369 = false;
        
        while(n>0) {
            int a = n%10;
            if(a == 3 || a==6 || a==9) is_369=true;
            n /= 10;
        }

        return is_369;
    }

    public static boolean isMagicNumber(int i) {
        return i%3==0 || is_true369(i);
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for(int i = a;i<=b;i++) {
            if(isMagicNumber(i)) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}