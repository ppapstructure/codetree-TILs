import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int num = 1;

        if(n%2==0) {
            for(int col=n-1;col>=0;col--) {
                if(col%2==0) {
                    for(int row=0;row<n;row++) {
                        arr[row][col] = num++;
                    }
                }
                else {
                    for(int row=n-1;row>=0;row--) {
                        arr[row][col] = num++;
                    }
                }
            }
        }
        else {
            for(int col=n-1;col>=0;col--) {
                if(col%2!=0) {
                    for(int row=0;row<n;row++) {
                        arr[row][col] = num++;
                    }
                }
                else {
                    for(int row=n-1;row>=0;row--) {
                        arr[row][col] = num++;
                    }
                }
            }
        }

        for(int i = 0;i<n;i++) {
            for(int j = 0;j<n;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}