import java.io.*;

public class AutoboxingandUnboxinginJava {
    public static void main(String[] args) {
        //Unboxing
        Integer i= new Integer(10);
        int i1=i;

        System.out.println("Wrapper class :"+i);
        System.out.println("Primitive Type :"+i1);
        // Autoboxing of character
        Character gfg = 'a';
        // Autoboxing of character
        System.out.println("Wrapper class :"+gfg);




    }
}
