import java.util.Scanner;
// Integer.parseInt();
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        String ansAB = new String();
        String ansBA = new String();

        ansAB = A + B;
        ansBA = B + A;

        // System.out.println(ansAB);
        // System.out.println(ansBA);
        System.out.println(Integer.parseInt(ansAB)+Integer.parseInt(ansBA));

    }
}