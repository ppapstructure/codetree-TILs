import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =0;i<n;i++) {
            int a = sc.nextInt();

            int cnt = 0;
            while(true) {
                if(a==1) break;
                
                if(a%2==0) {
                    a /= 2;
                    cnt++;
                }
                else {
                    a = 3*a + 1;
                    cnt++;    
                }

            }
            System.out.println(cnt);
        }

    }
}