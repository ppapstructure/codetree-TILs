import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] arr = new int[n][m];
        int num = 1;

        for(int k = 0;k<=(n-1)+(m-1);k++) {
            for(int i = 0;i<n;i++) {
                for(int j = m-1;j>=0;j--) {
                    if(i+j==k)  {
                        arr[i][j] = num++;
                    }
                    else continue;
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