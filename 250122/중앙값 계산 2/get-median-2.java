import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static int centerValue(int[] arr, int n) {
        int len = n+1;
        int[] sortedArr = new int[len];

        for(int i = 0;i<len;i++)
            sortedArr[i] = arr[i];
        
        Arrays.sort(sortedArr);
        // System.out.println(sortedArr[len/2]);
        return sortedArr[len/2];
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = n/2 + 1;
        int[] result = new int[count];

        int idx = 0;
        for(int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i<n;i++) {
            if(i%2==0) {
                result[idx++] = centerValue(arr,i);
            }
        }

        for(int i = 0;i<idx;i++) {
            System.out.print(result[i]+" ");
        }

    }
}