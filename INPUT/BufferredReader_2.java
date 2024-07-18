import java.io.*;
public class BufferredReader_2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter an integer");

        // Taking integer input
        int a = Integer.parseInt(br.readLine());
        System.out.printf("You have entered:- " + a);

        System.out.println("Enter a String");

        String b = br.readLine();

        // Printing input entities above
        System.out.printf("You have entered name as " + b);
    }
}
