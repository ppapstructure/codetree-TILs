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
    // 1. 길이가 다르면, 둘 중 더 짧은 쪽이 사전순으로 앞설 가능성이 있으므로
    //    두 문자열 중 더 작은 길이를 기준으로 반복
    int len = Math.min(date1.length(), date2.length());

    for (int i = 0; i < len; i++) {
        char c1 = date1.charAt(i);
        char c2 = date2.charAt(i);

        if (c1 > c2) {
            // date1이 date2보다 사전순으로 앞서므로 true
            return true;
        } else if (c1 < c2) {
            // date1이 date2보다 사전순으로 뒤이므로 false
            return false;
        }
    }

    // 여기까지 내려왔다는 것은 앞쪽 글자가 모두 같다는 의미
    // 따라서 길이가 더 짧은 쪽이 사전순으로 앞선다
    return date1.length() < date2.length();
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

        // // 함수를 쓰는 경우
        // for(int i = 0;i<n;i++) {
        //     if(data[i].weather.equals("Rain")) {
        //         // i가 idx보다 더 빠른 일자일경우 idx에 대입.
        //         if(func(data[idx].date,data[i].date)) {
        //             idx = i;
        //         }
        //     }
        // }

        // compareTo이용
        for(int i = 0;i<n;i++) {
            if(data[i].weather.equals("Rain")) {
                // i가 idx보다 더 빠른 일자일경우 idx에 대입.
                if(data[idx].date.compareTo(data[i].date)>0) {
                    idx = i;
                }
            }
        }

        System.out.printf("%s %s %s",data[idx].date,data[idx].day,data[idx].weather);
    }
}
