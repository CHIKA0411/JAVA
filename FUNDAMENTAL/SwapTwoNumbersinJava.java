public class SwapTwoNumbersinJava {
    static void swapTwoNumbersinJava(int a, int b) {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("The two numbers in Java are : a "+a+" b "+b);
    }
    public static void main(String[] args) {
        int a,b;
        a=5;
        b=4;
        System.out.println("The two numbers in Java are : a "+a+" b "+b);
        swapTwoNumbersinJava(a,b);
    }
}
