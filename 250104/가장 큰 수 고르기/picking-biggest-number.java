// int INT_MIN = Integer.MIN_VALUE;
// final int INT_MIN = Integer.MIN_VALUE;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        final int INT_MIN = Integer.MIN_VALUE;
        int maxVal = INT_MIN;

        for(int i = 0;i<10;i++) {
            arr[i] = sc.nextInt();
            if(arr[i] >= maxVal) {
                maxVal = arr[i];
            }
        }

        System.out.print(maxVal);
    }
}