import java.util.Random;
import java.util.Scanner;

public class test31 {
    public static void main(String[] args) {

        String[][] students = {
                {"10905100", "Tanlinlin"},
                {"10905101", "Chenyixing"},
                {"10905102", "Sunsimiao"},
                {"10905103", "Zhangwuji"},
                {"10905104", "Lichunfeng"},
                {"10905105", "Wangfeifei"},
                {"10905106", "Qianliuyi"},
                {"10905107", "Shenqiqi"},
                {"10905108", "Yangtianyi"},
                {"10905109", "Xiaozhan"}
        };

        Scanner scanner = new Scanner(System.in);


        int seed = Integer.parseInt(scanner.nextLine());
        Random random = new Random(seed);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("e")) {
                break;
            }


            int index = random.nextInt(10);
            System.out.println(students[index][0] + " " + students[index][1]);
        }
    }
}