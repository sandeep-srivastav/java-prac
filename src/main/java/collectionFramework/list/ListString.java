package collectionFramework.list;

import java.util.ArrayList;

public class ListString {

    private ArrayList<String> localList = new ArrayList<String>();

    public ArrayList<String> getLocalList() {
        return localList;
    }

    public void setLocalList(ArrayList<String> localList) {
        localList.add("Lucknow");
        localList.add("Mumbai");
        localList.add("Noida");
        localList.add("GurgaonCity");
        localList.add("Bangalore");
        localList.add("HyderabadCity");
        localList.add("Chandigarh");
        localList.add("Amritsar");
        localList.add("Thiruvananthapuram");
        localList.add("Pune");
        localList.add("abc123");
        localList.add("abc123");
        localList.add("abc123");
        localList.add("abc123");
        localList.add("1234567");
        localList.add("12345678901234567890");
        localList.add("1234567890123456789");
        localList.add("123456789012345678");
        localList.add("12345678901234567");
        localList.add("1234567890123456");
        localList.add("123456789012345");
        localList.add("12345678901234");
        localList.add("1234567890123");
        localList.add("123456789012");
        localList.add("12345678901");
        localList.add("1234567890");

        this.localList = localList;
    }

    public void getStringType(ArrayList<String> arrayList){

        setLocalList(arrayList);
        if(arrayList.size() != 0){
            int numeric=0; int nonNumeric=0;
            for (String str: getLocalList()) {
                if(str.matches("^[a-z/A-Z]*$")){
                    numeric ++;
                }else if(str.matches("^[0-9]*$")){
                    nonNumeric ++;
                }
            }
            System.out.println("Numeric String in the collectionFramework.list -->" + numeric);
            System.out.println("Non Numeric String in the collectionFramework.list -->" + nonNumeric);
        }
        else
            System.out.println("No operations can be perfoemed if the size of the collectionFramework.list is 0 !!!");


    }

    public static void main(String[] args) throws Exception{

        ListString listString = new ListString();
        try {
            listString.getStringType(listString.localList);
        } catch (Exception exception){
            System.out.println("The exception is --> " + exception);
        }
    }
}
