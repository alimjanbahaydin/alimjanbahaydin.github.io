import java.util.Scanner;

public class SXH2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读取起始值
        int start = scanner.nextInt();

        // 输出水仙花数
        printNarcissisticNumbers(start);

        scanner.close();
    }

    // 输出从指定起始值到999以内的水仙花数
    public static void printNarcissisticNumbers(int start) {
        for (int number = start; number <= 999; number++) {
            if (isNarcissisticNumber(number)) {
                System.out.print(number + " ");
            }
        }
    }

    // 判断一个数是否为水仙花数
    public static boolean isNarcissisticNumber(int number) {
        int sum = 0;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, 3);
            temp /= 10;
        }

        return sum == number;
    }
}