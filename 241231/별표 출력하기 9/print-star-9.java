import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        
        for(int i = 0;i < n;i++) {
            // 공백
            for(int j = 0;j<n-i-1;j++) {
                System.out.print("  ");
            }
            // 별
            for(int j = 0;j<2*i+1;j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        
    }
}