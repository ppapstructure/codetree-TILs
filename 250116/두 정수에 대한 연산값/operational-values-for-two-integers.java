import java.util.Scanner;

class IntWrapper {
    int value;

    public IntWrapper(int value){
        this.value = value;
    }
}

public class Main {

    public static void swap(IntWrapper A, IntWrapper B) {
        if(A.value > B.value) {
            A.value += 25;
            B.value *= 2;
        }
        else {
            B.value += 25;
            A.value *= 2;
        }
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        IntWrapper A = new IntWrapper(a);
        IntWrapper B = new IntWrapper(b);

        swap(A, B);

        a = A.value;
        b = B.value;

        System.out.print(a + " " + b);
    }
}