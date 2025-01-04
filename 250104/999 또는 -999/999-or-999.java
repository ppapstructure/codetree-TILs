import java.util.Scanner;
// final INT_MAX = Integer.MAX_VALUE;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        final int INT_MAX = Integer.MAX_VALUE;
        final int INT_MIN = Integer.MIN_VALUE;
        int maxVal = INT_MIN;
        int minVal = INT_MAX;

        while(true) {
            int n = sc.nextInt();

            if(n==999||n==-999) break;

            if(n>=maxVal) {
                maxVal = n;
            }
            if(n<=minVal) {
                minVal = n;
            }
        }

        System.out.print(maxVal + " " + minVal);
    }
}