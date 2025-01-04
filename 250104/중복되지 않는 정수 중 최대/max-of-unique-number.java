import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] countArr = new int[1001];
        int maxVal = -1;

        int cnt = 0;

        for(int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
            countArr[arr[i]]++;
        }

        for(int i = 0;i<n;i++) {
            if(arr[i] > maxVal && countArr[arr[i]]<2){
                maxVal = arr[i];
            }
        }

        System.out.print(maxVal);

    }
}