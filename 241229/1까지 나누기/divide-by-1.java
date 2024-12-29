import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int ans = n;
        for(int i = 1; i<=n; i++) {
            ans /= i;
            // System.out.println(ans);
            cnt++;
            
            if(ans<=1) { 
                System.out.print(cnt);
                break;
            }
        }
        
    }
}