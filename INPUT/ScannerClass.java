import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Enter a floating point number: ");
        float x = sc.nextFloat();
        System.out.println("You entered String "+s);
        System.out.println("You entered Number "+n);
        System.out.println("You entered Floating Point "+x);
    }
}
