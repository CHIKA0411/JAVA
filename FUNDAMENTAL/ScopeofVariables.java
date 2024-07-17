public class ScopeofVariables {
    //a.member Varible(Class level Scope)
    int a=19;
    int y;

    public void method1(int y)
    {
        //b.Local variable (Method level scope)
        ScopeofVariables s=new ScopeofVariables();
        this.y=20;
        System.out.println("Method level scope: "+this.y);

    }
    public static void main(String[] args) {
        ScopeofVariables s=new ScopeofVariables();
        s.method1(5);
        System.out.println("Class level Scope : "+s.a);
        //c.Loop Variables (Block Scope)
       System.out.println("Block Scope : ");
        for (int x = 0; x < 4; x++)
        {
            System.out.println(x);
        }



    }
}
