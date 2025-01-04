import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        final int INT_MIN = Integer.MIN_VALUE;
        int maxVal = INT_MIN;
        int maxVal2 = INT_MIN;
        int index = -1;

        for(int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();

            if(maxVal < arr[i])  {
                maxVal = arr[i];
                index = i;
            }
        }

        for(int i = 0;i<n;i++) {
            if(i==index) continue;

            if(maxVal2 < arr[i] && maxVal2 <= maxVal) {
                maxVal2 = arr[i];
            }
        }

        System.out.print(maxVal+" "+maxVal2);
    }
}