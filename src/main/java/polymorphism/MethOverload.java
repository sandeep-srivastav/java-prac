package polymorphism;

public class MethOverload {

    private String function()
    {
        return ("GFG");
    }
    public final static String function(int data)
    {
        return ("GeeksforGeeks");
    }

    public int add(int a){ return a+a;}

    public long add(long l, long ll){ return  l + ll;}



    public static void main(String[] args)
    {
        MethOverload obj = new MethOverload();
        System.out.println(obj.function());
    }
}
