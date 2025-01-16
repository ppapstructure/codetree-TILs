import java.util.Scanner;

public class Main {

    public static boolean Decision(String A) {
        int len = A.length();

        for(int i = 1;i<len;i++) {
            if(A.charAt(i-1)!=A.charAt(i)) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();

        if(Decision(A)) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }
}