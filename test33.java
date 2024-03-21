import java.util.Arrays;
import java.util.Scanner;

public class test33 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[6];
        int[] d = new int[5];

        Scanner scanner = new Scanner(System.in);
       
        for (int i = 0; i < 10; i++) {
            a[i] = scanner.nextInt();
        }

       
        System.out.println(Arrays.toString(a));

       
        System.arraycopy(a, 0, b, 0, 10);
        System.out.println(Arrays.toString(b));

     
        System.arraycopy(a, 0, c, 0, 6);
        System.out.println(Arrays.toString(c));

        
        System.arraycopy(a, 5, d, 0, 5);
        d[4] = -100;
        System.out.println(Arrays.toString(d));
    }
}