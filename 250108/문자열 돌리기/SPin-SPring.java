import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();

        System.out.println(str);
        
        for(int i = 0;i<len;i++) {
            str = str.substring(len-1,len) + str.substring(0,len-1);
            System.out.println(str);
        }
    }
}