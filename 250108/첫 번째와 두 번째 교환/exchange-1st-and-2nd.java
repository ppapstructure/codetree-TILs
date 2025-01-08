import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        char temp_1, temp_2;
        temp_1 = arr[0];
        temp_2 = arr[1];



        for(int i = 0;i<arr.length;i++) {
            if(arr[i]==temp_1) {
                // System.out.println("change_temp1");
                arr[i] = temp_2;
                }
            else if(arr[i]==temp_2){
                // System.out.println("change_temp2");
                arr[i] = temp_1;}
        }

        // for(int i = 0;i<arr.length;i++) {
        //     System.out.print(arr[i]+"");
        // }

        str = String.valueOf(arr);

        System.out.print(str);

    }
}