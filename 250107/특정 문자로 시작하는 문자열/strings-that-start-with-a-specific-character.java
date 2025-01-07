import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];
        double avg = 0;
        int sum = 0;
        int cnt = 0;

        for(int i = 0;i<n;i++) {
            arr[i] = sc.next();
        }

        char c = sc.next().charAt(0);

        for(int i = 0;i<n;i++) {
            if(arr[i].charAt(0) == c) {
                sum += arr[i].length();
                cnt++;
            }
        }

        avg = (double)sum / cnt;

        System.out.printf("%d %.2f", cnt, avg);
    }
}