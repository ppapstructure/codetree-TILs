import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a_math, a_eng, b_math, b_eng;

        a_math = sc.nextInt();
        a_eng = sc.nextInt();
        b_math = sc.nextInt();
        b_eng = sc.nextInt();

        if (a_math > b_math && a_eng > b_eng) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }

    }
}