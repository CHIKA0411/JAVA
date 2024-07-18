import java.io.*;

public class BufferredReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string: ");
        String s=br.readLine();
        System.out.println("The string is: "+s);

    }

}
