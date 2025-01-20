import java.util.Scanner;

public class Main {

    public static int gcd(int a, int b) {
        int temp = Math.min(a,b);
        int maxGcd = 1;
        for(int i = 2;i<=temp;i++) {
            if(a%i==0&&b%i==0) maxGcd = i;
        }

        return maxGcd;
    }

    public static int lcm(int[]arr, int idx) {

        if(idx==0) {
            return arr[0];
        }

        int prevLcm = lcm(arr,idx-1); 

        return (prevLcm*arr[idx])/gcd(prevLcm,arr[idx]);
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(lcm(arr,n-1));
    }
}