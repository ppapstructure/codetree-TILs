import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        if(c=='a') {
            System.out.print('z');
        } else{
            System.out.print((char)(c-1));
        }

    }
}