import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static final int MAX_N = 100;
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String T = sc.next();
        String[] strs = new String[n];
        String[] sorted_str = new String[MAX_N];
        
        // 문자열 입력
        for(int i = 0;i<n;i++)
            strs[i] = sc.next();

        // 문자열 T로 시작하는 단어들만 솎아내자
        int idx = 0;
        for(int i = 0;i<n;i++) {
            boolean same = true;
            for(int j = 0;j<T.length();j++) {
                if(strs[i].charAt(j) != T.charAt(j)) {
                    same = false;
                    break;
                }
            }
            if (same) {
                sorted_str[idx++] = strs[i];
            }
        }        

        Arrays.sort(sorted_str,Comparator.nullsLast(String::compareTo));

        // for(int i = 0;i<5;i++) {
        //     System.out.println(sorted_str[i]);
        // }

        System.out.print(sorted_str[2]);
    }
}