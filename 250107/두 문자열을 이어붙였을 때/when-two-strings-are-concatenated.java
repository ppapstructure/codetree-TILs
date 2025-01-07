import java.util.Scanner;
// -- 문자열
// == 는 참조 주소를 비교
// .equals()메서드가 내용을 비
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        String strAll_a = "";
        String strAll_b = "";
        

        strAll_a = str1 + str2;
        strAll_b = str2 + str1;

        
        boolean is = strAll_a.equals(strAll_b);

        if(is) System.out.print("true");
        else System.out.print("false");

    }
}