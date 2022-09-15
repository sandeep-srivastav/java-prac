package collectionFramework.list;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CompareMap {

    public void compareTwoMapsUsingEntrySet(Map<String, String> mapOne, Map<String, String> mapTwo){

        Set<Map.Entry<String, String>> setOne = mapOne.entrySet();

        for (Map.Entry<String, String> entrySetOne : setOne) {
            //System.out.println(entrySetOne.getKey() + " -- " + entrySetOne.getValue());
        }



        Set<String> mapOneKeySet = mapOne.keySet();
        Set<String> mapTwoKeySet = mapTwo.keySet();

        if(mapOneKeySet.equals(mapTwoKeySet)){
            System.out.println(" keys are equal !!!");

        }

        mapOne.forEach((X, Y) -> System.out.println(X+ " -- " +Y));

        mapOne.forEach((X, Y) -> {
            if(mapTwo.get(X).equals(Y)){
                System.out.println("Values are equal");
            }else
                System.out.println("Values are NOT equal");
        });
    }

    public static void main(String[] args) {
        CompareMap compareMap = new CompareMap();
        Map<String, String> mapOne = new HashMap<>();
        Map<String, String> mapTwo = new HashMap<>();

        mapOne.put("Name", "Akshay");
        mapOne.put("Address", "Bina");
        mapOne.put("Phone", "Chintu");

        // Add Entry to map
        mapTwo.put("Name", "Akshay");
        mapTwo.put("Address", "Bina");
        mapTwo.put("Phone", "Chintu");

        compareMap.compareTwoMapsUsingEntrySet(mapOne, mapTwo);
    }
}
