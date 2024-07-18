public class ReadInputFromConsole_4 {
    public static void main(String[] args) {
        if(args.length >0){
            System.out.println("The command line arguments are :");
            for(String arg : args){
                System.out.println(arg);
            }

        }
        else{
            System.out.println("Please enter a command line argument");
        }
    }
}
