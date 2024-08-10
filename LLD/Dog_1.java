public class Dog_1 {


        // the class Dog has two fields

        String dogName;
        int dogAge;

        // the class Dog has one constructor
        Dog_1(String name, int age){
            this.dogName = name;
            this.dogAge= age;
        }

    // driver class
    public static void main(String[] args)
    {
        // creating objects of the class Dog

        Dog_1 ob1=new Dog_1("Bravo",4);
        Dog_1 ob2=new Dog_1("Oliver",5);
        // accessing the object data through reference

        System.out.println(ob1.dogName + ", " + ob1.dogAge);

        System.out.println(ob2.dogName + ", " + ob2.dogAge);

    }
}
