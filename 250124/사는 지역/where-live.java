import java.util.Scanner;

class Information {
    String name;
    String num;
    String addr;

    public Information(String name, String num, String addr) {
        this.name = name;
        this.num = num;
        this.addr = addr;
    }
} 

public class Main {

    public static boolean compareString(String str1, String str2) {
        int minlen = str1.length()>str2.length()?str2.length():str1.length();

        // System.out.println(minlen);
        for(int i = 0;i<minlen;i++) {
            if(str1.charAt(i)<str2.charAt(i)) 
                return true;
            else if(str1.charAt(i)<str2.charAt(i))
                return false;
        }

        return str1.length()<str2.length();
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Information[] information = new Information[n];

        for(int i = 0;i < n;i++) {
            String name = sc.next();
            String num = sc.next();
            String addr = sc.next();

            information[i] = new Information(name, num, addr);
        }

        int max_idx = 0;
        // 1. compareTo() 적용
        // for(int i = 0;i<n;i++) {
        //     if(information[max_idx].name.compareTo(information[i].name)<0)
        //         max_idx = i;
        // }


        // 2. compareTo() 없이 함수로 비교해서 풀어보기
        for(int i = 0;i<n;i++) {
            if(compareString(information[max_idx].name, information[i].name))
                max_idx = i;
        }

        System.out.printf("name %s\n",information[max_idx].name);
        System.out.printf("addr %s\n",information[max_idx].num);
        System.out.printf("city %s\n",information[max_idx].addr);
    }
}