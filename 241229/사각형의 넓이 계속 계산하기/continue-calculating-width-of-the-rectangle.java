import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int w,h;
        char c;

        while(true) {
            w = sc.nextInt();
            h = sc.nextInt();
            c = sc.next().charAt(0);

            System.out.println(w*h);

            if(c == 'C') break;
        }
    }
}