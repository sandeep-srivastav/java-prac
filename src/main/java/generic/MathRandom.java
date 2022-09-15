package generic;

public class MathRandom {

    int[] amountArray;

    public int[] amount(String typeOfRefund, int count, long amount) {
        amountArray = new int[count];
        switch (typeOfRefund){
            case "equal":
                for(int i=0; i<count; i++){
                    amountArray[i] = (int) (amount/count);
                }
                break;
            case "dynamic":
                for(int i=0; i<count; i++){
                    amountArray[i] = getRandomInt(0, 200);
                }
                break;
        }
        System.out.println("Generating amount for --> "+ typeOfRefund );
        for(int i=0; i<count; i++){
            System.out.println(amountArray[i]);
        }
        return amountArray;
    }

    public int getRandomInt(int min, int max) {
        min = (int) Math.ceil(min);
        max = (int) Math.floor(max);
        return (int) Math.floor(Math.random() * (max - min) + min);
    }

    public static void main(String[] args) {
        MathRandom mathRandom = new MathRandom();
        mathRandom.amount("equal", 4, 200);
        mathRandom.amount("dynamic", 4, 200);
        mathRandom.getRandomInt(0, 200);
    }
}
