package String;

public class StringBuilderExample {


    public String removeCharacterFromString(String value){
        StringBuilder stringBuilder = new StringBuilder(value);
        System.out.println("Length of the string --> "+ value.length());
        stringBuilder.deleteCharAt(value.indexOf("."));
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Sandeep");
/*        stringBuilder.append(" Srivastav");
        System.out.println(stringBuilder);

        String s= "Sandy";
        s = s.concat(" srivastav");
        System.out.println(s);*/
        StringBuilderExample stringBuilderExample = new StringBuilderExample();
        String amount = "123456.789";
        System.out.println("Check this --> " + stringBuilderExample.removeCharacterFromString(amount));
    }
}
