//1.Using Buffered Reader Class
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ReadInputFromConsole {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter an string: ");
        String s = br.readLine();
        System.out.println(s);
    }
}
