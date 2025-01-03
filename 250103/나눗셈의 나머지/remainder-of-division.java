import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        int[] countArr = new int[10];

        int temp = 0;
        while(true) {
            temp = a/b;
            countArr[a%b]++;
            a=temp;

            if(a<=1) break;
        }

        int sum=0;
        for(int i = 0;i<10;i++) {
            sum += countArr[i]*countArr[i];
            // System.out.print(countArr[i]+ " ");
        }
        System.out.print(sum);
    }
}