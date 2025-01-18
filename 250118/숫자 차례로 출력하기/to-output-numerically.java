import java.util.Scanner;

public class Main {
    public static void recursive_1(int n){
        if(n==0)
            return;

        recursive_1(n-1);
        System.out.print(n+" ");
    }

    public static void recursive_2(int n){
        if(n==0)
            return;

        System.out.print(n+" ");
        recursive_2(n-1);
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursive_1(n);
        System.out.println();
        recursive_2(n);

    }
}