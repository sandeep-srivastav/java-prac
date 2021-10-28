package collectionFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorPrac {

    public static void main(String args[])
    {
        // Create a link collectionFramework.list which stores integer elements
        List<Integer> l = new LinkedList<Integer>();

        // Now add elements to the Link List
        l.add(2);
        l.add(3);
        l.add(4);

        // Make another Link List which stores integer elements
        List<Integer> s=new LinkedList<Integer>();
        s.add(7);
        s.add(8);
        s.add(9);

        Iterator<Integer> itr = l.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println(" output --> " +l.hashCode());
        // Iterator to iterate over a Link List
        for (Iterator<Integer> itr1 = l.iterator(); itr1.hasNext(); )
        {
            for (Iterator<Integer> itr2=s.iterator(); itr2.hasNext(); )
            {
                System.out.println(itr1.next() + "--" + itr2.next());
                if (itr1.next() < itr2.next())
                {
                    System.out.println(itr1.next() + "--" + itr2.next());
                    System.out.println("----- " + itr1.next());
                }
            }
        }
    }
}
