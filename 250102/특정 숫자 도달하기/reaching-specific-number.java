import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        double avg = 0;
        int sum = 0;
        int cnt = 0;
        int[] arr = new int[10];

        for(int i = 0;i<10;i++) {
            arr[i] = sc.nextInt();
            
            if(arr[i] >= 250) break;
            else {
                sum += arr[i];
                cnt++;
            }
        }

        avg = (double)sum / cnt;
        System.out.print(sum + " " + avg);

    }
}