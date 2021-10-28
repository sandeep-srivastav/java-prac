package polymorphism;

public class Derived extends Base {

    public static void staticMethodToBeOveridden(){
        System.out.println("I am derived class static method !!!");
    }

    public  void nonstaticMethodToBeOveridden(){
        System.out.println("I am derived class non static method !!!");
    }

    protected void check(){
        System.out.println("Just checking in the base class !!!");
    }
}

