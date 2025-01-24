import java.util.Scanner;

class Bomb {
    String solutionCode;
    char lineColor;
    int second;

    public Bomb() {
        this.solutionCode = "";
        this.lineColor = ' ';
        this.second = 0;
    }

    public Bomb(String solutionCode, char lineColor, int second) {
        this.solutionCode =solutionCode;
        this.lineColor = lineColor;
        this.second = second;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        String sCode = sc.next();
        char lColor = sc.next().charAt(0);
        int sec = sc.nextInt();

        Bomb code = new Bomb(sCode, lColor, sec);

        System.out.printf("code : %s\n", code.solutionCode);
        System.out.printf("color : %c\n", code.lineColor);
        System.out.printf("second : %d\n", code.second);
    }
}