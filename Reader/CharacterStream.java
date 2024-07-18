import java.io.*;
public class CharacterStream {
    public static void main(String[] args) throws IOException {
        FileReader sourceStream=null;

        try{
            sourceStream=new FileReader("C:\\Users\\abham\\Downloads\\file-sample_100kB.rtf");

            int temp;
            while((temp=sourceStream.read())!=-1){
                System.out.print((char)temp);



            }
            System.out.println("Progrem successfully excuted");

        }
        finally {
            if(sourceStream!=null){
                sourceStream.close();
            }
        }
    }
}
