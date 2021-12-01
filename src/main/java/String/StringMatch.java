package String;

public class StringMatch {

    public static void main(String[] args) {
        String one = "CEBU TRAVEL FUND";
        String two = "CEBU TRAVEL FUND";
        if(one.equalsIgnoreCase(two)){
            System.out.println("Equal Ignore Case");
        }
        if(one.contains(two)){
            System.out.println("Contains ");
        }
    }
}
