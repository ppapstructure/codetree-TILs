import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[5][3];
        int diff = 'A'-'a';

        for(int i = 0;i<5;i++) {
            for(int j = 0;j<3;j++) {
                arr[i][j] = sc.next().charAt(0);
                System.out.print((char)(arr[i][j]+diff)+" ");
            }
            System.out.println();
        }

        // 대소문자 변환 확인
        // System.out.println((int)'a'+" "+(int)'A');
        //System.out.print((char)('b'+diff));

    }
}