import java.util.Scanner;

public class Main {

    public static boolean Day(int m, int n) {
        if(m==2) {
            if(n>=1&&n<=28) return true;
        }

        if(m<8) {
            if(m%2!=0) {
                if(n>=1 && n<=31) return true;
            }

            else {
                if(n>=1 && n<=30) return true;
            }

        }

        else if (m>=8&&m<=12) {
            if(m%2==0) {
                if(n>=1 && n<=31) return true;
            }
            else {
                if(n>=1 && n<=30) return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();

        if(Day(m,d)) 
            System.out.print("Yes");
        else 
            System.out.print("No");
        
    }
}