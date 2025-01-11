import java.util.Scanner;

public class Main {
    
    public static void EnterLine(int n) {
        for(int i = 0;i<n;i++) {
            System.out.println("12345^&*()_");
        }
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        EnterLine(n);
    }
}