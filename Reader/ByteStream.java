import java.io.*;
public class ByteStream {
    public static void main(String[] args) throws IOException {
       FileInputStream sourceStream=null;
       FileOutputStream targetStream=null;
        try{
            sourceStream=new FileInputStream("C:\\Users\\abham\\Downloads\\file-sample_100kB.rtf");
            targetStream=new FileOutputStream("C:\\Users\\abham\\Downloads\\file-sample_100kB-Copy.rtf");
            int temp;
            while((temp=sourceStream.read())!=-1){
                System.out.print((char)temp);
            }
            System.out.println("Program is successfully executed");

        }
        finally {
            if(sourceStream!=null){
                sourceStream.close();
            }
            if(targetStream!=null){
                targetStream.close();
            }
        }

    }
}
