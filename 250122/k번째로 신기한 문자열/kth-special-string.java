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
        

        for(int i = 0;i<n;i++)
            strs[i] = sc.next();


        int idx=0;
        for(int i = 0;i<n;i++) {
            if(strs[i].contains(T)) {
                sorted_str[idx++] = strs[i];
            }
        }

        Arrays.sort(sorted_str, Comparator.nullsLast(String::compareTo));

        System.out.print(sorted_str[2]);
    }
}