import java.util.LinkedList;
import java.util.Scanner;

public class testDemo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读取正整数n
        int n = scanner.nextInt();

        // 找出最后留在队列中的人的编号
        int lastPerson = findLastPerson(n);

        // 输出结果
        System.out.println(lastPerson);

        scanner.close();
    }

    // 找出最后留在队列中的人的编号
    public static int findLastPerson(int n) {
        LinkedList<Integer> queue = new LinkedList<>();

        // 初始化队列
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        int count = 0;
        while (queue.size() > 1) {
            int person = queue.removeFirst();
            count++;

            if (count % 3 != 0) {
                queue.add(person);
            }
        }

        return queue.getFirst();
    }
}