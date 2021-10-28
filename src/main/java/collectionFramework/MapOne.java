package collectionFramework;

import java.util.HashMap;
//Coding Bat
public class MapOne {

    /*public HashMap<String, String> mapBully(HashMap<String, String> localHashMap){

        for(int i=0; i<localHashMap.size(); i++){

        }

        for (HashMap.Entry<String, String> hashMap : localHashMap.entrySet()) {

        }

    }

    public static void main(String[] args) {

    }*/

    public HashMap<String, String> mapBully(HashMap<String, String> localHashMap){

        if(localHashMap.containsKey("a")){
            localHashMap.put("b", localHashMap.get("a"));
            localHashMap.put("a", "");
        }

        return localHashMap;
    }

    public HashMap<String, String> mapShare(HashMap<String, String> localHashMap){

        if(localHashMap.containsKey("a") && localHashMap.containsKey("b")){
            localHashMap.put("b", localHashMap.get("a"));
            localHashMap.remove("c"); localHashMap.remove("d");
        }

        return localHashMap;
    }

    public HashMap<String, String> mapAppend(HashMap<String, String> localHashMap){

        if(localHashMap.containsKey("a")){
            localHashMap.put("ab", localHashMap.get("a")+localHashMap.get("b"));
        }
        return localHashMap;
    }

    public static void main(String[] args) {
        MapOne mapOne = new MapOne();
        HashMap<String, String> localHashMap = new HashMap<String, String>();

        localHashMap.put("a", "Sandeep");
        localHashMap.put("b", "33");
        localHashMap.put("c", "Lucknow");
        localHashMap.put("d", "8698898892");

        HashMap<String, String> localHashMap1 = new HashMap<String, String>();
        localHashMap1.put("a", "Sandeep");
        localHashMap1.put("b", "33");
        localHashMap1.put("c", "Lucknow");
        localHashMap1.put("d", "8698898892");


        HashMap<String, String> localHashMap2 = new HashMap<String, String>();
        localHashMap2.put("c", "Lucknow");
        localHashMap2.put("d", "8698898892");

        HashMap<String, String> localHashMap4 = new HashMap<String, String>();
        localHashMap4.put("a", "Sandeep");
        localHashMap4.put("b", "33");
        localHashMap4.put("c", "Lucknow");
        localHashMap4.put("d", "8698898892");

        for (HashMap.Entry<String, String> hashMap : localHashMap.entrySet()) {
            System.out.println(hashMap);
        }
        System.out.println("-----------------------");
        localHashMap = mapOne.mapBully(localHashMap);
        for (HashMap.Entry<String, String> hashMap : localHashMap.entrySet()) {
            System.out.println(hashMap);
        }
        System.out.println("-----------------------");
        localHashMap1 = mapOne.mapShare(localHashMap1);
        for (HashMap.Entry<String, String> hashMap : localHashMap1.entrySet()) {
            System.out.println(hashMap);
        }

        System.out.println("---------mapAppend without a and b--------------");
        localHashMap2 = mapOne.mapAppend(localHashMap2);
        for (HashMap.Entry<String, String> hashMap : localHashMap2.entrySet()) {
            System.out.println(hashMap);
        }

        System.out.println("------- mapAppend ---------");
        localHashMap4 = mapOne.mapAppend(localHashMap4);
        for (HashMap.Entry<String, String> hashMap : localHashMap4.entrySet()) {
            System.out.println(hashMap);
        }
    }
}
