import java.util.Scanner;
public class Scanner_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum=0,count=0;
        while(sc.hasNextInt()){
            int num=sc.nextInt();
            sum+=num;
            count++;
        }
        int mean=sum/count;
        System.out.println("mean="+mean);

    }
}
