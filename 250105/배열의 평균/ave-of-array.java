import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][4];
        double [] w_avg_arr = new double[2];
        double [] h_avg_arr = new double [4];

        double w_avg=0, h_avg=0;
        int a_sum = 0;

        for(int i = 0;i<2;i++) {
            int sum = 0;
            for(int j = 0;j<4;j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
                a_sum += arr[i][j];
            }
            w_avg_arr[i] = (double)sum/4;
        }

        // h_avg 구하기
        for(int i = 0;i<4;i++) {
            int h_sum = arr[0][i] + arr[1][i];
            h_avg_arr[i] = (double)h_sum/2;

        }

        // 출력
        for(int i = 0;i<2;i++) {
            System.out.printf("%.1f ",w_avg_arr[i]);
        }
        System.out.println();
        for(int i = 0;i<4;i++) {
            System.out.printf("%.1f ",h_avg_arr[i]);
        }
        System.out.println();
        System.out.printf("%.1f",(double)a_sum/8);

        // System.out.printf("w_avg : %.1f  %.1f\n", w_avg_arr[0], w_avg_arr[1]);
        // System.out.printf("h_avg : %.1f  %.1f\n", h_avg_arr[0], h_avg_arr[1]);
        // System.out.printf("a_avg : %.1f", (double)a_sum/8);
    }
}