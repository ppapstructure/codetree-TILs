import java.util.Scanner;
import java.util.Arrays;

class Arr implements Comparable<Arr> {
    int val, idx;

    public Arr(int val, int idx) {
        this.val = val;
        this.idx = idx;
    }

    @Override
    public int compareTo(Arr a) {
        return val - a.val;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Arr[] arr = new Arr[n];

        for(int i = 0;i<n;i++) {
            int val = sc.nextInt();
            arr[i] = new Arr(val, i+1);
        }

        Arrays.sort(arr);
        // 정렬된 인덱스를 저장할 배열
        int[] result = new int[n];

        // 정렬 후 위치를 기록
        for (int i = 0; i < n; i++) {
            result[arr[i].idx - 1] = i + 1; // 정렬된 위치 저장 (1-based)
        }

        // 결과 출력
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}