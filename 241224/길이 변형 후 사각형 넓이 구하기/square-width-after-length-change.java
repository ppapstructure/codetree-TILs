import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();

        System.out.println(w+8);
        System.out.println(h*3);
        System.out.println((w+8)*(h*3));
    }
}