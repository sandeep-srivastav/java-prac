package collectionFramework.list;

import java.util.ArrayList;

public class ListOperation {

    ListPrac listPraclocal = new ListPrac();
    ArrayList<String> arrayList = new ArrayList<>();


    public void check(){
        listPraclocal.setLocalList(arrayList);
        arrayList = listPraclocal.getLocalList();
        System.out.println("Size is  --> "+ arrayList.size());
        listPraclocal.listOperation(arrayList);
        //listPraclocal.getStringType(arrayList);
        ArrayList<Object> arrayList = new ArrayList<>();

    }

    public static void main(String[] args) {
        ListPrac listPrac = new ListPrac();

        ListOperation listOperation = new ListOperation();
        listOperation.check();

    }
}
