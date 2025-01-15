import java.util.Scanner;

public class Main {
    public static void modify(int[] arr) {
        int len = arr.length;
        int temp = 0;
        for(int i = 0;i<len;i++) {
            if(arr[i]%2==0) {
                temp = arr[i];
                arr[i] = temp/2;
            }
        }
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        modify(arr);

        for(int i = 0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }

    }
}