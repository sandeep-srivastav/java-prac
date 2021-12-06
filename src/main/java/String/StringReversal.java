package String;

import java.util.ArrayList;
import java.util.List;

/*
Question 1.
Input : [Hello, Welcome, Java, Selenium, String]
Output : [oellH, eelcomW, aavJ, meleniuS, gtrinS]

Question 2 : Do the above and remove any string starting with Character "S"
 */
public class StringReversal {

    public String [] question_One(String [] value){

        String[] reversedList = new String[value.length];
        String temp=""; String [] tempList = new String[2];
        for(int i=0; i< value.length; i++){
            temp = value[i];
            tempList[0] = String.valueOf(temp.charAt(0));
            tempList[1] = temp.substring(1, temp.length());
            String reversed = tempList[1].concat(tempList[0]);
            reversedList[i] = reversed;
            System.out.println(reversedList[i] );
        }

        return  reversedList;
    }

    public String[] question_two(String[] value){

        List<String> anotherList = new ArrayList<>();
        for(int i=0; i< value.length; i++){
            //char firstChar = value[i].charAt(0);
            if(value[i].charAt(0) != 'S'){
                anotherList.add(value[i]);
            }
        }
        String[] reversedList = new String[anotherList.size()];
        String temp=""; String [] tempList = new String[2];
        for(int i=0; i< anotherList.size(); i++){
            temp = anotherList.get(i);
            tempList[0] = String.valueOf(temp.charAt(0));
            tempList[1] = temp.substring(1, temp.length());
            String reversed = tempList[1].concat(tempList[0]);
            reversedList[i] = reversed;
            System.out.println(reversedList[i] );
        }
        return null;
    }

    public static void main(String[] args) {
        StringReversal stringReversal = new StringReversal();
        //stringReversal.question_One(new String[]{"Hello", "Welcome", "Java", "Selenium", "String"});
        stringReversal.question_two(new String[]{"Selenium", "Hello", "Welcome", "Java", "String"});
    }
}
