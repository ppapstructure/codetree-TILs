import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] str = new String[]{"apple","banana","grape","blueberry","orange"};
        char a = sc.next().charAt(0);
        int cnt = 0;

        for(int i = 0;i<str.length;i++) {
            if(str[i].charAt(2)==a || str[i].charAt(3)==a) {
                cnt++;
                System.out.println(str[i]);
            }
        }

        System.out.print(cnt);
    }
}