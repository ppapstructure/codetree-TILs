import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n;
        int sumVal=0;
        int cnt = 0;
        double avg;
   

    while(true) {
        n = sc.nextInt();
        if(n>29||n<20) break;
        sumVal += n;
        cnt++;
    }
    avg = (double)sumVal/cnt;
    System.out.printf("%.2f",avg);
    }
}