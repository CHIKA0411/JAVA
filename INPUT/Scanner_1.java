import java.util.Scanner;
public class Scanner_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a name: ");
        String name = sc.nextLine();
        System.out.println("Enter gender: ");
        char gender = sc.next().charAt(0);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        System.out.println("Enter mobile number: ");
        long mobileNumber = sc.nextLong();
        System.out.println("Enter cgpa: ");
        double cgpa = sc.nextDouble();


        // Print the values to check if the input was correctly obtained.
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("Mobile Number: "+mobileNumber);
        System.out.println("CGPA: "+cgpa);


    }
}
