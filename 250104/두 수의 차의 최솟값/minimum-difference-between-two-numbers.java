import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        final int INT_MIN = Integer.MAX_VALUE;
        int minVal = INT_MIN;


        for(int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i<n;i++) {
            for(int j = i+1;j<n;j++) {
                if(minVal > arr[j]-arr[i]) minVal = arr[j]-arr[i];
            }
        }

        System.out.print(minVal);
    }
}