import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Student {
    String name;
    int kor, eng, math;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
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
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();

            students[i] = new Student(name, kor, eng, math);
        }

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                if (a.kor != b.kor)
                    return b.kor - a.kor;
                else if(a.eng != b.eng)
                    return b.eng - a.eng;
                return b.math - a.math;
            }
        });

        for(int i = 0;i<n;i++) {
            System.out.printf("%s %d %d %d\n" ,students[i].name
                                            ,students[i].kor
                                            ,students[i].eng
                                            ,students[i].math
            );
        }

    }
}