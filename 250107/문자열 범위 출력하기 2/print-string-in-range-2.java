import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = sc.nextInt();

        int idx = str.length() - 1;
        if(idx>n) {
            for(int i = idx; i > idx-n ;i--) {
                System.out.print(str.charAt(i));
            }
        } else {
            for(int i = idx; i >= 0 ;i--) {
                System.out.print(str.charAt(i));
            }

        }


    }
}