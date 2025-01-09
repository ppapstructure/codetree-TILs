import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        while(true) {
            String A = sc.next();

            if(A.equals("END")) break;

            for(int i = A.length()-1;i>=0;i--) {
                System.out.print(A.charAt(i));
            }

            System.out.println();
        }

    }
}