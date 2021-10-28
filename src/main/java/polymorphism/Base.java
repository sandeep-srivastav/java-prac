package polymorphism;

public class Base {

    public static void staticMethodToBeOveridden(){
        System.out.println("I am base class static method !!!");
    }

    public  void nonstaticMethodToBeOveridden(){
        System.out.println("I am base class non static method !!!");
    }

    protected void check(){
        System.out.println("Just checking !!!");
    }
}
