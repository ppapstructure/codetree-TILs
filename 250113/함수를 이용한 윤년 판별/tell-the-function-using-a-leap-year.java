import java.util.Scanner;

public class Main {
    public static boolean is_year(int n) {
        if(n%4 != 0) return false;
        if(n%100==0&&n%400!=0) return false;
        return true;
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(is_year(n)) {
            System.out.print("true");
        }
        else {
            System.out.print("false");
        }

    }
}