// final INT_MAX = Integer.MAX_VALUE;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        final int INT_MAX = Integer.MAX_VALUE;
        int minVal = INT_MAX;
        int[] arr = new int[n];

        for(int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
            if(minVal > arr[i]) {
                minVal = arr[i];
            }
        }

        int cnt = 0;
        for(int i = 0;i<n;i++) {
            if(minVal == arr[i]) cnt++;
        }

        System.out.print(minVal + " " + cnt);
    }
}