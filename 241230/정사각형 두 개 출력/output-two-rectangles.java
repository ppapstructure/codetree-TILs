import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int a = 0;a<2;a++) {
            for(int i = 0;i<n;i++) {
                for(int j = 0;j<n;j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            System.out.println();
        } 
    }
}