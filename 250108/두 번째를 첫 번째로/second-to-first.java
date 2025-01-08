import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        int len = arr.length;
        char temp = arr[1];
        for(int i = 1;i<len;i++) {
            if(arr[i]==temp) arr[i] = arr[0];
        }

        str = String.valueOf(arr);
        System.out.print(str);

    }
}