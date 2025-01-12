import java.util.Scanner;

public class Main {
    public static int findMin(int a, int b, int c) {
        int min=0;
        if(a>b) {
            if(b>c) min = c;
            else if(b<=c) min = b;
        }
        else if(a<=b) {
            if(a>c) min = c;
            else if (a<=c) min = a;
        }
        return min;
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = findMin(a,b,c);
        System.out.print(result);
    }
}