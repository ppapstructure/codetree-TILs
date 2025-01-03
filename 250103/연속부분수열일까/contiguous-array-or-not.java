import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        boolean ans = false;

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for(int i = 0;i<n1;i++) {
            arr1[i] = sc.nextInt();
        }

        for(int i = 0;i<n2;i++) {
            arr2[i] = sc.nextInt();
        }

        int cnt = 0;
 
        for(int i = 0;i<=n1-n2;i++) {
            for(int j = 0 ;j<n2;j++) {
                if(arr1[i]==arr2[j]) {
                    int idx = i;

                    for(int k = 0;k<n2;k++) {
                        if(arr1[idx+k]==arr2[k]) cnt++;
                        else {
                            cnt = 0;
                        }

                        if (cnt == n2) {
                            ans = true;
                            break;
                        }
                    }
                    idx = 0;
                }
                else continue;

            }
        }
        

        if(ans == true) System.out.print("Yes");
        else System.out.print("No");

    }
}