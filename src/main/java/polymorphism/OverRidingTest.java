package polymorphism;

public class OverRidingTest {

    public static void main(String[] args) {
        Base base = new Derived();
        base.staticMethodToBeOveridden();
        base.nonstaticMethodToBeOveridden();
        base.check();
    }
}
