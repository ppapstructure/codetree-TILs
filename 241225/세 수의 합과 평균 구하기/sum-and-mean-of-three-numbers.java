import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int hap = a+b+c;
        int avg = hap / 3;
        System.out.println(hap);
        System.out.println(avg);

    }
}