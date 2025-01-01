import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt_o = 0;
        int cnt_l = 0;

        for(int i = 0;i<n;i++) {
            if(i%2 == 0) {
                cnt_o = i*n + 1;
                for(int j = 0;j<n;j++) {
                    System.out.print(cnt_o+j+" ");
                }
            }
            else  {
                cnt_l = i*n;
                for(int j = n;j>0;j--) {
                    System.out.print(cnt_l+j + " ");
                }
            }
            System.out.println();
        }

    }
}