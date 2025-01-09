import java.util.Scanner;
// Integer.toString();
// Integer.parseInt();
// .toCharArray();

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        String numStr = new String();
        numStr = Integer.toString(a+b);

        int cnt = 0;

        for(int i = 0;i<numStr.length();i++) {
            if(numStr.charAt(i)=='1') cnt++;
        }

        System.out.print(cnt);
    }
}