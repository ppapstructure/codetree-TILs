import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int q = sc.nextInt();
        

        for(int i = 0;i<q;i++) {
            int n = sc.nextInt();
            
            if(n==1) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                char temp;
                
                char[] arr = s.toCharArray();
                temp = arr[a-1];
                arr[a-1] = arr[b-1];
                arr[b-1] = temp;

                s = String.valueOf(arr);
                System.out.println(s);
            }

            else if (n==2) {
                char a = sc.next().charAt(0);
                char b = sc.next().charAt(0);

                char[] arr2 = s.toCharArray();

                for(int j = 0;j<arr2.length;j++) {
                    if(arr2[j]==a) arr2[j] = b;
                }

                s = String.valueOf(arr2);
                System.out.println(s);
            }

            
        }
    }
}