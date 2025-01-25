import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Student {
    String n;
    int h, w;

    public Student(String name, int height, int weight) {
        this.n = name;
        this.h = height;
        this.w = weight;
    }


}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for(int i = 0;i<n;i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();

            students[i] = new Student(name, height, weight);
        }

        Arrays.sort(students,new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                if(a.h != b.h)
                    return a.h - b.h;
                
                return b.w - a.w;
            }
        });

        for(int i = 0;i<n;i++) {
            System.out.printf("%s %d %d\n",students[i].n,students[i].h,students[i].w);
        }

    }
}

        // Arrays.sort(students, new Comparator<Student>() {
        //     @Override
        //     public int compare(Student a, Student b) {
        //         return b.height - a.height;
        //     }
        // });