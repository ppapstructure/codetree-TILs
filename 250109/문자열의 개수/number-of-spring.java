import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int idx = 0;
        String[] strArr = new String[10];

        while(true) {
            String str = sc.next();

            if(str.equals("0")) {
                System.out.println(cnt);
                for(int i = 0;i<cnt;i++) {
                    if(i%2==0) System.out.println(strArr[i]);
                }
                break;
            }
            strArr[cnt++] = str;
            
        }
    }
}