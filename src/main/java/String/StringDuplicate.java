package String;

import java.util.*;

public class StringDuplicate {

    public String removeDuplicate(String duplicateStr){
        int length = duplicateStr.length();
        System.out.println("duplicate string --> " + duplicateStr);
        List<Character> duplicateList = new ArrayList<>();
        //duplicateList.add(duplicateStr);
        for(int i=0; i<length; i++){
            duplicateList.add(duplicateStr.charAt(i));
        }
        Set<List> charSet = new HashSet<>();
        charSet.add(duplicateList);
        System.out.println(charSet);
        return null;
    }

    public static void main(String[] args) {
        StringDuplicate stringDuplicate = new StringDuplicate();
        stringDuplicate.removeDuplicate("saaaandddeeeppppp");
    }
}
