import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        double avg = 0;
        int sum_o = 0;
        int cnt=0;

        for(int i = 0;i<10;i++) {
            arr[i] = sc.nextInt();

            if(i%2==1) sum+=arr[i];

            if((i+1)%3==0) {
                sum_o += arr[i];
                cnt++;
                // System.out.printf("%d ,, %d\n",arr[i], cnt);
            }
        }
        avg = (double)sum_o/cnt;
        System.out.printf("%d %.1f",sum, avg);


    }
}