import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

// implements Comparable<Point> 
class Point implements Comparable<Point>{
    int p1, p2, idx;

    public Point(int p1, int p2, int idx) {
        if(p1<0){
            this.p1 = -p1;
            this.p2 = p2;
            this.idx = idx;
        }
        else if(p2<0) {
            this.p1 = p1;
            this.p2 = -p2;
            this.idx = idx;     
        }
        else {
            this.p1 = p1;
            this.p2 = p2;
            this.idx = idx;
        }
    }
    
    @Override
    public int compareTo(Point p) {
        int absSum1 = this.p1 + this.p2;
        int absSum2 = p.p1 + p.p2;
        if(absSum1 != absSum2)
            return absSum1 - absSum2;
        
        return this.idx - p.idx; 
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point[] point = new Point[n];

        for(int i = 0;i<n;i++) {
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();

            point[i] = new Point(p1, p2, i+1);
        }

        Arrays.sort(point);

        for(int i = 0;i<n;i++) {
            System.out.println(point[i].idx);
        }

    }
}