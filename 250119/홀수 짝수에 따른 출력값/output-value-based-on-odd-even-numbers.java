import java.util.Scanner;

public class Main {
    public static int hamsu(int n) {

        if(n%2==0) {
            if(n==2) return 2;
            return hamsu(n-2) + n;
        }
        else{
            if(n==1) return 1;
            return hamsu(n-2) + n;
        }

    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(hamsu(n));

    }
}