import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        boolean sat = false;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        for(int i = a; i <= b; i++) {
            if(i%c == 0 ) {
                sat = true;
                break;
            }
        }

        if(sat == true) System.out.print("YES");
        else System.out.print("NO");
    }
}