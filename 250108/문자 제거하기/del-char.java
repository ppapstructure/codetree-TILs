import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        while(true) {
            int len = str.length();
            int n = sc.nextInt();

            if(n>len) {
                str = str.substring(0,len-1);
                System.out.println(str);
            }
            else{
                str = str.substring(0,n) + str.substring(n+1);
                System.out.println(str);
            }

            if(str.length() == 1) break;
        }

    }
}