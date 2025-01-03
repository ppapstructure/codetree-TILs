import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[50];

        arr[0] = 1;
        arr[1] = n;

        for(int i = 2; i<50;i++) {
            arr[i] = arr[i-1] + arr[i-2];
            if(arr[i]>100) break;
        }

        for(int i = 0;arr[i]!=0;i++) {
            System.out.print(arr[i]+" ");
        }

    }
}