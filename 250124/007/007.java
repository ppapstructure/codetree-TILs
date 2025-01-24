// import java.util.Scanner;

// class Code {
//     String s; 
//     char p;
//     int t;

//     public Code(String secret, char place, int t) {
//         this.s = secret;
//         this.p = place;
//         this.t = t;
//     }

// }

// public class Main {
//     public static void main(String[] args) {
//         // Please write your code here.
//         Scanner sc = new Scanner(System.in);
//         String s = sc.next();
//         char c = sc.next().charAt(0);
//         int t = sc.nextInt();

//         Code agent = new Code(s,c,t);

//         System.out.printf("secret code : %s\n", agent.s);
//         System.out.printf("meeting point : %s\n", agent.p);
//         System.out.printf("time : %s\n", agent.t);
//     }
// }


import java.util.Scanner;

class Spy {
        String secretCode;
        char meetingPoint;
        int time;

        public Spy(String secretCode, char meetingPoint, int time) {
            this.secretCode = secretCode;
            this.meetingPoint = meetingPoint;
            this.time = time;
        }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sCode;
        char mPoint;
        int time;

        sCode = sc.next();
        mPoint = sc.next().charAt(0);
        time = sc.nextInt();

        Spy agent = new Spy(sCode, mPoint, time);

        System.out.println("secret code : " + agent.secretCode);
        System.out.println("meeting point : " + agent.meetingPoint);
        System.out.println("time : " + agent.time);
    }
}