import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();
        int cnt = 1;
        int[][] arr = new int[n][m];

        for(int i = 0;i<n;i++) {
            for(int j = 0;j<m;j++) {
                arr[i][j] = cnt;
                cnt++;
            }
        }

        for(int i = 0;i<n;i++) {
            for(int j = 0;j<m;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}