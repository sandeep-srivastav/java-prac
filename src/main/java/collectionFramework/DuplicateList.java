package collectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateList {

    public static void main(String[] args) {
        DuplicateList duplicateList = new DuplicateList();
        ArrayList<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Three");
        list.add("Five");
        list.add("Five");

        System.out.println("Using another collectionFramework.list !!! ");
        for (String listValue : duplicateList.removeDuplicateUsingNewList(list)) {
            System.out.println(listValue);
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Using HASHSET class !!! ");

        for (String listValue : duplicateList.removeDuplicateUsingSet(list)) {
            System.out.println(listValue);
        }
    }

    public ArrayList<String> removeDuplicateUsingNewList(ArrayList<String> arrayList){

        ArrayList<String> newArrayList = new ArrayList<>();

        for (String listValue: arrayList) {

            if(!newArrayList.contains(listValue)){
                newArrayList.add(listValue);
            }
        }
        return newArrayList;

    }

    public ArrayList<String> removeDuplicateUsingSet(ArrayList<String> arrayList){
        Set<String> newSet = new HashSet<>();
        newSet.addAll(arrayList);
        arrayList.clear();
        arrayList.addAll(newSet);
        return arrayList;
    }


}
