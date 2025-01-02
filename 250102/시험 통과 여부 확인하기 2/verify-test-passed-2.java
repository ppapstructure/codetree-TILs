import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double avg = 0;
        int cnt = 0;
        int[] arr = new int[n];

        for(int i = 0;i<n;i++) {
            int sum = 0;
            for(int j = 0;j<4;j++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }

            avg = (double)sum/4;
            if(avg>=60) {
                System.out.println("pass");
                cnt++;
            }
            else {
                System.out.println("fail");
            }
            avg = 0;
        }

        System.out.print(cnt);
    }
}