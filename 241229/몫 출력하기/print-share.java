import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int cnt = 0;

        while(true) {
            if (cnt==3) break;

            int n = sc.nextInt();

            if(n%2==1) continue;
            else {
                System.out.println(n/2);
                cnt++;
            }

        }

        }
    }
