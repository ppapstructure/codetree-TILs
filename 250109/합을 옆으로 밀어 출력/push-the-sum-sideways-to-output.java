import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 0;i<n;i++){
            int a = sc.nextInt();
            sum += a;
        }

        String strNum = Integer.toString(sum);
        int len = strNum.length();
        strNum = strNum.substring(1,len) + strNum.substring(0,1);
        System.out.print(strNum);
    }
}