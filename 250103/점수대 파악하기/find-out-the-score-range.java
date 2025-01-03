import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int[] CountArr = new int[10];

        for(int i = 0;i<100;i++) {
            arr[i] = sc.nextInt();

            if(arr[i]==0) break;

            if (arr[i]==100) CountArr[0]++;
            else if(arr[i]>=90) CountArr[9]++;
            else if(arr[i]>=80) CountArr[8]++;
            else if(arr[i]>=70) CountArr[7]++; 
            else if(arr[i]>=60) CountArr[6]++;
            else if(arr[i]>=50) CountArr[5]++; 
            else if(arr[i]>=40) CountArr[4]++; 
            else if(arr[i]>=30) CountArr[3]++;
            else if(arr[i]>=20) CountArr[2]++; 
            else if(arr[i]>=10) CountArr[1]++; 
        }

        for(int i = 0;i<10;i++) {
            if (i==0) System.out.printf("%d - %d\n",100-(10*i), CountArr[0]);
            else System.out.printf("%d - %d\n",100-(10*i), CountArr[10-i]);
        }

    }
}