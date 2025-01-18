import java.util.Scanner;

public class Main {
    public static void printCount(int n) {
        if (n==0)
            return;
        
        System.out.print(n+" ");
        printCount(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printCount(n);
    }
}