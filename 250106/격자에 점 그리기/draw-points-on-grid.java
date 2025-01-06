import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n+1][n+1];

        int num = 1;
        for(int i = 0;i<m;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            arr[a][b] = num++;
        }

        for(int i = 1;i<=n;i++) {
            for(int j = 1;j<=n;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}