import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] count = new int[4];
        // 0 - A , 1 - B, 2 - C, 3 - D;

        for(int i = 0;i<3;i++) {
            char is_cold = sc.next().charAt(0);
            int tem = sc.nextInt();

            if(is_cold=='Y'&& tem>=37) {
                count[0]++;
            }
            else if(is_cold=='N'&& tem>=37) {
                count[1]++;
            }
            else if(is_cold=='Y'&& tem<37) {
                count[2]++;
            }
            else if(is_cold=='N'&& tem<37) {
                count[3]++;
            }
        }

        for(int i = 0;i<4;i++) {
            System.out.printf("%d ",count[i]);
        }
        if(count[0]>=2) System.out.print("E");

    }
}