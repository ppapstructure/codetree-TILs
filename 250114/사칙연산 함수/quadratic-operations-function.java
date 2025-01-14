import java.util.Scanner;

public class Main {
    public static void plus(int a, int b) {
        System.out.printf("%d + %d = %d", a,b,a+b);
    }

    public static void minus(int a, int b) {
        System.out.printf("%d - %d = %d", a,b,a-b);
    }

    public static void multiply(int a, int b) {
        System.out.printf("%d * %d = %d", a,b,a*b);
    }

    public static void divide(int a, int b) {
        System.out.printf("%d / %d = %d", a,b,a/b);
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char n = sc.next().charAt(0);
        int b = sc.nextInt();

        if(n=='+') {
            plus(a,b);
        }
        else if(n=='-') {
            minus(a,b);
        }
        else if(n=='*') {
            multiply(a,b);
        }
        else if(n=='/') {
            divide(a,b);
        }
        else {
            System.out.print("False");
        }


    }
}