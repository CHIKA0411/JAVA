//2. Using Scanner Class
import java.util.Scanner;
public class ReadInputFromConsole_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("You entered string " + s);

        int a = sc.nextInt();
        System.out.println("You entered integer " + a);

        float b = sc.nextFloat();
        System.out.println("You entered float " + b);
    }
}
