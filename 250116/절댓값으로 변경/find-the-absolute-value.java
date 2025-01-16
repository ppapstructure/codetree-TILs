import java.util.Scanner;

class IntWrapper {
    int n;
    int[] arr;

    public IntWrapper(int n, int[] arr) {
        this.arr = arr;
        this.n = n;
    }
}

public class Main {

    public static void Absolute(IntWrapper A) {
        int len = A.arr.length;
        for(int i = 0;i<len;i++) {
            if(A.arr[i]<0) {
                A.arr[i] = -A.arr[i];
            }
        }
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        IntWrapper A = new IntWrapper(n, arr);
        // System.out.println(A.arr[0]);

        Absolute(A);
        arr = A.arr;
        for(int i = 0;i<n;i++) {
            System.out.print(arr[i] +" ");
        }

    }
}