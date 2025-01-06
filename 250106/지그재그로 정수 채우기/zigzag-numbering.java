import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();

        int[][] arr = new int[n][m];

        int num = 0;
        for(int j = 0;j<m;j++) {
            if(j%2==0) {
                for(int i = 0;i<n;i++) {
                    arr[i][j] = num++;
                }
            }
            else {
                for(int i = 1;i<=n;i++) {
                    arr[n-i][j] = num++;
                }
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