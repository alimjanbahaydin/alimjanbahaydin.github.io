import java.util.Arrays;
import java.util.Scanner;

public class testDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读取n的值
        int n = scanner.nextInt();

        // 读取n个整数并将它们存储在一个数组中
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 对数组进行排序
        Arrays.sort(numbers);

        // 打印排序后的数据
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i]);
            if (i != n - 1) {
                System.out.print(" ");
            }
        }

        scanner.close();
    }
}