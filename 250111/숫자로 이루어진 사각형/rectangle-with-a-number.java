import java.util.Scanner;

public class Main {
    public static void Square(int n) {
        int num = 1;
        for(int i = 0;i<n;i++) {
            for(int j = 0;j<n;j++) {
                if(num>9) num=1;
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Square(n);
        
    }
}