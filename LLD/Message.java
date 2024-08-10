class Example{
    void message(){
        System.out.println("Hello World, I am Abha");
    }
}
public class Message {
    public static void main(String[] args) {
        try{
            Class c=Class.forName("Example");
            Example s=(Example) c.newInstance();
            s.message();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
