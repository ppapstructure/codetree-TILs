public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        double ft = 9.2, mi = 1.3;

        double ft_cm = 9.2*30.48;
        double ft_mi = 1.3*160934;

        System.out.printf("9.2ft = %.1fcm\n", ft_cm);
        System.out.printf("1.3mi = %.1fcm\n", ft_mi);
    }
}