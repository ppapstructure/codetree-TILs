import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        
        if(str.indexOf(c) != -1) System.out.print(str.indexOf(c));
        else System.out.print("No");
    }
}