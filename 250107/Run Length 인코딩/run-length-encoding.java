import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int cnt = 1; // 첫 번째 문자는 1번 등장
        char a = str.charAt(0);

        StringBuilder result = new StringBuilder(); // 결과를 저장할 StringBuilder

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                cnt++; // 같은 문자일 경우 카운트 증가
            } else {
                result.append(a); // 문자 추가
                result.append(cnt); // 등장 횟수 추가
                a = str.charAt(i); // 새로운 문자로 업데이트
                cnt = 1; // 카운트 초기화
            }
        }

        // 마지막 문자 처리
        result.append(a);
        result.append(cnt);

        // 결과 출력
        System.out.println(result.length());
        System.out.println(result.toString());
    }
}