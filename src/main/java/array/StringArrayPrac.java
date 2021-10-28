package array;

public class StringArrayPrac {

    public static void main(String[] args) {

        String [] stringArray = {"Cat", "Mat", "Bat", "Rat", "Cat", "Mat", "Bat", "Rat", "Cat", "Mat", "Bat", "Rat",
                "Cat", "Mat", "Bat", "Rat", "Cat", "Mat", "Bat", "Rat", "Cat", "Mat", "Bat", "Rat", "Cat", "Mat", "Bat", "Rat",
                "Cat", "Mat", "Bat", "Rat", "Cat", "Mat", "Bat", "Rat", "Cat", "Mat", "Bat", "Rat"};

        String stringToFind = "CAT";
        int j=0;
        for(int i=0; i< stringArray.length; i++){
            if(stringArray[i].equalsIgnoreCase(stringToFind)){
                j++;
            }
        }
        System.out.println(j);
    }

    String a = "sandy";

    public void abc(){
        a = "abcd";
    }
}
