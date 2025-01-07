import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[10];
        boolean is_none = true;

        for(int i = 0;i<10;i++) {
            arr[i] = sc.next();
        }

        char a = sc.next().charAt(0);

        for(int i = 0;i<10;i++) {
            int idx = arr[i].length()-1;
            if(arr[i].charAt(idx) == a) {
                System.out.println(arr[i]);
                is_none = false;
            }
        }

        if(is_none) System.out.print("None");
    }
}