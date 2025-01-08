import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int len = A.length();
        String C = sc.next();


        for(int i = 0;i<C.length();i++) {
            if(C.charAt(i)=='L'){
                A = A.substring(1,len) + A.substring(0,1);
            }
            else if(C.charAt(i)=='R') {
                A = A.substring(len-1,len)+A.substring(0,len-1);
            }
        }

        System.out.print(A);
    }
}