import java.util.*;

public class MadLibs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String adg1;
        String noun1;
        String adg2;
        String verb1;
        String adg3;

        System.out.println("Enter a adjective(description):");
        adg1 = sc.nextLine();
        System.out.println("Enter a noun(person/animal):");
        noun1 = sc.nextLine();
        System.out.println("Enter a adjective(description):");
        adg2 = sc.nextLine();
        System.out.println("Enter a verb end with -ing(action):");
        verb1 = sc.nextLine();
        System.out.println("Enter a adjective(description):");
        adg3 = sc.nextLine();


        System.out.println("\nI went to a " + adg1 + " zoo.");
        System.out.println("In a exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adg2 + " and " + verb1 + "!");
        System.out.println("I was " + adg3 + "!");

        sc.close();
    }
}