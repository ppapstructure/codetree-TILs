import java.util.Scanner;

public class Main {
    public static String Pal(String s) {
        int len = s.length();
        String temp = new String();

        for(int i = len-1;i>=0;i--) {
            temp += s.charAt(i);  
        }
        // System.out.print(temp);
        return temp;
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        if(s.equals(Pal(s))) System.out.print("Yes");
        else System.out.print("No");
    
    }
}