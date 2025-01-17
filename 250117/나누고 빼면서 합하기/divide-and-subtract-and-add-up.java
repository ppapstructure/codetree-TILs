import java.util.Scanner;

public class Main {
    public static int n,m;
    public static int[] arr = new int[100];

    public static int ham() {
        int sum = 0;
        sum = arr[m-1];

        while(true) {
            if(m%2==0) {
                m /= 2;
                sum += arr[m-1];
            }else{
                m -= 1;
                sum += arr[m-1];
            }

            if(m==1) break;
        }

        return sum;
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for(int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        int result = ham();

        System.out.print(result);
    }
}