import java.util.Scanner;

public class Main {
    public static int funcMax(int[] arr) {
        int maxVal = arr[0];
        int n = arr.length;
        
        for(int i = 1;i<n;i++) {
            if(maxVal < arr[i]) maxVal = arr[i];
        }

        return maxVal;
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(funcMax(arr));
    }
}