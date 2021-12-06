package array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateArray {

    Object [] localObjectArray;
    public DuplicateArray(Object [] globalObjectArray){
        this.localObjectArray = globalObjectArray;
    }
    public void getDuplicate(){
        Map<Object, Integer> duplicates = new HashMap<>();
        int count =1;
        for (Object value: localObjectArray) {
            if(duplicates.containsKey(value)){
                duplicates.put(value, duplicates.get(value)+1);
            } else {
                duplicates.put(value, 1);
            }
        }

        Set<Map.Entry<Object, Integer>> mapEntry = duplicates.entrySet();
        for (Map.Entry<Object, Integer> value : mapEntry) {
            System.out.println("Number is --> " + value.getKey() + " and count is --> " + value.getValue());
        }
    }

    public static void main(String[] args) {
        //DuplicateArray duplicateArrayInt = new DuplicateArray(new Object[]{22,3,6,44,8,92, 39, 37, 67, 71, 84, 50, 75, 68, 22});
        //duplicateArrayInt.getDuplicate();
//{"cat", "mat", "sat", "bat", "rat", "tat", "mat", "sat", "bat", "rat", "tat"}
        DuplicateArray duplicateArrayString = new DuplicateArray(new Object[]{"cat", "cat", "tat", "tat"});
        duplicateArrayString.getDuplicate();
    }
}
