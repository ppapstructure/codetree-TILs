import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];


        for(int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int maxVal = 0;
        int minVal = arr[0];
        int idx_min=-1;

        // 최저 가격 찾기
        for(int i = 0;i<n;i++) {
            if(arr[i]<minVal) {
                minVal = arr[i];
                idx_min = i;
            }
        }

        // 최대 이익 구하기
        for(int i = idx_min+1;i<n;i++) {
            if(arr[i]>maxVal) {
                maxVal = arr[i];
            }
        }

        if(maxVal == 0) {
            System.out.print(0);
        }
        else {
        System.out.print(maxVal-minVal);
        }
    }
}