import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1;i<=n;i++) {
            for(int j = 1;j<=n+1-i;j++) {
                if(i==n) System.out.printf("%d * %d = %d", i,j,i*j);
                else if(j<n+1-i) System.out.printf("%d * %d = %d / ", i,j,i*j);
                else System.out.printf("%d * %d = %d ", i,j,i*j);
            }
            System.out.println();
        }
    }
}