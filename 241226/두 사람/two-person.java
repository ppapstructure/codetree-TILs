import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a, b;
        char a_s, b_s;
        a = sc.nextInt();
        a_s = sc.next().charAt(0);
        b = sc.nextInt();
        b_s = sc.next().charAt(0);

        if ((a>=19 && a_s=='M') || (b>=19 && b_s=='M')) System.out.print(1);
        else System.out.print(0);
    }
}