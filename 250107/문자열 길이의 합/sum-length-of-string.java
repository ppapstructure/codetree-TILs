import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int sum = 0;
        int cnt = 0;

        String[] arr = new String[n];

        for(int i = 0;i<n;i++) {
            arr[i] = sc.next();
            sum += arr[i].length();
            if(arr[i].charAt(0)=='a')cnt++;
        }

        System.out.print(sum + " " + cnt);
        

    }
}