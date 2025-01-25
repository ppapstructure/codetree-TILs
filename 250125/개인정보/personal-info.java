import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Student implements Comparable<Student> {
    String name;
    int height;
    double weight;

    public Student(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student s) {
        return this.name.compareTo(s.name);
    }

}


public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];


        for(int i = 0;i<5;i++) {
            String name = sc.next();
            int h = sc.nextInt();
            double w = sc.nextDouble();

            students[i] = new Student(name, h, w);
        }

        Arrays.sort(students);


        System.out.printf("name\n");
        for(int i = 0;i<5;i++) {
            System.out.printf("%s %d %.1f\n",students[i].name,students[i].height, students[i].weight);
        }

        System.out.println();

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                return b.height - a.height;
            }
        });
        
        System.out.printf("height\n");
        for(int i = 0;i<5;i++) {
            System.out.printf("%s %d %.1f\n",students[i].name,students[i].height, students[i].weight);
        }
        
    }
}