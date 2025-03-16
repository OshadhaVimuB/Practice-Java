import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int code = 5;

        while (code != 0) {
            try {
                System.out.println("--------------Unit Converter--------------");
                System.out.println("\n1. Length");
                System.out.println("2. Temperature ");
                System.out.println("3. Weight");
                System.out.println("4. Time");
                System.out.println("0. Quit");
                System.out.print("\nEnter your choice (eg: For length enter 1. Enter 0 to exit): ");
                code = sc.nextInt();

                switch (code) {
                    case 1:
                        double ans = length();
                        System.out.println(ans);
                        break;
                }
            }
            catch (Exception e) {
                System.out.println("\nEnter a valid choice.");
                sc.nextLine();
            }
        }
    }

    public static double length() {
        int choice = 3;
        Scanner sc = new Scanner(System.in);

        while (choice != 0) {
            System.out.println("--------------Unit Converter--------------");
            System.out.println("1. cm to m");
            System.out.println("2. m to cm");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter length in cm: ");
                    double lengthcm = sc.nextDouble();
                    lengthcm = lengthcm / 100;
                    return lengthcm;
                    case 2:
                        System.out.println("Enter length in m: ");
                        double lengthM = sc.nextDouble();
                        lengthM = lengthM * 100;
                        return lengthM;
                        case 0:
                            sc.close();
                            break;
            }
        }
        sc.close();
        return 0;
    }
}
