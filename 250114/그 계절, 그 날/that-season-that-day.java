import java.util.Scanner;

public class Main {
    public static boolean yoonyear(int y) {
        if(y%4==0 && y%100==0 && y % 400 == 0 ) return true;
        if(y%4==0 && y%100==0) return false;
        if(y%4==0) return true;

        return false;
    }

    public static int judgeDay(int y, int m) {
        if(yoonyear(y)) {
            if (m==2) return 29;
        }else{
            if (m==2) return 28;
        }

        if(m==4|| m==6 || m==9 ||m==11) return 30;

        return 31;
    }

    public static void Season(int y, int m, int d) {
        if(m<=12 && d<=judgeDay(y,m)) {
            if(m>=3&&m<=5) System.out.print("Spring");
            else if(m>=6&&m<=8) System.out.print("Summer");
            else if(m>=9&&m<=11) System.out.print("Fall");
            else System.out.print("Winter");
        }
        else
            System.out.print(-1);
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        Season(y,m,d);

    }
}