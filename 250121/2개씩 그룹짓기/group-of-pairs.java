import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2*n];
        
        for(int i = 0;i<2*n;i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int minValue = arr[0];

        for(int i = 0;i<n;i++) {
            if(minValue < (arr[i]+arr[(2*n)-1-i])) {
                minValue = arr[i] + arr[(2*n)-1-i];
            }

            // System.out.print(arr[i]+" "+arr[(2*n)-1-i]);
            // System.out.println();
        }

        System.out.print(minValue);
    }
}