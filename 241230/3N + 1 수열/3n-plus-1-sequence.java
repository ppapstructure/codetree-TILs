import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt = 0;

        while(true) {
            if(n%2==0) {
                n /= 2;
                cnt++;
            }
            else {
                n = 3*n + 1;
                cnt++;
            }

            if(n==1) break;
        }

        System.out.print(cnt);

    }
}