import java.util.Scanner;

public class testDemo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();

        float addition = num1 + num2;
        float subtraction = num1 - num2;
        float multiplication = num1 * num2;
        float division = 0;

        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        
         if (num2 != 0) {
            division = num1 / num2;
            System.out.println(division);
        } else {
            System.out.println("error!Divide by zero!");
        }
        
    }
}