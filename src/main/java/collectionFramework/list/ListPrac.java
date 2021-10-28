package collectionFramework.list;

import java.util.ArrayList;

/*
Question: Given a collectionFramework.list of strings, write a method that deletes from the collectionFramework.list
the string that has minimum length and the string that has maximum length.
 */
public class ListPrac {

    private ArrayList<String> localList = new ArrayList<String>();

    public ArrayList<String> getLocalList() {
        return localList;
    }

    public void setLocalList(ArrayList<String> globalList) {

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
/*        localList.add("abc123");
        localList.add("efg456");
        localList.add("hij678");
        localList.add("Persistent123456");*/
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

        this.localList = globalList;
    }

    public void listOperation(ArrayList<String> arrayList){
        setLocalList(arrayList);

        //Smoke Test : To check if the collectionFramework.list is empty or not
        if(getLocalList().size() != 0){
            int [] intArray = new int[getLocalList().size()];

            for(int i=0; i < getLocalList().size(); i++){

                System.out.println("Length of " + i + " = " + getLocalList().get(i).length() + " " + getLocalList().get(i));
                intArray[i] = getLocalList().get(i).length();
            }
            int maxLength = 0, minLength =0, maxPosition=0,  minPosition=0;

            if(intArray.length != 0){
                maxLength = intArray[0]; minLength = intArray[0];
            }


            for(int i=0; i<intArray.length; i++){
                if(intArray[i] > maxLength){
                    maxLength = intArray[i]; maxPosition = i;

                }
                if(intArray[i] < minLength){
                    minLength = intArray[i]; minPosition = i;
                }
            }

            System.out.println("minLength = " + minLength +  " and minPosition = " + minPosition
                    + " maxLength = " + maxLength + " and maxPosition = " + maxPosition);

            System.out.println("String at min position " + getLocalList().get(minPosition) + "   and   "
                    + "String at max position --> " + getLocalList().get(maxPosition));

            System.out.println("Size of the collectionFramework.list is --> " + getLocalList().size());

        /*
        Covering 4 TC's
        1. The collectionFramework.list has only 1 element
        2. The collectionFramework.list has min at position 1 and max at position 2 when there are only 2 elements in the collectionFramework.list
        3. The collectionFramework.list has max as position 1 and min at position 2 when there are only 2 elements in the collectionFramework.list
        4. The collectionFramework.list has min at position 1 and max at position 2 when there are more than 2 elements in the collectionFramework.list
        5. The collectionFramework.list has max as position 1 and min at position 2 when there are more than 2 elements in the collectionFramework.list
        6. The size of the collectionFramework.list is more than 3 and the min position is greater than max position
        7. The size of the collectionFramework.list is more than 3 and the max position is greater than min position
         */
        /*
        Covering Smoke Test when the size of the collectionFramework.list is NULL
         */
            if(getLocalList().size() == 1){
                getLocalList().remove(0);
            } else if (getLocalList().size() ==2 && minPosition == 0 && maxPosition == 1) {
                getLocalList().remove(minPosition);
                getLocalList().remove(getLocalList().size()-1);
            } else if(getLocalList().size() ==2 && minPosition == 1 && maxPosition == 0 ){
                getLocalList().remove(maxPosition);
                getLocalList().remove(arrayList.size()-1);
            } else if( getLocalList().size() > 2 && minPosition == 0 && maxPosition == 1) {
                getLocalList().remove(minPosition);
                getLocalList().remove(maxPosition-1);
            } else if( getLocalList().size() > 2 && minPosition == 1 && maxPosition == 0 ) {
                getLocalList().remove(maxPosition);
                getLocalList().remove(minPosition-1);
            } else if( getLocalList().size() > 3 && minPosition < maxPosition ){
                getLocalList().remove(minPosition);
                getLocalList().remove(maxPosition -1);
            } else if( getLocalList().size() > 3 && minPosition > maxPosition ) {
                getLocalList().remove(maxPosition);
                getLocalList().remove( minPosition - 1);
            }

            for(int i=0; i < arrayList.size(); i++){

                System.out.println("List now contains --> " + i + " = " + getLocalList().get(i));
                intArray[i] = getLocalList().get(i).length();
            }
        } else
            System.out.println("No Operation can be performed on empty List !!!");

    }

    public void getStringType(ArrayList<String> arrayList){

        setLocalList(arrayList);
        int numeric=0; int nonNumeric=0, alphaNum=0;
        for (String str: getLocalList()) {
            if(str.matches("^[a-z/A-Z]*$")){
                nonNumeric ++;
            }else if(str.matches("^[0-9]*$")){
                numeric ++;
            } else if(str.matches("^[a-z/A-Z/0-9]*$")){
                alphaNum ++;
            }
        }

        System.out.println("Numeric String in the collectionFramework.list -->   " + numeric);
        System.out.println("Non Numeric String in the collectionFramework.list -->   " + nonNumeric);
        System.out.println("Alpha Numeric String in the collectionFramework.list -->   " + alphaNum);
    }

    public static void main(String[] args) {

        ListPrac listPrac = new ListPrac();
        listPrac.listOperation(listPrac.localList);
        listPrac.getStringType(listPrac.localList);
    }
}
