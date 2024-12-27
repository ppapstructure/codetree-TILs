import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char a_dis, b_dis, c_dis;
        int a_cel, b_cel, c_cel;

        a_dis = sc.next().charAt(0);
        a_cel = sc.nextInt();

        b_dis = sc.next().charAt(0);
        b_cel = sc.nextInt();

        c_dis = sc.next().charAt(0);
        c_cel = sc.nextInt();

        if (a_dis == 'Y' && a_cel >= 37) {
            if((b_dis == 'Y' && b_cel >=37)||(c_dis == 'Y' && c_cel >=37)) {
                System.out.print('E');
            }
            else {
                System.out.print('N');
            }
        }
        else if (a_dis == 'N' && a_cel >= 37) {
            if((b_dis == 'Y' && b_cel >=37)&&(c_dis == 'Y' && c_cel >=37)) {
                System.out.print('E');
            }
            else {
                System.out.print('N');
            }
        }
        else if (a_dis == 'Y') {
            if((b_dis == 'Y' && b_cel >=37)&&(c_dis == 'Y' && c_cel >=37)) {
                System.out.print('E');
            }
            else {
                System.out.print('N');
            }

        }
        else {
            if((b_dis == 'Y' && b_cel >=37)&&(c_dis == 'Y' && c_cel >=37)) {
                System.out.print('E');
            }
            else {
                System.out.print('N');
            }
        }
    }
}
