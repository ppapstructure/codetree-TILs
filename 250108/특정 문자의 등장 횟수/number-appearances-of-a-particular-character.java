import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = new String();
        str = sc.next();
        
        int cnt_ee = 0;
        int cnt_eb = 0;

        for(int i = 0;i<str.length()-1;i++) {
            if(str.charAt(i)=='e' && str.charAt(i+1)=='e') cnt_ee++;

            if(str.charAt(i)=='e'&& str.charAt(i+1)=='b') cnt_eb++;
        }

        System.out.print(cnt_ee + " " + cnt_eb);
    }
}