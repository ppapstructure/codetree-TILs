import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int sum = 0;

        for(int i = 0;i<100;i++) {
            int n = sc.nextInt();
            arr[i] = n;
            if(arr[i] == 0){
                sum = arr[i-1] + arr[i-2] + arr[i-3];
                break;
            } 
        }

        System.out.print(sum);
    }
}