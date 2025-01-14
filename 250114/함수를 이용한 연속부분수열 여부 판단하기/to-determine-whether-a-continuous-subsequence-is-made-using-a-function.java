import java.util.Scanner;

public class Main {
    public static boolean is_su(int[] arrA, int[] arrB) {
        int lenA = arrA.length;
        int lenB = arrB.length;
        
        for(int i = 0;i < lenA-lenB+1;i++) {
            boolean is_suyeol = true;

            for(int j = 0;j<lenB;j++) {
                if(arrA[i+j] != arrB[j]) is_suyeol =false;
            }

            if(is_suyeol) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arrA = new int[n1];
        int[] arrB = new int[n2];  

        for(int i = 0;i<n1;i++) {
            arrA[i] = sc.nextInt();
        }

        for(int i = 0;i<n2;i++) {
            arrB[i] = sc.nextInt();
        }

        if(is_su(arrA,arrB)) {
            System.out.print("Yes");
        }
        else System.out.print("No");

    }
}