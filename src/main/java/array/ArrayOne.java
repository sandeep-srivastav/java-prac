package array;

/*
Created by Sandeep

Method 1: Insert into array and calculate length
Method 2: Adding data in the array in run time
 */
public class ArrayOne {

    int numericArray [] = new int[] {1,2,3,4,5,6,7,8,9};
    int runtimeArray [] = new int[19];

    public void firstArray(){
        System.out.println("Length of the array is " + numericArray.length);
    }

    public void secondArray(){
        int a=20;
        for(int i=0; i<runtimeArray.length; i++){
            runtimeArray [i] = a;
            a = a+20;
        }

        System.out.println("");
        System.out.println("");
        System.out.println("Lenght of the array is " + runtimeArray.length);
        System.out.println("");
        System.out.println("");
        for (int j=0; j<runtimeArray.length; j++)
        {
            System.out.println("Value in the array --> " + runtimeArray[j]);
        }
    }

    public static void main(String[] args) {
        ArrayOne arrayOne = new ArrayOne();
        arrayOne.firstArray();
        arrayOne.secondArray();
    }
}
