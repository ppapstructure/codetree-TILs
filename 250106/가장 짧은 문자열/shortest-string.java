import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        int[] arr = new int[]{str1.length(), str2.length(), str3.length()};

        int maxLen = arr[0];
        int minLen = arr[0];

        for(int i = 0;i<3;i++) {
            if(maxLen<arr[i]) maxLen = arr[i];
            if(minLen>arr[i]) minLen = arr[i];
        }

        System.out.print(maxLen-minLen);
    }
}