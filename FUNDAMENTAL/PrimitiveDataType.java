public class PrimitiveDataType {
    public static void main(String[] args) {
        //type-1
        boolean a=true;
        boolean b=false;
        System.out.println("Boolean type: ");
        System.out.println("a "+a);
        System.out.println("b "+b);

        //type-2
        char c='a';
        System.out.println("Character type: ");
        System.out.print(c++);
        System.out.println(c);

        System.out.println("");

        //type-3
        System.out.println("Integer type: ");
        byte d=126;
        System.out.println("Byte type: "+d);
        d++;
        System.out.println("Byte type: "+d);
        d++;
        System.out.println("Byte type: "+d);
        d++;
        System.out.println("Byte type: "+d);

        //type-4
        short e=32767;
        System.out.println("Short type: "+e);
        System.out.println("Short type: "+(++e));
        //type-5
        int i=2147483647 ;
        System.out.println("Integer type: "+i);
        System.out.println("Integer type: "+(++i));

        //type-6
        long l=9223372036854775807L;
        System.out.println("Long type: "+l);
        System.out.println("Long type: "+(++l));

        System.out.println("Float point");
        //type-7
        float f=3.14f;
        System.out.println("Float type: "+f);
        System.out.println("Float type: "+(++f));

        //type-8
        double g=23.13;
        System.out.println("Double type: "+g);
        System.out.println("Double type: "+(++g));

    }
}
