import java.util.Random;

public class test32 {
    public static void main(String[] args) {
        int seed = 1234; // replace this with user input in the final version
        Random random = new Random(seed);

        boolean[] redBalls = new boolean[33];
        boolean[] blueBalls = new boolean[16];

        // Select 6 red balls
        for (int i = 0; i < 6; i++) {
            int redBall = random.nextInt(33) + 1;
            redBalls[redBall - 1] = true; // Mark the selected red ball as true
        }

        // Select 1 blue ball
        int blueBall = random.nextInt(16) + 1;
        blueBalls[blueBall - 1] = true; // Mark the selected blue ball as true

        // Print the selected red balls
        for (int i = 0; i < redBalls.length; i++) {
            if (redBalls[i]) {
                System.out.printf("%02d ", i + 1);
            }
        }
        System.out.println();

        // Print the selected blue ball
        for (int i = 0; i < blueBalls.length; i++) {
            if (blueBalls[i]) {
                System.out.printf("%02d", i + 1);
            }
        }
        System.out.println();
    }
}