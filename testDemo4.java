import java.util.Scanner;

public class testDemo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            String hex = scanner.next();
            int decimal = h2D(hex);
            sum += decimal;
        }

        System.out.println(sum);

        scanner.close();
    }

    public static int h2D(String s) {
        return Integer.parseInt(s, 16);
    }
}