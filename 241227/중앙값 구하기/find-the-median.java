import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, mid=0;
        a = sc.nextInt();
        b = sc.nextInt(); 
        c = sc.nextInt(); 

        if (a>=b) {
            if (a>=c) {
                if(b>=c) {
                    mid = b;
                }
                else {
                    mid = c;
                }
            }
            else if (a<c) {
                mid = a;
            }
        }
        else if (a<b) {
            if (b>=c) {
                if(a>=c) {
                    mid = a;
                }
                else {
                    mid = c;
                }
            }
            else if (b < c) {
                mid = b;
            }
        }


        System.out.print(mid);
    }
}