import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int n = sc.nextInt();
        int[] arr = new int[n];
        int index = n;
        // 배열입력
        for(int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        // 탐색 실행
        while(true) {

            int maxVal = -1;
            
            // 최대값 탐색
            for(int i = 0;i<index;i++) {
                if(arr[i]>maxVal) {
                    maxVal=arr[i];
                }
            }

            // 최대값의 위치 탐색
            for(int i = 0;i<index;i++) {
                if(arr[i]==maxVal) {
                    index = i;
                    break;
                }
            }

            System.out.print(index+1 + " ");

            // 최대값의 위치가 1이라면 탐색 수행 종료
            if( (index+1) == 1) break;
        }
    }
}