import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();


        int i = a;

        System.out.print(i+" ");
        while(true) {
            if (i%2 == 0) {
                i += 3;
                if (i>13) break;
                else System.out.print(i+" ");
            }
            else if (i%2 == 1) {
                i *= 2;
                if (i>13) break;
                else System.out.print(i+" ");
            }
        }


    }
}