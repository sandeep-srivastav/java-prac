package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteration {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");


        for (String value : list) {
            System.out.println("With the for each loop  " + value);
        }

        int i=0;
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()){
            System.out.println("has next -->" + listIterator.next());
        }

        while (listIterator.hasPrevious()){
            System.out.println("has previous -->" + listIterator.previous());
        }



        List<String> listA = new ArrayList<String>();
        listA.add("Java");
        listA.add("C#");
        listA.add("");
        listA.add("");
        listA.add("Jenkins");
        listA.add("Selenium");


        List<String> listB = new ArrayList<String>();
        listB.add("Maven");
        listB.add("GIT");
        listB.add("POM");
        listB.add("Factory");
        listB.add("Singleton");
        listB.add("Gradle");

        List<List<String>> listOfList = new ArrayList<>();
        listOfList.add(list);
        listOfList.add(listA);
        listOfList.add(listB);

        for (List<String> getListValues : listOfList) {
            System.out.println("Values of the List using FOR EACH LOOP --> " + getListValues);
            System.out.println();
        }

        System.out.println("Values of the List from ListIterator Interface");

        ListIterator listOfListIterator = listOfList.listIterator();
        while (listOfListIterator.hasNext()){
            System.out.println("Values of the List using hasnext method --- " + listOfListIterator.next());
            System.out.println();
        }
        System.out.println("Values of the List from Iterator Interface");

        Iterator<List<String>> iterator = listOfList.iterator();
        while (iterator.hasNext()){
            System.out.println("Values of the List using hasnext method --- " + iterator.next());
            System.out.println();
        }

    }


}
