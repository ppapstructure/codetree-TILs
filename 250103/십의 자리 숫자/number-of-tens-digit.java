import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int[] countArr = new int[10];
        int cnt = 0;

        while(true) {
            arr[cnt] = sc.nextInt();
            if(arr[cnt] == 0) break;
            countArr[arr[cnt]/10]++;
            cnt++;
        }

        for(int i = 1;i<10;i++) {
            System.out.printf("%d - %d\n",i, countArr[i]);
        }

    }
}