import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum_o = 0;
        int sum_a = 0;

        for(int i = 0;i<10;i++) {
            arr[i] = sc.nextInt();

            if(i%2==0) {
                sum_a += arr[i];
            }
            else {
                sum_o += arr[i];
            }
        }

        if(sum_a>=sum_o) {
            System.out.print(sum_a - sum_o);
        }
        else {
            System.out.print(sum_o - sum_a);
        }
        
    }
}