import java.util.Scanner;

public class Main {

    public static boolean func(int n) {
        boolean istrue = false;
        int num = 0;
        int temp = n;

        while(temp>0) {
            num += temp % 10;
            temp /= 10;
        }
        if(n%2==0 && num%5==0) istrue = true;
        
        return istrue;
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(func(n)) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }

    }
}