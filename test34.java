import java.util.ArrayList;
import java.util.Scanner;

public class test34 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Input student names
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            students.add(name);
        }

        // Output all student names and element count
        System.out.println("Content of ArrayList:" +students);
        System.out.println("Size of ArrayList:" +students.size());

        // Insert a student at a specified position (index 3)
        String newStudent = scanner.next();
        students.add(3, newStudent);

        // Output updated student names and element count
        System.out.println("Content of ArrayList:" + students);
        System.out.println("Size of ArrayList:" + students.size());

        // Remove a student at index 1
        students.remove(1);

        // Output updated student names and element count
        System.out.println("Content of ArrayList:" + students);
        System.out.println("Size of ArrayList:" + students.size());
    }
}