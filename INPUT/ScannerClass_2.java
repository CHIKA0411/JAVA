import java.util.Scanner;
public class ScannerClass_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer");

        // Using nextInt() to parse integer values
        int a = sc.nextInt();

        System.out.println("Enter a String");

        // Using nextLine() to parse string values
        String b = sc.nextLine();

        // Display name and age entered above
        System.out.printf("You have entered:- " + a + " "
                + "and name as " + b);
    }
}
