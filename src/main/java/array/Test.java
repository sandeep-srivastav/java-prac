package array;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {

    int a =20;

    public int add (int b){
        return a + b + 20;
    }

    public static void main(String[] args)
    {
        /*Object obj = new String("GeeksForGeeks");
        Class c = obj.getClass();
        Test test = new Test();
        c = test.getClass();
        System.out.println("What will be the result in this case --> " + c.getName());

        Method method[] = c.getDeclaredMethods();
        for (Method meth: method) {
            System.out.println(meth);
        }

        Field field[] = c.getDeclaredFields();
        for (Field f: field) {
            System.out.println("what is this --> " +f);
        }
        System.out.println("Class of Object obj is : "
                + c.getName());

        Week week = Week.SUNDAY;
        System.out.println(week);
*/
        String s = "strawberries";
        System.out.println(s.substring(2,5));
    }
}
