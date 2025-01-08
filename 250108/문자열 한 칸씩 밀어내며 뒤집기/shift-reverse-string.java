import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        int q = sc.nextInt();

        for(int i = 0;i<q;i++) {
            int n = sc.nextInt();

            if(n == 1) {
                str = str.substring(1,len) + str.substring(0,1);
                System.out.println(str);
            }
            else if (n==2) {
                str = str.substring(len-1,len) + str.substring(0,len-1);
                System.out.println(str);
            }
            else if (n==3) {
                char[] arr = str.toCharArray();
                char[] temp = new char[len];
                for(int j=len-1;j>=0;j--) {
                    temp[len-j-1] = arr[j];
                }
                str = String.valueOf(temp);
                System.out.println(str);
            }

        }
    }
}