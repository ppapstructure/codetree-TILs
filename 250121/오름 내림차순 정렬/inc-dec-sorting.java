import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        for(int i = 0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arr2, Collections.reverseOrder());

        for(int i = 0;i<n;i++) {
            System.out.print(arr2[i]+" ");
        }

    }
}


// import java.util.Arrays;
// import java.util.Collections;


// int[] arr = new int[] {12, 41, 37, 81, 19, 25, 60, 20};
// Arrays.sort(arr);


// Integer[] arr = new Integer[] {12, 41, 37, 81, 19, 25, 60, 20};
// Arrays.sort(arr, Collections.reverseOrder());

// int[] arr = new int[]{12, 41, 37, 81, 19, 25, 60, 20};
// Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer::new);
// Array.sort(arr2, Collections.reverseOrder());

