import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int hap = a + b + c;
        int avg = hap / 3;

        System.out.println(hap);
        System.out.println(avg);
        System.out.println(hap - avg);
    }
}