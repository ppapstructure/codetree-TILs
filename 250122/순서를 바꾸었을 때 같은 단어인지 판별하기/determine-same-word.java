import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        char[] Achars = A.toCharArray();
        char[] Bchars = B.toCharArray();

        Arrays.sort(Achars);
        Arrays.sort(Bchars);

        String sortedA = new String(Achars);
        String sortedB = new String(Bchars);

        if(sortedA.equals(sortedB)) {
            System.out.print("Yes");
        }else {
            System.out.print("No");
        }

    }
}