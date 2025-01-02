import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] arr = new int[10];

        for(int i = 0;i<10;i++) {
            int n = sc.nextInt();
            arr[i] = n;
            sum += arr[i];
        }

        System.out.print(sum);

    }
}

// int[] arr = new int[3];
// arr[0] = 3;
// arr[1] = 2;
// arr[0] = 1;

// int[] arr = {1, 2, 3};
// int[] arr = new int[] {1,2,3};