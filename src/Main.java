import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Conference> conferences = new ArrayList<>();

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Enter information");
            System.out.println("2. Show all data");
            System.out.println("3. Print price of all nights for a specific delegate");
            System.out.println("4. Print earliest male delegate in hotel");
            System.out.println("5. Print all delegates");
            System.out.println("5. Print all delegate info for a certain room");
            System.out.println("6. Exit");
            System.out.println();
            System.out.print("Choose: ");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println();
                    Conference.add(addElements(sc));
                    break;
                case 2:
                    System.out.println();
                    returnInfo(Conference);
                    break;
                case 3:
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    break;
                case 5:
                    System.out.println();
                    break;
                case 6:
                    exit(0);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
    }
}
