import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student>{
    int h, w;
    int idx;
    
    public Student(int h, int w, int idx) {
        this.h = h;
        this.w = w;
        this.idx = idx;
    }

    public int compareTo(Student s) {
        if(this.h!=s.h)
            return this.h - s.h;
        
        return s.w - this.w;
    }
}



public class Main {
    public static final int MAXN = 1000;

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[MAXN];

        for(int i = 0;i<n;i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            students[i] = new Student(height,weight,i+1);
        }

        Arrays.sort(students,0,n);

        for(int i = 0;i<n;i++) {
            System.out.printf("%d %d %d\n",students[i].h, students[i].w, students[i].idx);
        }

    }
}