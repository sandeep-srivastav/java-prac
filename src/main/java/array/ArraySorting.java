package array;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
Sorting the array
1. Sorting of a numeric array
2. Sorting of a String array
 */
public class ArraySorting {



    public int[] ascendingNumericSort(int [] numericArray){
        System.out.println("Unsorted Numeric Array --> ");
        for(int i=0; i< numericArray.length; i++){
            System.out.println(numericArray[i]);
        }

        /*
        Ascending order sorting
         */
        int temp=0;
        for(int i=0; i< numericArray.length; i++){
            for(int j=0; j< numericArray.length; j++){
                if(numericArray[i] < numericArray[j]){
                    temp = numericArray[i];
                    numericArray[i] = numericArray[j];
                    numericArray[j] = temp;
                }
            }
        }
        System.out.println("Ascending Sort of the array !!! ");
        for (int i=0; i<numericArray.length; i++){
            System.out.println(numericArray[i]);
        }
        return numericArray;
    }

    public int[] descendingNumericSort(int [] numericArray){
        System.out.println("Unsorted Numeric Array --> ");
        for(int i=0; i< numericArray.length; i++){
            System.out.println(numericArray[i]);
        }

        /*
        Ascending order sorting
         */
        int temp=0;
        for(int i=0; i< numericArray.length; i++){
            for(int j=0; j< numericArray.length; j++){
                if(numericArray[i] > numericArray[j]){
                    temp = numericArray[i];
                    numericArray[i] = numericArray[j];
                    numericArray[j] = temp;
                }
            }
        }
        System.out.println("Descending Sort of the array !!! ");
        for (int i=0; i<numericArray.length; i++){
            System.out.println(numericArray[i]);
        }
        return numericArray;
    }

    public String[] stringSort(String [] strArray){

        for(int i = 0; i<strArray.length; i++) {
            for (int j = i+1; j<strArray.length; j++) {
                if(strArray[i].compareTo(strArray[j])>0) {
                    String temp = strArray[i];
                    strArray[i] = strArray[j];
                    strArray[j] = temp;
                }
            }
        }
        Arrays.sort(strArray);
        return strArray;
    }

    public static void main(String[] args) {

        ArraySorting arraySorting = new ArraySorting();
        int [] numArray = new int[]{10, 8, 20, 6, 44, 76, 1, 99, 55, 13};

        String [] strArray = new String[]{"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

        //arraySorting.ascendingNumericSort(numArray);
        //arraySorting.descendingNumericSort(numArray);

        for(int i=0; i<arraySorting.stringSort(strArray).length; i++){
            System.out.println(arraySorting.stringSort(strArray)[i]);
        }
    }
}
