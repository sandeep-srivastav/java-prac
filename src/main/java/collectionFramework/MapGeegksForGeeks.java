package collectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapGeegksForGeeks {

    /*
    Q1: Given a map in Java, the task is to find out the entry in this map with the highest key.
     */

    public HashMap<String, Integer> mapGforGOne(HashMap<String, Integer> globalHasMapObj){

        int sizeOfMap = globalHasMapObj.size();
        int valueArray[] = new int[sizeOfMap]; int i=0;
        Set<HashMap.Entry<String, Integer>> localHashMap1 = globalHasMapObj.entrySet();
        for (HashMap.Entry<String, Integer> localHashMap : globalHasMapObj.entrySet()) {
            valueArray[i] = localHashMap.getValue();
            i++;
        }
        int maxValue = valueArray[0];
        System.out.println(maxValue);
        for(int arr=0; arr<valueArray.length; arr++){
            if(valueArray[arr] > maxValue){
                maxValue = valueArray[arr];
            }
        }
        System.out.println(maxValue);
        Iterator<HashMap.Entry<String, Integer>> mapIterator = localHashMap1.iterator();
        while (mapIterator.hasNext()){
            HashMap.Entry<String, Integer> hashmapIterator = mapIterator.next();
            if(maxValue == hashmapIterator.getValue()){
                System.out.println("The key which has max value in the map is --> " + hashmapIterator.getKey() +
                        " and value is --> " + hashmapIterator.getValue());
            }
        }
        return globalHasMapObj;
    }

    public static void main(String[] args) {
        MapGeegksForGeeks mapGeegksForGeeks = new MapGeegksForGeeks();

        HashMap<String, Integer> localHashMap = new HashMap<String, Integer>();

        localHashMap.put("a", 99);
        localHashMap.put("b", 33);
        localHashMap.put("c", 2);
        localHashMap.put("d", 112);

        mapGeegksForGeeks.mapGforGOne(localHashMap);
    }
}
