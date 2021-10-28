package collectionFramework;

import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapPrac {

    private Map<String, String> mapObject = new HashMap<>();

    public void setValueInMap() {
        mapObject.put("Name", "Sandeep");
        mapObject.put("Age", "33");
        mapObject.put("Address", "Lucknow");
        mapObject.put("Phone", "8698898892");
    }

    /*
    For reading the Map we can use 2 Map methods 1. KeySet() and 2. EntrySet()
    KeySet() -- it displays the view of all the keys which we can store in the Set of key and
    then using for each loop we can traverse and print all the keys and values of the Map

    Entryset() In this method the view of the entire Map.
    Then we can use either Iterator or a For Each loop
    In both the case we will have to create a new Entry<> object to and with that entry object we can use getKey() and getValue() option.
     */
    public void readValureFromMap(){
        Set<String> set = mapObject.keySet();

        System.out.println("Using For Each loop and Keyset() method !!! ");
        for (String key : set) {
            System.out.println("The key is --> "+ key + "  and value is --> " + mapObject.get(key));
        }

        System.out.println("Using Iterator Interface loop and entryset() method !!! ");

        Set<Map.Entry<String, String>> entrySets = mapObject.entrySet();
        Iterator<Map.Entry<String, String>> setIterator = entrySets.iterator();

        while (setIterator.hasNext()){
            Map.Entry<String, String> valuesOfMap = setIterator.next();
            System.out.println("The key is --> "+ valuesOfMap.getKey() + "  and value is --> " + valuesOfMap.getValue());
        }

        System.out.println("Using For-Each Interface loop and entryset() method !!! ");

        Set<Map.Entry<String, String>> setOfMap = mapObject.entrySet();

        for (Map.Entry<String, String> valuesOfMap: setOfMap) {
            System.out.println("The key is --> "+ valuesOfMap.getKey() + "  and value is --> " + valuesOfMap.getValue());
        }
    }

    public static void main(String[] args) {
        MapPrac mapPrac = new MapPrac();
        mapPrac.setValueInMap();
        //mapPrac.readValureFromMap();
        mapPrac.mapEntryUsingKeySet();
    }


    public void checkMap(){

        Set<Map.Entry<String, String>> entrySet = mapObject.entrySet();
        for (Map.Entry<String, String> traverseMap : entrySet) {
            traverseMap.getKey();
            traverseMap.getValue();
        }
    }


    public void mapIterUsingEntrySet(){
        Set<Map.Entry<String, String>> mapSet = mapObject.entrySet();
        for (Map.Entry<String, String> mapEntry : mapSet) {
            System.out.println("key is --> " + mapEntry.getKey() + "  and the value is --> " + mapEntry.getValue());
        }
    }

    public void mapEntryUsingKeySet(){
        Set<String> keySet = mapObject.keySet();
        for (String key: keySet) {
            System.out.println("key is --> " + key + "  and the value is --> " + mapObject.get(key));
        }
    }

}
