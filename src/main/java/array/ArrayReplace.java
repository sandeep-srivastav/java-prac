package array;

public class ArrayReplace {

    public void replaceElementIntegerArray(int[] intArray, int replaceIndex){
        int length = intArray.length;
        for(int i=0; i<length; i++) {
            System.out.println(intArray[i]);
        }

        System.out.println();
        System.out.println();
        System.out.println();

        for(int k=0; k<replaceIndex; k++){
            rotate(intArray);
        }
        for(int i=0; i<length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public void rotate(int[] intArray){
        int length = intArray.length; int tem = 0;


        for(int i=0; i<length; i++){
            for(int j=i; j<length; j++){
                tem = intArray[i];
                intArray[i] = intArray[j];
                intArray[j] = tem;
            }

        }

    }

    public void sorting(){
        int[] intArray = {9,5,3,99,12,1,0,5,7,88};
        int length = intArray.length;
        int[] temp = new int[length];
        for(int i=0; i<length; i++) {
            System.out.println(intArray[i]);
        }
        int tem=0;
        for(int i=0; i<length; i++){
            for(int j=i; j<length; j++){
                if(intArray[i] > intArray[j]){
                    tem = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = tem;
                }
            }

        }
        System.out.println();
        System.out.println();
        System.out.println();
        for(int i=0; i<length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void main(String[] args) {
        ArrayReplace arrayReplace = new ArrayReplace();
        arrayReplace.replaceElementIntegerArray(new int[]{1, 2, 3, 4, 5, 6}, 3);

        //arrayReplace.sorting();
    }

}
