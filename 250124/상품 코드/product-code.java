import java.util.Scanner;

class Item {
    String name;
    int code;

    public Item() {
        this.name = "codetree";
        this.code = 50;
    }

    public Item(String name, int code) {
        this.name = name;
        this.code = code;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int code = sc.nextInt();

        Item item = new Item();
        Item item2 = new Item(name, code);

        System.out.printf("product %d is %s\n", item.code, item.name);
        System.out.printf("product %d is %s\n", item2.code, item2.name);

    }
}