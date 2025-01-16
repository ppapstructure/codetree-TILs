import java.util.Scanner;

class Agent {
    char codename;
    int score;

    public Agent(char codename, int score) {
        this.codename = codename;
        this.score = score;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agent[] agent = new Agent[5];

        for(int i = 0;i<5;i++) {
            char codename = sc.next().charAt(0);
            int score = sc.nextInt();
            agent[i] = new Agent(codename, score);
        }

        int min = agent[0].score;
        char min_codename = agent[0].codename;

        for(int i = 0;i<5;i++) {
            if(min>agent[i].score) {
                min = agent[i].score;
                min_codename = agent[i].codename;
            }
        }

        System.out.print(min_codename + " " + min);
    }
}