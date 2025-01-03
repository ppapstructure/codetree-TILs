import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[100];
        int cnt = 0;

        for(int i = 0;i<50;i++) {
            arr[i] = n*(i+1);
            
            if(arr[i]%5==0) cnt++;

            if(cnt==2) break;
        }

        for(int i = 0;arr[i]!=0;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}