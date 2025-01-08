import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String t = sc.next();
        int n = str.length();
        int lenT = t.length();
        int cnt = 0;

        System.out.print(str.indexOf(t));

        // if(str.contains(t)) {
        //     System.out.print(str.indexOf(t));
        // }else{
        //     System.out.print(-1);
        // }


        // // substring
        // for(int i = 0;i<n-lenT+1;i++) {
        //     if(str.substring(i,i+lenT).equals(t)) cnt++;
        // }

        // if(cnt>0) System.out.print(cnt);
        // else System.out.print(-1);

    }
}