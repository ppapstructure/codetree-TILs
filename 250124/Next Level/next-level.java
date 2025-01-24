// import java.util.Scanner;

// class Account {
//     String id;
//     int level;

//     public Account() {
//         this.id = "codetree";
//         this.level = 10;
//     }
    
//     public Account(String id, int level) {
//         this.id = id;
//         this.level = level;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Please write your code here.
//         Scanner sc = new Scanner(System.in);
//         String s = sc.next();
//         int lev = sc.nextInt();

//         Account user1 = new Account();
//         System.out.printf("user %s lv %d\n", user1.id, user1.level);
//         Account user2 = new Account(s, lev);
//         System.out.printf("user %s lv %d\n", user2.id, user2.level);
//     }
// }


import java.util.Scanner;

class Account {
        String id;
        int level;

        public Account() {
            this.id = "codetree";
            this.level = 10;
        }

        public Account(String id, int level) {
            this.id = id;
            this.level = level;
        }
    }

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id;
        int level;

        id = sc.next();
        level = sc.nextInt();

        Account user1 = new Account();
        Account user2 = new Account(id, level);

        System.out.printf("user %s lv %d\n", user1.id, user1.level);
        System.out.printf("user %s lv %d\n", user2.id, user2.level);

    }
}