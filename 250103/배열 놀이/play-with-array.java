import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n, q;
        n = sc.nextInt();
        q = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i<q;i++) {
            int t = sc.nextInt();

            if(t==1) {
                int a = sc.nextInt();

                System.out.println(arr[a-1]);
            }
            else if(t==2) {
                int b = sc.nextInt();
                int idx = -1;

                for(int j = 0;j<n;j++) {
                    if(arr[j]==b) {
                        idx = j;
                        break;
                    }
                }

                if(idx==-1) System.out.println(0);
                else {
                    System.out.println(idx+1);
                }

            }
            else if(t==3) {
                int s = sc.nextInt();
                int e = sc.nextInt();

                for(int j=s-1;j<=e-1;j++) {
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
            }
        }
        
    }
}