import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int s, age;
        s = sc.nextInt();
        age = sc.nextInt();

        if (s==0) {
            if (age >= 19) {
                System.out.println("MAN");
            }
            else {
                System.out.println("BOY");
            }
        }
        else if (s==1) {
            if (age >= 19) {
                System.out.println("WOMAN");
            }
            else {
                System.out.println("GIRL");
            }
        }
    }
}