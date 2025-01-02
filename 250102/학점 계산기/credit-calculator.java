import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] arr = new double[n];
        double sum=0;
        double avg = 0;

        for(int i = 0;i<n;i++) {
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }
        avg = sum/n;
        if(avg>=4.0) {
            System.out.printf("%.1f\n",avg);
            System.out.print("Perfect");
        }
        else if(avg>=3.0){
            System.out.printf("%.1f\n",avg); 
            System.out.print("Good");
        }
        else {
            System.out.printf("%.1f\n",avg);
            System.out.print("Poor");
        };
    }
}