import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        boolean sat = true;

        for(int i = 0;i<5;i++) {
            int n =sc.nextInt();
            if(n % 3 != 0) {
                sat = false;
                break;
            }
        }

        if(sat == true) {
            System.out.print(1);
        }
        else {
            System.out.print(0);
        }

    }
}