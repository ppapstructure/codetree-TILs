import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean sat = false;

        for(int i = 2; i<=n-1; i++) {
            if(n%i == 0) {
                sat = true;
                break;
            }
        }

        if (sat == true) {
            System.out.print("C");
        }
        else {
            System.out.print("N");
        }

    }
}