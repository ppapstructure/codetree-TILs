import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();

        str = str.substring(1,len) + str.substring(0,1);
        System.out.print(str);

    }
}