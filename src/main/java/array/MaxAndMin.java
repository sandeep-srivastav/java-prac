package array;

import java.util.Arrays;

/*
Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.
 */
public class MaxAndMin {

    public void maxAndMinNum(int [] intArray){

        int size = intArray.length;
        Arrays.sort(intArray);
        System.out.println("Max number is --> " + intArray[size-1]);
        System.out.println("Min number is --> " + intArray[0]);

    }

    public static void main(String[] args) {
        MaxAndMin maxAndMin = new MaxAndMin();
        maxAndMin.maxAndMinNum(new int[]{22,3,6,44,8,92, 39, 37, 67, 71, 84, 50, 75, 68});
    }
}
