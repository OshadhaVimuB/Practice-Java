import java.util.*;

public class RandomNumGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("How many random numbers? ");
        int num = sc.nextInt();

        System.out.println("Starting number of the range: ");
        int start = sc.nextInt();

        System.out.println("Ending number of the range: ");
        int end = sc.nextInt();

        System.out.println("\n");

        for (int i = 0; i < num; i++) {
            int randomNum = random.nextInt(start, end);
            System.out.println("Random number "+ (i+1) + " is: " + randomNum);
        }

        sc.close();
    }
}
