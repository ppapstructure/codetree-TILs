import java.util.Scanner;

public class Main {
    public static int is_true(String A, String B) {
        int lenA = A.length();
        int lenB = B.length();
        
        for(int i = 0;i<lenA-lenB+1;i++) {
            boolean include = true;            
            for(int j = 0;j<lenB;j++) {
                if(A.charAt(i+j)!=B.charAt(j)) {
                    include = false;
                    break;
                }
            }
            if(include) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int idx = is_true(A,B);

        System.out.print(idx);
    }
}