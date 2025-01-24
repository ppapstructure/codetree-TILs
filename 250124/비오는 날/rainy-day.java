import java.util.Scanner;

class Rain{
    String date;
    String day;
    String weather;

    public Rain(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}

// 객체 자체를 집어넣을 수 있나?

public class Main {
    public static final int MAX_N = 100;
    public static Rain[] data = new Rain[MAX_N];

    public static boolean func(String date1, String date2) {
        int len = date1.length();

        for(int i = 0;i<len;i++) {
            if(date1.charAt(i)<date2.charAt(i)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0;i<n;i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();

            data[i] = new Rain(date, day, weather);
        }

        int idx = -1;
        for(int i = 0;i<n;i++) {
            if(data[i].weather.equals("Rain")){
                idx = i;
                break;
            }
        }


        for(int i = 0;i<n;i++) {
            if(data[i].weather.equals("Rain")) {
                // i가 idx보다 더 빠른 일자일경우 idx에 대입.
                if(func(data[idx].date,data[i].date)) {
                    idx = i;
                }
            }
        }

        System.out.printf("%s %s %s",data[idx].date,data[idx].day,data[idx].weather);
    }
}