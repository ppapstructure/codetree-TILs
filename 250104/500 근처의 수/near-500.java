import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        final int INT_MIN = Integer.MIN_VALUE;
        final int INT_MAX = Integer.MAX_VALUE;
        int[] arr = new int[10];

        for(int i = 0;i<10;i++) {
            arr[i] = sc.nextInt();
        }
        int diff_max = INT_MAX;
        int diff_min = INT_MAX;

        int idx_max = 0;
        int idx_min = 0;
        for(int i = 0;i<10;i++) {
            if(diff_max > 500 - arr[i] && arr[i]<500) {
                idx_max = i;
                diff_max = 500 - arr[i];
            }
            if(diff_min > arr[i]-500 && arr[i]>500) {
                idx_min = i;
                diff_min = arr[i]-500;
            }
        }

        System.out.print(arr[idx_max]+" "+arr[idx_min]);
    }
}